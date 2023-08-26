package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AbTesting;

public class AbTest extends BaseTests {
    @Test
    public void AbTest (){
         homePage.clickOnAbtest();
        driver.findElement(By.xpath("//*[contains(text(),'Also known as split testing')]")).getText();

    }
}

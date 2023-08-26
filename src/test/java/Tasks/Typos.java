package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Typos extends BaseTests {
    @Test
    public void Typos () {
         homePage.clickOnTypos();
         driver.findElement(By.xpath("//*[contains(text(),'This example demonstrates a typo being introduced. It does it random')]")).getText();
    }

}

package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class AddRemoveTest extends BaseTests {
    @Test
    public void deletebutton() {

        AddRemovePage addRemovePage = homePage.clickOnAddRemove();
       addRemovePage.clickAddElemet();
       assert  driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).isDisplayed();


    }
}

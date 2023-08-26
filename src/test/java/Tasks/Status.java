package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.Confrimation200;
import pages.Status200;
import pages.StatusPage;

import static org.testng.Assert.assertTrue;

public class Status extends BaseTests {
    @Test
    public void STATUS (){


        StatusPage statusPage = homePage.clickOnStatus();
        Confrimation200 confrimation200 = statusPage.clickOn200();

        String expectedresult = "This page returned a 200 status code.";
        String actualresult = driver.findElement(By.className("example")).getText() ;
        assertTrue(actualresult.contains("This page returned a 200"));



    }

}

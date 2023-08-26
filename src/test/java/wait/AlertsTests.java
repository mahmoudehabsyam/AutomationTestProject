package wait;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptPage;

import static org.testng.Assert.assertTrue;

public class AlertsTests extends BaseTests {
    @Test
    public void testJsAlert(){
       JavaScriptPage javaScriptPage = homePage.clickonJavaScriptlink();
       javaScriptPage.clickonJsAlertButton();
       javaScriptPage.acceptAlert();
       String one = "You successfully clicked an alert" ;
        String two  = javaScriptPage.getResult();
        assertTrue(two.contains("You successfully clicked an alert"));



    }
}

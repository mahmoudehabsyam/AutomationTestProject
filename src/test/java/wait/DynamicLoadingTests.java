package wait;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoading;
import pages.OnePage;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {
    @Test
    public void testDynamicLoading () {
        DynamicLoading dynamicLoading = homePage.clickOnDynamicLoading();
        OnePage onePage = dynamicLoading.clickOnExampleLinkOne();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult,expectedResult);




    }
}

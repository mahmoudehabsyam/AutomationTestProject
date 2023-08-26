package wait;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.Loading;
import pages.exOnePage;

import static org.testng.Assert.assertEquals;

public class LoadingTest extends BaseTests {
    @Test
    public void LoadingTest (){
        Loading loading = homePage.clickOnLoading();
        exOnePage exonepage = loading.Clickexone();
        exonepage.clickStart();
        String actual = exonepage.getHello();
        String expected = "Hello World!";
        assertEquals(actual,expected);


    }
}

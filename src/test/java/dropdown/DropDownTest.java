package dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;

public class DropDownTest extends BaseTests {
    @Test
    public  void  testDropdown(){
        String visibleText = "Option 2";
        DropDownPage dropDownPage = homePage.clickOndropDownLink();
        dropDownPage.selectFromDropDownList(visibleText);
    }

}

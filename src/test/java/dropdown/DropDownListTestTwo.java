package dropdown;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DropTwopage;

public class DropDownListTestTwo extends BaseTests {
    @Test
    public void testDropdownTwo () throws InterruptedException {

        String visibleTextTwo = "Option 1";
        DropTwopage dropTwopage = homePage.clickOnDropTwo();
        dropTwopage.selectFromDropDownListTwo(visibleTextTwo);
        Thread.sleep(5000);
        String visibletextthree = "Option 2";
        dropTwopage.selectFromDropDownListTwo(visibletextthree);
        Thread.sleep(5000);

    }

    }

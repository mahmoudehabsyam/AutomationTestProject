package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
      WebDriver driver;
    Select select ;
    private By dropDownList = By.id("dropdown");
    public DropDownPage (WebDriver driver){
        this.driver =driver ;

    }

    public void  selectFromDropDownList(String visibleText){
        select = new Select((driver.findElement(dropDownList)));
        select.selectByVisibleText(visibleText);



    }



}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropTwopage {
    WebDriver driver ;
    Select select ;
    public DropTwopage(WebDriver driver){
        this.driver =driver;
    }
private By dropDownListTwo = By.id("dropdown");

    public void selectFromDropDownListTwo(String visibleTextTwo){
        select = new Select((driver.findElement(dropDownListTwo)));
        select.selectByVisibleText(visibleTextTwo);



    }






}

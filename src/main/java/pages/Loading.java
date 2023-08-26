package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loading {
    WebDriver driver;
    public Loading(WebDriver driver) {
        this.driver=driver;
    }
     private By exOne = By.linkText("Example 1: Element on page that is hidden");

    public exOnePage Clickexone (){
        driver.findElement(exOne).click();
        return new exOnePage(driver);
    }






}

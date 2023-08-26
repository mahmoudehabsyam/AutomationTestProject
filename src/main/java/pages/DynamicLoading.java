package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoading  {
    WebDriver driver;
    private By exampleonelink = By.xpath("//a[contains(text(),'Example 1')]");
    private By exampletwolink = By.cssSelector("a[href='/dynamic_loading/2']");
    public DynamicLoading(WebDriver driver){
        this.driver =driver ;

    }

    public OnePage clickOnExampleLinkOne (){
        driver.findElement(exampleonelink).click();
        return new OnePage (driver);
    }
    public OnePage clickOnExampleTwoLink (){
        driver.findElement(exampletwolink).click();
        return new OnePage (driver);
    }
}

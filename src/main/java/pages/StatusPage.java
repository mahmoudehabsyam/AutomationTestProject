package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StatusPage {
    WebDriver driver;
    public StatusPage(WebDriver driver){
        this.driver =driver ;

    }
    private By Status200 = By.linkText("200");

    public Confrimation200 clickOn200 () {
        driver.findElement(Status200).click();
        return new Confrimation200(driver);
    }






}

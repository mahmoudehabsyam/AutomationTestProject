package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class exOnePage {
    WebDriver driver;
    WebDriverWait wait ;
    public exOnePage(WebDriver driver) {
        this.driver=driver;
    }
    private By Start = By.xpath("//button[normalize-space()='Start']");
    private By helloWorld = By.cssSelector("#finish h4");

    public void clickStart () {
        driver.findElement(Start).click();
    }

    public String getHello (){
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(helloWorld)));
        return driver.findElement(helloWorld).getText();
    }


}

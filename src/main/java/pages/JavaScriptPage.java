package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptPage {
    WebDriver driver;
    public JavaScriptPage(WebDriver driver){this.driver=driver;

    }

    private By jsAlert = By.xpath("//button[@onclick='jsAlert()']");
    private By jsConfirm = By.xpath("//button[@onclick='jsConfirm()']");
    private By jsPrompt = By.xpath("//button[@onclick='jsPrompt()']");

    private By Result = By.id("result");



    public void clickonJsAlertButton(){
        driver.findElement(jsAlert).click();
    }
    public  void acceptAlert(){
        driver.switchTo().alert().accept();
    }
        public String getResult(){
        String TEXT = driver.findElement(Result).getText();
        return TEXT ;
    }





}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemovePage {
    WebDriver driver;
    public AddRemovePage(WebDriver driver){
        this.driver=driver;
    }
    private By AddElemet  = By.xpath(("//button[@onclick='addElement()']"));
    public void clickAddElemet(){
        driver.findElement(AddElemet).click();
        return ;
    }


}

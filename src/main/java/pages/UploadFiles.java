package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class UploadFiles {
    WebDriver driver;

    public UploadFiles(WebDriver driver) {
        this.driver = driver;
    }
    private By ChooseFileButton = By.id("file-upload");
    private By UploadButton = By.id("file-submit") ;
    public void ChooseFileButton(String path) {
        driver.findElement(ChooseFileButton).sendKeys(path);
    }
    public void UploadButtonClick() {
        driver.findElement(UploadButton).click();
    }
    }



   // public ChooseFileButton clickOnChoosefile () {
      //  driver.findElement(ChooseFileButton).sendKeys("C:\\\\Users\\\\mehab\\\\Music\\\\RSP_profile (16).json");
      //  return new ChooseFileButton(driver);









package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.UploadFiles;

public class Upload extends BaseTests {
    @Test
    public void Upload (){

        UploadFiles uploadFiles = homePage.clickOnUploadFiles();
        uploadFiles.ChooseFileButton("C:\\Users\\mehab\\Music\\RSP_profile (16).json");
        uploadFiles.UploadButtonClick();
        driver.findElement(By.xpath("//*[contains(text(),'File Uploaded!')]")).getText();

       // driver.findElement(By.linkText("File Upload")).click();
      //  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\mehab\\Music\\RSP_profile (16).json");


    }
}

package Tasks;

import Base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Forget extends BaseTests {
    @Test
    public void Forget() {

        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("wrong");
        driver.findElement(By.id("form_submit")).click();
        String one = "Internal Server Error" ;
        String two = driver.findElement(By.xpath("//h1[normalize-space()='Internal Server Error']")).getText();
        assertTrue(two.contains("Internal Server Error"));
       // driver.findElement(By.xpath("//td[text()='Internal Server Error'"));
       // driver.findElement(By.xpath("//h1[normalize-space()='Internal Server Error']")) ;
        driver.findElement(By.xpath("//*[contains(text(),'Internal')]")).getText();
    }
}


package login;


import Base.BaseTests;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test(priority = 2)
    public void testSuccessfulLogin(){


       // driver.findElement(By.linkText("Form Authentication")).click();
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        secureAreaPage.getValidationMessage();
        String actualResult =secureAreaPage.getValidationMessage();
        String expectedResult ="You logged into a secure area";
        assertTrue(actualResult.contains(expectedResult));


       // driver.findElement(By.id("username")).sendKeys("tomsmith");
      //  driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
     //   driver.findElement(By.className("radius")).click();
      //  String expectedresult =" You logged into a secure area";
      //  String actualresult = driver.findElement(By.id("flash")).getText();
      //  assertTrue(actualresult.contains("You logged into a secure area"));
//        driver.findElement(By.linkText("Logout")).click();
//        String ONE = "You logged out of the";
//        String two = driver.findElement(By.id("flash-messages")).getText();
//        assertTrue(two.contains("You logged out of the"));
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.linkText("A/B Testing")).click();
//        String ME  = "Also known as split testing";
//        String you = driver.findElement(By.id("content")).getText();
//        assertTrue(you.contains("Also known as split testing"));
//        driver.get("https://the-internet.herokuapp.com/");
//        driver.findElement(By.linkText("Add/Remove Elements")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
//        driver.findElement(By.className("added-manually")).click();
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();




    }
    @Test(priority = 1)
    public void two(){


        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsssmith");
        loginPage.insertPassword("SuperSecsssretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        secureAreaPage.getValidationMessage();
        String actualResult =secureAreaPage.getValidationMessage();
        String expectedResult ="Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));
}
}

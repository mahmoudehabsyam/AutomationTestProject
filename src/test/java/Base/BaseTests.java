package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;
    public HomePage homePage;


    @BeforeClass
    public void setUp(){
//        WebDriverManager.edgedriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);



    }
  @BeforeMethod
  public void goHome(){
      driver.get("https://the-internet.herokuapp.com/");
  }
   // @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

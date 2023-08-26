package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By StatusTest = By.linkText("Status Codes");

    private By UploadFiles = By.linkText("File Upload");
    private By AbTesting = By.linkText("A/B Testing");

    private By TyposPage = By.linkText("Typos");
    private By AddRemovePage = By.linkText("Add/Remove Elements");

    private By DynamicLoading = By.linkText("Dynamic Loading");
    private By Loading = By.linkText("Dynamic Loading");
    private By dropDownLink = By.linkText("Dropdown");
    private By dropTwolink = By.linkText("Dropdown");

    private By jsAlertLink = By.linkText("JavaScript Alerts");













    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
    public StatusPage clickOnStatus (){
        driver.findElement(StatusTest).click();
        return new StatusPage(driver);

    }
    public UploadFiles clickOnUploadFiles (){
        driver.findElement(UploadFiles).click();
        return new UploadFiles(driver);

    }
    public AbTesting clickOnAbtest(){
        driver.findElement(AbTesting).click();
        return new AbTesting(driver);
    }
    public TyposPage clickOnTypos(){
        driver.findElement(TyposPage).click();
        return new TyposPage(driver);
    }
    public AddRemovePage clickOnAddRemove(){
        driver.findElement(AddRemovePage).click();
        return new AddRemovePage(driver);
    }
    public DynamicLoading clickOnDynamicLoading (){
        driver.findElement(DynamicLoading).click();
        return new DynamicLoading (driver);
    }
    public Loading clickOnLoading (){
        driver.findElement(Loading).click();
        return new Loading (driver);
    }
    public DropDownPage clickOndropDownLink(){
        driver.findElement(dropDownLink).click();
        return new DropDownPage (driver);
    }
    public DropTwopage clickOnDropTwo (){
        driver.findElement(dropTwolink).click();
        return new DropTwopage(driver);
    }

    public JavaScriptPage clickonJavaScriptlink (){
        driver.findElement(jsAlertLink).click();
        return new JavaScriptPage (driver);
    }


}
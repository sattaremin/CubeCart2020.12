package regressionsuit.pageobjectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="username")
    WebElement userNameField;
    @FindBy(id="password")
    WebElement passwordField;
    @FindBy(id="login")
    WebElement loginButton;
    FunctionPage functionPage;
    int timeout=10;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        functionPage=new FunctionPage(driver);
    }
    public void typeUserName(String userName){
        //functionPage.waitUntilElementPresent(userNameField);
        userNameField.sendKeys(userName);
    }
    public void typePassword(String password){
        //functionPage.waitUntilElementPresent(passwordField);
        passwordField.sendKeys(password);
    }
    public void loginButton(){
        loginButton.click();
    }
    public void login(String userName, String password){
        typeUserName(userName);
        typePassword(password);
        loginButton();
    }

}

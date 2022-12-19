package regressionsuit.pageobjectpattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    WebDriver driver;

    FunctionPage functionPage;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        functionPage=new FunctionPage(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Customer List')]")
    WebElement customerListLink;

    @FindBy(xpath = "//a[contains(text(),'Orders')]")
    WebElement ordersLink;

    @FindBy(xpath = "//a[contains(text(),'Newsletters')]")
    WebElement newsLetters;

    @FindBy(xpath = "//li//a[contains(text(),'Mailing List')]")
    WebElement mailingListLink;

    @FindBy(css = "i.fa.fa-sign-out")
    WebElement logOutLink;

    public void clickOnCustomerList(){
        //functionPage.waitUntilElementPresent(customerListLink);
        customerListLink.click();
    }

    public void clickOnOrdersLink(){
        //functionPage.waitUntilElementPresent(ordersLink);
        ordersLink.click();
    }

    public void clickOnNewsLettersLink(){
        //functionPage.waitUntilElementPresent(newsLetters);
        newsLetters.click();
    }

    public void clickOnMailingList(){
        //functionPage.waitUntilElementPresent(mailingListLink);
        mailingListLink.click();
    }

    public void logout(){
        //functionPage.waitUntilElementPresent(logOutLink);
        logOutLink.click();
    }

    public boolean verifyLogin(){
        if (logOutLink.isDisplayed())
            return true;
        else return false;
    }
}

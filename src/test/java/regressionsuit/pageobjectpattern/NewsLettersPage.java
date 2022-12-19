package regressionsuit.pageobjectpattern;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsLettersPage {
    WebDriver driver;
    FunctionPage functionPage;

    public NewsLettersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        functionPage=new FunctionPage(driver);
    }

    @FindBy(linkText = "Create Newsletter")
    WebElement createNewsletterLink;

    @FindBy(id = "email_subject")
    WebElement newsletterSubjectField;

    @FindBy(id = "sender_name")
    WebElement senderNameField;

    @FindBy(id = "sender_email")
    WebElement senderEmailAddressField;

    @FindBy(xpath = "//*[@value=\"Save\"]")
    WebElement saveButton;

    public void createNewsletterPage(){
        createNewsletterLink.click();
        newsletterSubjectField.sendKeys(Faker.instance().book().title());
        senderNameField.sendKeys(functionPage.generateFakeName());
        senderEmailAddressField.sendKeys(functionPage.generateFakeName()+"@gmail.com");
        saveButton.click();
    }




}

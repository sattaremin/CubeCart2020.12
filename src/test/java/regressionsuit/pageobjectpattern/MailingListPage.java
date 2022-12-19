package regressionsuit.pageobjectpattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailingListPage {
    WebDriver driver;
    FunctionPage functionPage;

    public MailingListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        functionPage=new FunctionPage(driver);
    }
    @FindBy(css = ".fa.fa-trash")
    WebElement deleteIcon;

    public void deleteEmail(){
        deleteIcon.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
    }

}

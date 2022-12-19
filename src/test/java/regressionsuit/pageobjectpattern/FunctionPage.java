package regressionsuit.pageobjectpattern;

import com.github.javafaker.Faker;
import com.unitedcoder.configutility.ApplicationConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionPage {
    WebDriver driver;

    int timeout=Integer.parseInt(ApplicationConfig.readConfigProperties("config.properties","timeout"));

    public FunctionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void waitUntilElementPresent(WebElement element){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilAlertPresent(int timeout){
        WebDriverWait wait=new WebDriverWait(driver,timeout);
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public String generateFakeName(){
        String faker=Faker.instance().name().firstName();
        return faker;
    }

    public String generateFakeNumbers(){
        String faker=Faker.instance().number().digit();
        return faker;
    }

}

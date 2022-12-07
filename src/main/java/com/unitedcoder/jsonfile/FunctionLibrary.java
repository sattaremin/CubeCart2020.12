package com.unitedcoder.jsonfile;

import com.unitedcoder.exeltutorial.UiUtility2;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FunctionLibrary {
    public static WebDriver driver;

    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }

    public static void login(LoginUser loginUser) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(loginUser.getName());
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(loginUser.getPassword());
        WebElement login = driver.findElement(By.id("login"));
        login.click();
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void explicitWait(WebElement element, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void logout() {
        WebElement logout = driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();
    }

    public static void closeBrowser() {
        driver.close();
        driver.quit();
    }

    public static boolean addCustomer(Customer customer) {
        WebElement customerLink = driver.findElement(By.linkText("Customer List"));
        customerLink.click();
        //explicitWait(customerLink, 3);
        WebElement addCustomerLink = driver.findElement(By.xpath("//a[contains(text(),\"Add Customer\")]"));
        addCustomerLink.click();
        //explicitWait(addCustomerLink, 3);
        WebElement firstNameField = driver.findElement(By.id("cust-firstname"));
        firstNameField.sendKeys(customer.getFirstName() + getCurrenTimeStamp());
        WebElement lastNameField = driver.findElement(By.id("cust-lastname"));
        lastNameField.sendKeys(customer.getLastName() + getCurrenTimeStamp());
        WebElement email = driver.findElement(By.id("cust-email"));
        email.sendKeys(getCurrenTimeStamp() + customer.getEmail());
        WebElement saveButton = driver.findElement(By.name("save"));
        saveButton.click();
        WebElement successMessage = driver.findElement(By.xpath("//*[contains(text(),'Customer successfully added.')]"));
        if (successMessage.isDisplayed()) {
            System.out.println("Customer Successfully Added");
            return true;
        } else {
            System.out.println("Could not add the customer");
            return false;
        }
    }

    public static boolean addProduct(Product product) {
        driver.findElement(By.linkText("Add Product")).click();
        WebElement productName = driver.findElement(By.id("name"));
        productName.sendKeys(product.getProductName()+getCurrenTimeStamp());
        WebElement manufacturer = driver.findElement(By.id("manufacturer"));
        Select select = new Select(manufacturer);
        select.selectByVisibleText("Puma");
        WebElement productCode = driver.findElement(By.id("product_code"));
        productCode.sendKeys(product.getProductCode()+getCurrenTimeStamp());
        WebElement categoryTabElement = driver.findElement(By.id("tab_category"));
        explicitWait(categoryTabElement, 3);
        categoryTabElement.click();
        WebElement productCategory = driver.findElement(By.xpath(String.format(
                "//*[text()=\"%s\"]//parent::tr/td[@align=\"center\"]",product.getCategory())));
        productCategory.click();
        WebElement saveButton = driver.findElement(By.cssSelector("input[value='Save']"));
        saveButton.click();
        WebElement confirmationMessage = driver.findElement(By.cssSelector("div.success"));
        System.out.println("Confirmation message for add product" + confirmationMessage.getText());
        if (confirmationMessage.isDisplayed()) {
            System.out.println("passed");
            return true;
        } else {
            System.out.println("failed");
            return false;
        }

    }


    public static String getCurrenTimeStamp(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyyMMddHHmmssSS");
        return now.format(formatter);
    }
}

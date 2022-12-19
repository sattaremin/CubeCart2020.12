package regressionsuit.pageobjectpattern;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage {
    WebDriver driver;

    FunctionPage functionPage;

    CustomerPage customerPage;

    DashBoardPage dashBoardPage;

    public OrdersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        functionPage=new FunctionPage(driver);
    }
    //new page
    @FindBy(linkText = "Create Order")
    WebElement createOrderLink;

    //new page
    @FindBy(id = "o_status")
    WebElement orderStatusLink;

    //new page
    @FindBy(id = "tab_order_billing")
    WebElement billingLink;

    @FindBy(id = "sum_name")
    WebElement findCustomerField;

    @FindBy(id = "ajax_first_name")
    WebElement firstNameField;

    @FindBy(id = "ajax_last_name")
    WebElement lastNameField;

    @FindBy(id = "ajax_email")
    WebElement emailField;
    //new page
    @FindBy(linkText = "Delivery")
    WebElement deliveryLink;

    @FindBy(id = "d_ajax_first_name")
    WebElement deliveryFistName;

    @FindBy(id = "d_ajax_last_name")
    WebElement deliveryLastName;

    @FindBy(id = "sum_ship_product")
    WebElement shippingProductField;
    //new page
    @FindBy(linkText = "Inventory")
    WebElement inventoryLink;

    @FindBy(id = "ajax_name")
    WebElement productName;

    @FindBy(id = "ajax_price")
    WebElement unitPrice;

    @FindBy(css = ".not-empty.tax-chooser")
    WebElement shippingDropdown;
    //new page
    @FindBy(linkText = "Notes")
    WebElement notesLink;

    @FindBy(name = "note")
    WebElement internalNoteContentField;

    @FindBy(name = "summary[note_to_customer]")
    WebElement publicNoteContentField;

    @FindBy(xpath = "//*[@value=\"Save\"]")
    WebElement saveButton;

    @FindBy(xpath = "//a[text()='Search Orders']")
    WebElement searchOrdersLink;

    @FindBy(id = "search_customer_id")
    WebElement customerNameField;

    @FindBy(xpath = "//*[@value=\"Search\"]")
    WebElement searchButton;

    @FindBy(css = ".fa.fa-trash")
    WebElement deleteOrder;

    @FindBy(xpath = "//*[contains(text(),'Order successfully deleted.')]")
    WebElement orderDeletedSuccessfullyMessage;

    public void overviewPage(){
        functionPage.waitUntilElementPresent(createOrderLink);
        createOrderLink.click();
        Select select=new Select(orderStatusLink);
        select.selectByValue("2");
    }
    public void billingPage(){
        functionPage.waitUntilElementPresent(billingLink);
        billingLink.click();
        functionPage.waitUntilElementPresent(findCustomerField);
        findCustomerField.sendKeys(customerPage.customerFirstName);
        System.out.println(customerPage.customerFirstName);
        functionPage.sleep(2);
        WebElement dropDown=driver.findElement(By.xpath("//*[@name=\"1\"]"));
        dropDown.click();
//        firstNameField.sendKeys(functionPage.generateFakeName());
//        lastNameField.sendKeys(functionPage.generateFakeName());
//        emailField.sendKeys(functionPage.generateFakeName()+"@gmail.com");
    }
    public void deliveryPage(){
        functionPage.waitUntilElementPresent(deliveryLink);
        deliveryLink.click();
        functionPage.waitUntilElementPresent(deliveryFistName);
        deliveryFistName.sendKeys(functionPage.generateFakeName());
        functionPage.waitUntilElementPresent(deliveryLastName);
        deliveryLastName.sendKeys(functionPage.generateFakeName());
        shippingProductField.sendKeys(functionPage.generateFakeNumbers());
    }

    public void inventoryPage(){
        functionPage.waitUntilElementPresent(inventoryLink);
        inventoryLink.click();
        productName.sendKeys("iphone");
        functionPage.sleep(2);
        WebElement dropdown=driver.findElement(By.xpath("//*[@name=\"1\"]"));
        dropdown.click();
        unitPrice.clear();
        unitPrice.sendKeys(functionPage.generateFakeNumbers());
        Select select=new Select(shippingDropdown);
        select.selectByIndex(1);
    }
    public void notesPage(){
        notesLink.click();
        internalNoteContentField.sendKeys(Faker.instance().address().cityPrefix());
        publicNoteContentField.sendKeys(functionPage.generateFakeNumbers());
        saveButton.click();
        functionPage.sleep(4);
    }

    public void searchOrders(){
        searchOrdersLink.click();
        customerNameField.sendKeys(customerPage.customerFirstName);
        functionPage.sleep(2);
        WebElement dropdown=driver.findElement(By.xpath("//*[@name=\"1\"]"));
        dropdown.click();
        searchButton.click();
    }

    public void deleteOrder(){
        functionPage.waitUntilElementPresent(deleteOrder);
        deleteOrder.click();
        Alert alert=driver.switchTo().alert();
        functionPage.waitUntilAlertPresent(functionPage.timeout);
        alert.accept();

    }

    public boolean isOrderDeleted(){
        functionPage.waitUntilElementPresent(orderDeletedSuccessfullyMessage);
        if (orderDeletedSuccessfullyMessage.isDisplayed())
            return true;
        else return false;
    }

}

package regressionsuit.pageobjectpattern;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage {
    WebDriver driver;

    FunctionPage functionPage;

    String customerGroupName;
    public CustomerPage(WebDriver driver) {
        this.driver = driver;
        functionPage=new FunctionPage(driver);
        PageFactory.initElements(driver,this);
    }

    static String customerFirstName;

    //add customer page
    @FindBy(linkText = "Add Customer")
    WebElement addCustomerLink;

    @FindBy(id = "cust-firstname")
    WebElement firstNameField;

    @FindBy(id = "cust-lastname")
    WebElement lastNameField;

    @FindBy(id = "cust-email")
    WebElement emailField;
    //add address page
    @FindBy(xpath = "//*[text()='Addresses']")
    WebElement addressLink;

    @FindBy(xpath = "//a[text()='Add Address']")
    WebElement addAddressLink;

    @FindBy(id = "edit_description")
    WebElement descriptionField;

    @FindBy(id = "edit_first_name")
    WebElement addressFirstNameField;

    @FindBy(id = "edit_last_name")
    WebElement addressLastNameField;

    @FindBy(id = "edit_line1")
    WebElement addAddressField;

    @FindBy(id = "edit_town")
    WebElement townField;

    @FindBy(id = "edit_country")
    WebElement countryDropDown;

    @FindBy(id = "edit_state")
    WebElement stateField;

    @FindBy(id= "edit_postcode")
    WebElement zipCodeField;

    @FindBy(xpath = "//input[@value='Add']")
    WebElement addAddressButton;

    //customer groups page
    @FindBy(xpath = "//a[text()='Customer Groups']")
    WebElement customerGroupsLink;

    @FindBy(id = "group-join")
    WebElement addGroupMembershipDropDown;

    @FindBy(name = "save")
    WebElement saveButton;

    @FindBy(xpath = "//a[text()='Customer Groups']")
    WebElement CustomerGroupsPageLink;

    @FindBy(id = "group_add_name")
    WebElement groupNameFiled;

    @FindBy(id = "group_add_description")
    WebElement groupDescriptionField;

    @FindBy(name = "save")
    WebElement customerGroupsSaveButton;

    @FindBy(xpath = "//a[text()='Search Customers']")
    WebElement searchCustomerLink;

    @FindBy(id = "customer_id")
    WebElement customerSearchField;

    @FindBy(xpath = "//*[@id='customer_id']//following::input[@value='Go']")
    WebElement goButton;

    @FindBy(css = ".fa.fa-trash")
    WebElement deleteButton;


    @FindBy(xpath = "//*[text()='Customer successfully added.']")
    WebElement customerAddedSuccessfullyMessage;

    @FindBy(xpath = "//*[text()='Customer group added.']")
    WebElement customerGroupAddedSuccessfullyMessage;

    @FindBy(xpath = "//*[text()='Customer successfully deleted.']")
    WebElement customerDeletedSuccessfullyMessage;

    @FindBy(xpath = "//*[@name=\"save\"]")
    WebElement saveButtonCustomerPage;


    public void addCustomerGroup(){
        functionPage.waitUntilElementPresent(CustomerGroupsPageLink);
        CustomerGroupsPageLink.click();
        functionPage.waitUntilElementPresent(groupNameFiled);
        customerGroupName=Faker.instance().funnyName().name();
        groupNameFiled.sendKeys(customerGroupName);
        groupDescriptionField.sendKeys(Faker.instance().backToTheFuture().character());
        customerGroupsSaveButton.click();
    }

    public void addCustomerPage(){
        functionPage.waitUntilElementPresent(addCustomerLink);
        addCustomerLink.click();
        functionPage.waitUntilElementPresent(firstNameField);
        customerFirstName=Faker.instance().name().firstName();
        firstNameField.sendKeys(customerFirstName);
        lastNameField.sendKeys(functionPage.generateFakeName());
        emailField.sendKeys(functionPage.generateFakeName()+"@gmail.com");
    }

    public void addCustomerPageForOrderPage(){
        functionPage.waitUntilElementPresent(addCustomerLink);
        addCustomerLink.click();
        functionPage.waitUntilElementPresent(firstNameField);
        customerFirstName=Faker.instance().name().firstName();
        firstNameField.sendKeys(customerFirstName);
        lastNameField.sendKeys(functionPage.generateFakeName());
        emailField.sendKeys(functionPage.generateFakeName()+"@gmail.com");
        saveButtonCustomerPage.click();
    }


    public void addAddressPage(){
        addressLink.click();
        functionPage.waitUntilElementPresent(addressLink);
        addAddressLink.click();
        functionPage.waitUntilElementPresent(descriptionField);
        descriptionField.sendKeys(functionPage.generateFakeName());
        addressFirstNameField.sendKeys(functionPage.generateFakeName());
        addressLastNameField.sendKeys(functionPage.generateFakeName());
        addAddressField.sendKeys(functionPage.generateFakeName());
        townField.sendKeys(functionPage.generateFakeName());
        functionPage.waitUntilElementPresent(countryDropDown);
        Select select=new Select(countryDropDown);
        select.selectByValue("016");
        stateField.sendKeys(functionPage.generateFakeName());
        zipCodeField.sendKeys(functionPage.generateFakeNumbers());
        addAddressButton.click();
    }

    public void customerGroupsPage(){
        functionPage.waitUntilElementPresent(customerGroupsLink);
        customerGroupsLink.click();
        functionPage.waitUntilElementPresent(addGroupMembershipDropDown);
        Select select=new Select(addGroupMembershipDropDown);
        select.selectByVisibleText(customerGroupName);
        System.out.println(customerGroupName);
        functionPage.waitUntilElementPresent(saveButton);
        saveButton.click();
    }

    public void searchCustomer(){
        functionPage.waitUntilElementPresent(searchCustomerLink);
        searchCustomerLink.click();
        functionPage.waitUntilElementPresent(customerSearchField);
        customerSearchField.sendKeys(customerFirstName);
        System.out.println(customerFirstName);
        goButton.click();
        functionPage.waitUntilElementPresent(deleteButton);
        deleteButton.click();
        Alert alert=driver.switchTo().alert();
        functionPage.waitUntilAlertPresent(functionPage.timeout);
        alert.accept();
    }

    public void deleteCustomerGroup(){
        functionPage.waitUntilElementPresent(CustomerGroupsPageLink);
        CustomerGroupsPageLink.click();
        WebElement deleteCustomerGroup=driver.findElement(By.xpath(String.format(
                "//*[contains(text(),'Aliya')]/following::div/parent::div//following::div[12]//following-sibling::div[2]//*[@name=\"group_delete\"]"
                ,customerGroupName)));
        functionPage.waitUntilElementPresent(deleteCustomerGroup);
        deleteCustomerGroup.click();
        functionPage.sleep(4);
        Alert alert=driver.switchTo().alert();
        functionPage.waitUntilAlertPresent(functionPage.timeout);
        alert.accept();
    }

    public boolean isCustomerGroupAdded(){
        functionPage.waitUntilElementPresent(customerGroupAddedSuccessfullyMessage);
        if (customerGroupAddedSuccessfullyMessage.isDisplayed())
            return true;
        else return false;
    }

    public boolean isCustomerAdded(){
        functionPage.waitUntilElementPresent(customerAddedSuccessfullyMessage);
        if (customerAddedSuccessfullyMessage.isDisplayed())
            return true;
        else return false;

    }

    public boolean isCustomerDeleted(){
        functionPage.waitUntilElementPresent(customerDeletedSuccessfullyMessage);
        if (customerDeletedSuccessfullyMessage.isDisplayed())
            return true;
        else return false;

    }

}

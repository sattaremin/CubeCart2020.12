package com.unitedcoder.homework.cubecartaddproductproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.HashMap;
import java.util.List;

public class ProductsObjectMethodsWeek9 {

    WebDriver driver;

    public ProductsObjectMethodsWeek9() {
    }

    public ProductsObjectMethodsWeek9(WebDriver driver) {
        this.driver = driver;
    }

    public void openBrowser(String url){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
    }

    public void logIn(String userName, String password){
        WebElement userNameField=driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField= driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement login=driver.findElement(By.id("login"));
        login.click();

    }


    public void addProducts(ProductsInfoWeek9 productsInfo) throws InterruptedException {
        WebElement productsLink=driver.findElement(By.id("nav_products"));
        productsLink.click();

        for (int i=0;i<3;i++) {

            HashMap<String, String> products=new HashMap<>();
            products.put("name","Puma Shoe"+System.currentTimeMillis());
            products.put("product_code","Sh"+System.currentTimeMillis());
            products.put("product_weight","1"+System.currentTimeMillis());
            products.put("product_width","2"+System.currentTimeMillis());
            products.put("product_height","3"+System.currentTimeMillis());
            products.put("product_depth","4"+System.currentTimeMillis());
            products.put("stock_level","5"+System.currentTimeMillis());
            products.put("stock_warning","remaining"+System.currentTimeMillis());
            products.put("upc","UPC"+System.currentTimeMillis());
            products.put("ean","EAN"+System.currentTimeMillis());
            products.put("jan","JAN"+System.currentTimeMillis());
            products.put("isbn","ISBN"+System.currentTimeMillis());
            products.put("gtin","GTIN"+System.currentTimeMillis());
            products.put("mpn","MPN"+System.currentTimeMillis());


            WebElement addProducts = driver.findElement(By.linkText("Add Product"));
            addProducts.click();
            WebElement productName = driver.findElement(By.id("name"));
            productName.sendKeys(products.get("name"));
            WebElement manufacturer = driver.findElement(By.id("manufacturer"));
            Select select = new Select(manufacturer);
            select.selectByVisibleText(String.valueOf(ProductDropdowns.PUMA.getValue()));
            WebElement condition = driver.findElement(By.id("condition"));
            Select select1 = new Select(condition);
            select1.selectByVisibleText(String.valueOf(ProductDropdowns.USED.getValue()));
            WebElement productCode = driver.findElement(By.id("product_code"));
            productCode.sendKeys(products.get("product_code"));
            WebElement productWeight = driver.findElement(By.id("product_weight"));
            productWeight.sendKeys(products.get("product_weight"));
            WebElement inch = driver.findElement(By.id("dimension_unit"));
            Select select2 = new Select(inch);
            select2.selectByVisibleText(String.valueOf(ProductDropdowns.INCHES_IN.getValue()));
            WebElement productWidth = driver.findElement(By.id("product_width"));
            productWidth.sendKeys(products.get("product_width"));
            WebElement productHeight = driver.findElement(By.id("product_height"));
            productHeight.sendKeys(products.get("product_height"));
            WebElement productDepth = driver.findElement(By.id("product_depth"));
            productDepth.sendKeys(products.get("product_depth"));
            WebElement stockLevel = driver.findElement(By.id("stock_level"));
            stockLevel.sendKeys(products.get("stock_level"));
            WebElement stockLevelWarning = driver.findElement(By.id("stock_warning"));
            stockLevelWarning.sendKeys(products.get("stock_warning"));
            WebElement upcCode = driver.findElement(By.id("upc"));
            upcCode.sendKeys(products.get("upc"));
            WebElement eanCode = driver.findElement(By.id("ean"));
            eanCode.sendKeys(products.get("ean"));
            WebElement janCode = driver.findElement(By.id("jan"));
            janCode.sendKeys(products.get("jan"));
            WebElement isbnCode = driver.findElement(By.id("isbn"));
            isbnCode.sendKeys(products.get("isbn"));
            WebElement gtinCode = driver.findElement(By.id("gtin"));
            gtinCode.sendKeys(products.get("gtin"));
            WebElement mpnCode = driver.findElement(By.id("mpn"));
            mpnCode.sendKeys(products.get("mpn"));

            WebElement google=driver.findElement(By.xpath("//*[@id=\"google_category_chosen\"]/child::a"));
            google.click();
            Thread.sleep(1000);
            List<WebElement> googleCategory = driver.findElements(By.cssSelector("li[class=\"active-result\"]"));
            googleCategory.get(358).click();
            Thread.sleep(1000);

            WebElement saveButton = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            saveButton.click();

            WebElement successMessage = driver.findElement(By.className("success"));
            if (successMessage.isDisplayed()) {
                System.out.println("Product Added Successfully");
            } else {
                System.out.println("Fail To Add Product");
            }
        }
    }



    public void updateProduct() {
        for (int i = 0; i < 3; i++){
            WebElement editProduct = driver.findElement(By.xpath("//*[contains(text(),\"Puma Shoe\")]//parent::td//following-sibling::td//*[@title=\"Edit\"]"));
            editProduct.click();
            WebElement productNameReplace = driver.findElement(By.id("name"));
            productNameReplace.clear();
            productNameReplace.sendKeys("New Product Name");
            WebElement editUpc = driver.findElement(By.id("upc"));
            editUpc.clear();
            editUpc.sendKeys("Updated UPC");
            WebElement saveButton = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            saveButton.click();
            WebElement verifySuccessfullyUpdated= driver.findElement(By.xpath("//*[contains(text(),\"Product successfully updated.\")]"));
            if (verifySuccessfullyUpdated.isDisplayed()){
                System.out.println("Product Updated Successfully");
            } else {
                System.out.println("failed to update the product");
            }
        }
    }

    public void deleteProduct() {
        for (int i = 0; i < 3; i++) {
            WebElement deleteIcon =  driver.findElement(By.xpath("//*[contains(text(),\"New Product Name\")]//parent::td//following-sibling::td//*[@title=\"Delete\"]"));
            deleteIcon.click();
            driver.switchTo().alert().accept();

            WebElement verifySuccessfullyDeleted=driver.findElement(By.xpath("//*[contains(text(),\"Product(s) successfully deleted.\")]"));
            if (verifySuccessfullyDeleted.isDisplayed()){
                System.out.println("Product deleted successfully");
            } else {
                System.out.println("Failed to Update the product");
            }

        }
    }

    public void logout(){

        WebElement logout=driver.findElement(By.cssSelector(".fa.fa-sign-out"));
        logout.click();
        driver.close();
        driver.quit();

    }

}

package com.unitedcoder.homework.cubecartinventorymodule;

import com.unitedcoder.exeltutorial.ExelUtility;
import com.unitedcoder.exeltutorial.UiUtility2;
import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class InventoryMethodClass extends BaseClass {
    UiUtility2 screenShot1=new UiUtility2();
    public void addProducts(List<InventoryObject> products) {
        WebElement productsLink = driver.findElement(By.id("nav_products"));
        productsLink.click();
        for (InventoryObject addProducts:products) {

            WebElement addProductLink = driver.findElement(By.linkText("Add Product"));
            addProductLink.click();
            WebElement productName = driver.findElement(By.id("name"));
            productName.sendKeys(addProducts.getProductName());
            WebElement productCode = driver.findElement(By.id("product_code"));
            productCode.sendKeys(addProducts.getProductCode());
            WebElement productWidth = driver.findElement(By.id("product_width"));
            productWidth.sendKeys(addProducts.getProductWidth());
            WebElement stockLevel = driver.findElement(By.id("stock_level"));
            stockLevel.sendKeys(addProducts.getStockLevel());
            WebElement upcCode = driver.findElement(By.id("upc"));
            upcCode.sendKeys(addProducts.getUpcCode());
            WebElement pricing = driver.findElement(By.linkText("Pricing"));
            pricing.click();
            WebElement retailPrice = driver.findElement(By.id("price"));
            retailPrice.sendKeys(addProducts.getRetailPrice());
            WebElement salePrice = driver.findElement(By.id("sale_price"));
            salePrice.sendKeys(addProducts.getSalePrice());
            WebElement costPrice = driver.findElement(By.id("cost_price"));
            costPrice.sendKeys(addProducts.getCostPrice());
            WebElement saveButton = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
            saveButton.click();
            WebElement productUpdatedSuccessMessage = driver.findElement(By.xpath("//*[contains(text(),\"Product successfully created.\")]"));
            if (productUpdatedSuccessMessage.isDisplayed()) {
                System.out.println("Product Added Successfully.");
            } else {
                System.out.println("Failed To Add Product");
                screenShot1.takeScreenShot("image","FailedAddProduct",  driver);
            }


        }
        screenShot1.takeScreenShot("image","addProduct",  driver);

    }

    public void bulkPriceChange(List<InventoryObject> bulkPriceChange) {
        WebElement bulkPriceChange1 = driver.findElement(By.linkText("Bulk Price Change"));
        bulkPriceChange1.click();
        for (InventoryObject addBulkPrice:bulkPriceChange) {
            driver.findElement(By.xpath(String.format("//td[text()='%s']/parent::tr//input[@class='products']", addBulkPrice.getProductName()))).click();
            //WebElement product=driver.findElement(By.xpath("//table//tbody/tr/td[text()=\"Airpod1665360339289\"]"));
            //product.click();
        }
        WebElement setToDropDown = driver.findElement(By.id("bulk_price_action"));
        Select select = new Select(setToDropDown);
        select.selectByValue("2");
        WebElement newPrice = driver.findElement(By.name("price[value]"));
        newPrice.sendKeys("2000");
        WebElement saveButton = driver.findElement(By.xpath("//input[@value=\"Save\"]"));
        saveButton.click();
        WebElement verifyBulkPriceChange = driver.findElement(By.xpath("//*[contains(text(),\"Prices have been updated accordingly.\")]"));
        if (verifyBulkPriceChange.isDisplayed()) {
            System.out.println("Bulk Price Have been updated successfully");
            screenShot1.takeScreenShot("image","BulkPriceChange",  driver);
        } else {
            System.out.println("Failed To Do Bulk Price Change");
            screenShot1.takeScreenShot("image","FailedBulkPriceChange",  driver);
        }
    }

    public void addProductReview(List<InventoryObject> addProductReviews) {
        WebElement reviewsLink = driver.findElement(By.xpath("//*[contains(text(),\"Reviews\")]"));
        reviewsLink.click();
        for (InventoryObject addReview:addProductReviews) {
            WebElement addReviews = driver.findElement(By.linkText("Add review"));
            addReviews.click();
            WebElement productName = driver.findElement(By.id("ajax_name"));
            productName.sendKeys(addReview.getProductName());
            BaseClass.sleep(2);
            driver.findElement(By.xpath("//span[@name=\"1\"]")).click();
            WebElement statusBox = driver.findElement(By.cssSelector(".checkbox.cbs"));
            statusBox.click();
            WebElement name = driver.findElement(By.id("review_name"));
            name.sendKeys(addReview.getReviewerName());
            WebElement email = driver.findElement(By.id("review_email"));
            email.sendKeys(addReview.getReviewerEmail());
            WebElement title = driver.findElement(By.id("review_title"));
            title.sendKeys(addReview.getReviewerTitle());
            WebElement content = driver.findElement(By.id("review_content"));
            content.sendKeys(addReview.getContent());
            WebElement ratingLink = driver.findElement(By.xpath("//a[@title=\"5\"]"));
            ratingLink.click();
            WebElement submitButton = driver.findElement(By.className("submit"));
            submitButton.click();
            WebElement verifyProductReview = driver.findElement(By.xpath("//*[contains(text(),'Review successfully added.')]"));
            if (verifyProductReview.isDisplayed()) {
                System.out.println("Product Review Successfully Added");
            } else {
                System.out.println("Failed To Add Product Review");
                screenShot1.takeScreenShot("image","FailedProductReview",  driver);
            }
        }
        screenShot1.takeScreenShot("image","ProductReview",  driver);
    }

    public void updateProductReview(List<InventoryObject> updateProductReview) {
        driver.findElement(By.xpath("//a[contains(text(),'View All')]")).click();
        for (InventoryObject updateReview:updateProductReview) {
            ////strong[contains(text(),"%s")]/parent::div/parent::div
            WebElement searchEdit=driver.findElement(By.xpath("//a[contains(text(),\"Search\")]"));
            searchEdit.click();
            WebElement filterByProduct=driver.findElement(By.id("search-products"));
            filterByProduct.sendKeys(updateReview.getProductName());
            BaseClass.sleep(2);
            driver.findElement(By.xpath("//span[@name=\"1\"]")).click();
            WebElement submitButton=driver.findElement(By.xpath("//input[@value=\"Submit\"]"));
            submitButton.click();
            WebElement editIcon=driver.findElement(By.xpath("//i[@title=\"Edit\"]"));
            editIcon.click();
//            WebElement editIcon = driver.findElement(By.xpath(String.format(
//                    "strong[contains(text(),\"%s\")]/parent::div/parent::div//*[@title=\"Edit\"]",updateReview.getReviewerTitle())));
//            editIcon.click();
            WebElement newContent = driver.findElement(By.id("review_content"));
            newContent.clear();
            newContent.sendKeys("This product actually sucks");
            driver.findElement(By.xpath("//a[@title=\"1\"]"));
            WebElement submitButton2 = driver.findElement(By.className("submit"));
            submitButton2.click();
            WebElement verifyUpdatedReview = driver.findElement(By.xpath("//div[contains(text(),'Review successfully updated.')]"));
            if (verifyUpdatedReview.isDisplayed()) {
                System.out.println("Review successfully updated");
            } else {
                System.out.println("Failed to update product review");
                screenShot1.takeScreenShot("image","FailedReviewUpdate",  driver);
            }
        }
        screenShot1.takeScreenShot("image","Review",  driver);
    }

    public void deleteProductReview(List<InventoryObject> deleteProductR){
        for (InventoryObject deleteReview:deleteProductR) {
            WebElement searchLink=driver.findElement(By.xpath("//a[contains(text(),\"Search\")]"));
            searchLink.click();
            WebElement filterByProduct=driver.findElement(By.id("search-products"));
            filterByProduct.sendKeys(deleteReview.getProductName());
            BaseClass.sleep(2);
            driver.findElement(By.xpath("//span[@name=\"1\"]")).click();
            WebElement submitButton=driver.findElement(By.xpath("//input[@value=\"Submit\"]"));
            submitButton.click();
            WebElement deleteIcon=driver.findElement(By.xpath("//a[@class='delete']"));
            deleteIcon.click();
            driver.switchTo().alert().accept();
            WebElement verifyProductSuccessfullyDeleted = driver.findElement(By.xpath("//*[contains(text(),'Review successfully deleted.')]"));
            if (verifyProductSuccessfullyDeleted.isDisplayed()) {
                System.out.println("Review successfully deleted");
            } else {
                System.out.println("Failed To Delete The Review");
                screenShot1.takeScreenShot("image","FailedReviewDelete",  driver);
            }
        }
        screenShot1.takeScreenShot("image","reviewDelete",  driver);
    }

    public void deleteProduct(List<InventoryObject> deleteProduct){
        driver.findElement(By.id("nav_products")).click();
        for (InventoryObject delete:deleteProduct){
            WebElement deleteProducts=driver.findElement(By.xpath(String.format("//*[contains(text(),\"%s\")]//following::td[9]/a[@class=\"delete\"]",delete.getProductName())));
            deleteProducts.click();
            driver.switchTo().alert().accept();
            WebElement verifyDeleteProduct=driver.findElement(By.xpath("//div[contains(text(),\"Product(s) successfully deleted.\")]"));
            if (verifyDeleteProduct.isDisplayed()){
                System.out.println("Product successfully updated");
            } else {
                System.out.println("Failed to add product");
                screenShot1.takeScreenShot("image","FailedProductDelete",  driver);
            }
        }
        screenShot1.takeScreenShot("image","ProductDelete",  driver);
    }

    public void testReport(){
        UiUtility2 uiUtility2=new UiUtility2();
        ExelUtility exelUtility=new ExelUtility();
        String fileName="testdatafolders/testReport.xlsx";
        List<String> testResult=new ArrayList<>();
        testResult.add("testName,testModule,testStatus,executedAt,executedBy");
        testResult.add("login,login,passed,"+uiUtility2.getCurrentTime()+","+uiUtility2.getUserName());
        testResult.add("AddProduct,Inventory,passed,"+uiUtility2.getCurrentTime()+","+uiUtility2.getUserName());
        exelUtility.writeToExcelMultipleCells(fileName,"CubeCartTestResult",testResult);

    }

}

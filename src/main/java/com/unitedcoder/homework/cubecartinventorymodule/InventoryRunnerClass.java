package com.unitedcoder.homework.cubecartinventorymodule;

import com.unitedcoder.oopsconcept.inheritancetutorial.BaseClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryRunnerClass extends BaseClass {
    public static void main(String[] args) {
        openBrowser();
        loginWithConfig();
        InventoryObject addProductObject1 = new InventoryObject("Iphone14-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "5824",
                "upc5555", "1500", "2500", "1000","sattar2",
                "iam2"+ System.currentTimeMillis() + "@gmail.com","nasrullah",
                "Loved it");
        InventoryObject addProductObject2 = new InventoryObject("Iphone13-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "855",
                "upc5555", "2500", "3500", "1000","sattar1",
                "iam1"+ System.currentTimeMillis() + "@gmail.com","ahmet",
                "That's a good one");
        InventoryObject addProductObject3 = new InventoryObject("Iphone12-" + System.currentTimeMillis(),
                "APPLE" + System.currentTimeMillis(), "750gr", "15cm", "1500",
                "upc5555", "1500", "2500", "1000","sattar",
                "iam"+ System.currentTimeMillis() + "@gmail.com","mehmet",
                "I have never seen a product like this before in my life, It is incredible");

        List<InventoryObject> inventory=new ArrayList<>();
        inventory.addAll(Arrays.asList(addProductObject1,addProductObject2,addProductObject3));
        InventoryMethodClass inventoryMethod=new InventoryMethodClass();
        inventoryMethod.addProducts(inventory);
        inventoryMethod.bulkPriceChange(inventory);
        inventoryMethod.addProductReview(inventory);
        inventoryMethod.updateProductReview(inventory);
        inventoryMethod.deleteProductReview(inventory);
        inventoryMethod.deleteProduct(inventory);
        inventoryMethod.testReport();
        logout();
        closeBrowser();

    }
}

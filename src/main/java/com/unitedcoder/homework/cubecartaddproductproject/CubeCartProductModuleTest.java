package com.unitedcoder.homework.cubecartaddproductproject;


public class CubeCartProductModuleTest {
    public static void main(String[] args) throws InterruptedException {
       ProductsObjectMethodsWeek9 methods=new ProductsObjectMethodsWeek9();
       methods.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
       methods.logIn("testautomation1","automation123!");
       ProductsInfoWeek9 productsInfo=new ProductsInfoWeek9();
       methods.addProducts(productsInfo);
       methods.updateProduct();
       methods.deleteProduct();
       methods.logout();

    }
}

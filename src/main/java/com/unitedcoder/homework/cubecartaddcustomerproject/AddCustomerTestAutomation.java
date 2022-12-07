package com.unitedcoder.homework.cubecartaddcustomerproject;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddCustomerTestAutomation {

    public static void main(String[] args) throws InterruptedException {
        CustomerAddAndUpdateBaseClass baseClass = new CustomerAddAndUpdateBaseClass();
        baseClass.openBrowser("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        baseClass.logIn("testautomation1", "automation123!");
        CustomerInfo info = new CustomerInfo();
        CustomerAddressInfo customerAddressInfo = new CustomerAddressInfo("mr","Sattar","Emin","sattar"+System.currentTimeMillis()+"@gmail.com",
                "0"+System.currentTimeMillis(),"2"+System.currentTimeMillis(),"ASB13","ASB13","IST Sk KD","mr","Sattar","Emin","Emin Holding",
                "New York","albany","New York","52862");
        CustomerAddressInfo customerAddressInfo1 = new CustomerAddressInfo("mr","Aynigar","Alim","aynigar"+System.currentTimeMillis()+"@gmail.com",
                "0"+System.currentTimeMillis(),"2"+System.currentTimeMillis(),"ASB13","ASB13","IST Sk KD","mr","Aynigar","Alim","Aynigar Holding",
                "New York","albany","New York","52862");
        CustomerAddressInfo customerAddressInfo2 = new CustomerAddressInfo("mr","Dolkun","Tarim","dolkun"+System.currentTimeMillis()+"@gmail.com",
                "0"+System.currentTimeMillis(),"2"+System.currentTimeMillis(),"ASB13","ASB13","IST Sk KD","mr","Dolkun","Tarim","Dolkun Holding",
                "New York","albany","New York","52862");
        List<CustomerAddressInfo> customers = new ArrayList<>();
        customers.addAll(Arrays.asList(customerAddressInfo,customerAddressInfo1,customerAddressInfo2));
        baseClass.addCustomers(customers);
        baseClass.updateCustomer(customers);
        baseClass.deleteCustomer(customers);
        baseClass.logout();






    }

}


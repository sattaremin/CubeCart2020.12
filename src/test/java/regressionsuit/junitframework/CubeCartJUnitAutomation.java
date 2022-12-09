package regressionsuit.junitframework;

import com.unitedcoder.homework.cubecartaddproductproject.ProductsInfoWeek9;
import com.unitedcoder.homework.cubecartaddproductproject.ProductsObjectMethodsWeek9;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CubeCartJUnitAutomation extends ProductsObjectMethodsWeek9 {

    @BeforeAll
    public static void setUp(){
        openBrowser();
    }
    @Test
    @Order(1)
    public void login(){
        logIn("testautomation1","automation123!");
    }
    @Test
    @Order(2)
    public void addProduct(){
        ProductsInfoWeek9 productsInfoWeek9=new ProductsInfoWeek9();
        try {
            addProducts(productsInfoWeek9);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    @Order(3)
    public void updateProducts(){
        updateProduct();
    }
    @Test
    @Order(4)
    public void deleteProducts(){
        deleteProduct();
    }
    @AfterAll
    public static void logOut(){
        logout();
    }



}

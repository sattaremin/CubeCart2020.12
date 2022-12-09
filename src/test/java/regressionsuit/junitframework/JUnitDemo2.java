package regressionsuit.junitframework;

import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnitDemo2 {
    @BeforeAll
    public static void setUp(){
        System.out.println("The first one");
    }

    @AfterAll
    @Disabled
    public static void tearDown(){
        System.out.println("The las one");
    }

    @BeforeEach
    public void before() {
        System.out.println("Before Every Test");
    }

    @AfterEach
    public void after() {
        System.out.println("After Every Test");
    }

    @Test
    @Order(1)
    @Tag("Regression Test")
    public void addProduct() {
        System.out.println("CubeCart Add Product Test...");
        Assertions.assertTrue(Math.pow(10,2)==100);
    }

    @Test
    @Order(3)
    public void deleteProduct() {
        System.out.println("Delete Product Test");
        Assertions.assertEquals(10,10);
    }

    @Test
    @Disabled
    @Order(2)
    public void updateProductInfo() {
        System.out.println("Testing CubeCart Update Product Function");
        Assertions.assertTrue(Math.pow(10,20)==100);
    }
}

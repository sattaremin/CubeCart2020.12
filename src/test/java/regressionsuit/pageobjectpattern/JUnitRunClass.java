package regressionsuit.pageobjectpattern;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JUnitRunClass {

    static WebDriver driver;

    static LoginPage loginPage;
    static CustomerPage customerPage;
    static OrdersPage ordersPage;
    static NewsLettersPage newsLettersPage;
    static MailingListPage mailingListPage;
    static DashBoardPage dashBoardPage;

    @BeforeAll
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://cubecartqa1.unitedcoderschool.com/admin_xrmx7f.php");
        driver.manage().window().maximize();
        loginPage=new LoginPage(driver);
        customerPage=new CustomerPage(driver);
        ordersPage=new OrdersPage(driver);
        newsLettersPage=new NewsLettersPage(driver);
        mailingListPage=new MailingListPage(driver);
        dashBoardPage=new DashBoardPage(driver);
    }

    @Test
    @Order(1)
    public void login(){
        loginPage.login("testautomation1","automation123!");
    }
    @Test
    @Order(2)
    public void addCustomer(){
        dashBoardPage.clickOnCustomerList();
        customerPage.addCustomerGroup();
        Assertions.assertTrue(customerPage.isCustomerGroupAdded());
        customerPage.addCustomerPage();
        customerPage.addAddressPage();
        customerPage.customerGroupsPage();
        Assertions.assertTrue(customerPage.isCustomerAdded());
        customerPage.searchCustomer();
        Assertions.assertTrue(customerPage.isCustomerDeleted());
        customerPage.deleteCustomerGroup();

    }
    @Test
    @Order(3)
    public void ordersPage(){
        dashBoardPage.clickOnCustomerList();
        customerPage.addCustomerPageForOrderPage();
        Assertions.assertTrue(customerPage.isCustomerAdded());
        dashBoardPage.clickOnOrdersLink();
        ordersPage.overviewPage();
        ordersPage.billingPage();
        ordersPage.deliveryPage();
        ordersPage.inventoryPage();
        ordersPage.notesPage();
        dashBoardPage.clickOnOrdersLink();
        ordersPage.searchOrders();
        dashBoardPage.clickOnOrdersLink();
        ordersPage.deleteOrder();
        Assertions.assertTrue(ordersPage.isOrderDeleted());
    }
    @Test
    @Order(4)
    public void newsLetterPage(){
        dashBoardPage.clickOnNewsLettersLink();
        newsLettersPage.createNewsletterPage();
    }
    @Test
    @Order(5)
    public void mailingListPage(){
        dashBoardPage.clickOnMailingList();
        mailingListPage.deleteEmail();
    }
    @AfterAll
    public static void logout(){
        dashBoardPage.logout();
        driver.close();
        driver.quit();
    }
}

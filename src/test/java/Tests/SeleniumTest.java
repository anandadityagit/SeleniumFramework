package Tests;

import Pages.HomePage;
import Pages.ProductPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    public static WebDriver driver;
    static ExtentReports report;
    public static ExtentTest test;
    static ExtentReports extent = new ExtentReports();

    @BeforeSuite
    public static void Setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("file:///Users/adityaanand/VS%20Projects/AceOnlineShoePortal/index.html");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/spark.html");
        extent.attachReporter(spark);
        HomePage.click_hamburger_menu();
        HomePage.click_orderProduct_link();
    }

    @Test
    void validateTitles_OnlineProducts() throws InterruptedException {
        test = extent.createTest("Validate Shoe Title on the page", "This tests validates that the different shoe types are correct");
        ProductPage.formalshoes_verifyTitle();
        ProductPage.sportshoes_verifyTitle();
        ProductPage.sneakers_verifytTitle();
        extent.flush();
    }

    @Test
    void validateFormalShoeName() throws InterruptedException {
        Thread.sleep(1000);
        test = extent.createTest("Validate Formal Shoe name ", "This tests validates that the first Formal shoe name is correct");
        ProductPage.formalshoesdrpdwn_click();
    }

    @AfterSuite
    public static void cleanup() {
        extent.flush();
    }
}

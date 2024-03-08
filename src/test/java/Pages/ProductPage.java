package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;
import static Tests.SeleniumTest.*;

import static Tests.SeleniumTest.driver;

public class ProductPage {

    public static String formalshoes_xpath = "/html/body/div[2]/center/h2";
    public static String sportshoes_xpath = "/html/body/div[3]/center/h2";
    public static String sneakers_xpath = "/html/body/div[4]/center/h2";
    public static String formalshoesdrpdwn_xpath = "/html/body/div[2]/center/div/i[1]";
    public static String sportshoesdrpdwn_xpath = "/html/body/div[3]/center/div/i[2]";
    public static String sneakersdrpdwn_xpath = "/html/body/div[4]/center/div/i[2]";
    public static String formalshoes_tablebody = "/html/body/div[2]/table/tbody/tr[1]/td[1]";
    public static String sportshoes_tablebody = "public static String sportshoes/tr[1]/td[1]";




    public static void formalshoes_verifyTitle() {
        String expectedTitle = "Formal Shoes";
      String actualTitle =   driver.findElement(By.xpath(formalshoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        if (expectedTitle.equals(actualTitle)) {
            test.log(Status.PASS, "Test Pass for title Verification of Formal Shoe");
        } else {
            test.log(Status.FAIL, "Test failed for title Verification of Formal Shoe");
        }

    }
    public static void sportshoes_verifyTitle() {
        String expectedTitle = "Sports Shoes";
        String actualTitle =   driver.findElement(By.xpath(sportshoes_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    public static void sneakers_verifytTitle() {
        String expectedTitle = "Sneakers";
        String actualTitle =   driver.findElement(By.xpath(sneakers_xpath)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);

    }
    public static void formalshoesdrpdwn_click()  {
        String ExpectedName = "   Classic Cheltenham";
        driver.findElement(By.xpath(formalshoesdrpdwn_xpath)).click();
         String ActualName = driver.findElement(By.xpath(formalshoes_tablebody)).getText();
         Assert.assertEquals(ExpectedName, ActualName);

    }
    public static void sportshoesdrpdwn_click() {
        String ExpectedName = "Ultimate";
        driver.findElement(By.xpath(sportshoesdrpdwn_xpath)).click();
        String ActualName =  driver.findElement(By.xpath(sportshoes_tablebody)).getText();
        Assert.assertEquals(ExpectedName, ActualName);

    }
    public static void sneakersdrpdwn_click() {
        driver.findElement(By.xpath(sneakersdrpdwn_xpath)).click();

    }


}

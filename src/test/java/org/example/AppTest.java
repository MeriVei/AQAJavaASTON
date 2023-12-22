package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AppTest {
    public static WebDriver driver;
    public static OnlinePay onlinePay;
    public static WebDriverWait wait;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        onlinePay = new OnlinePay(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.mts.by");
        driver.findElement(By.id("cookie-agree")).click();
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }

    @Order(1)
    @Test
    public void nameTest() {
        Assertions.assertTrue(onlinePay.isName("Онлайн пополнение\nбез комиссии"));
    }

    @Order(2)
    @Test
    public void payPartnersTest() {
        Assertions.assertTrue(onlinePay.isPayPartners());
    }

    @Order(3)
    @Test
    public void clickLinkTest() {
        onlinePay.clickLink();
        Assertions.assertEquals(driver.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/");
        driver.navigate().back();
    }

    @Order(4)
    @Test
    public void clickBtnTest() {
        onlinePay.clickButtonServices();
        onlinePay.clickButtonServiceOne();
        onlinePay.inputPhone("297777777");
        onlinePay.inputMoney("10");
        onlinePay.inputEmail("test@gmail.com");
        onlinePay.clickButtonContinue();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.xpath("//iframe[@class = 'bepaid-iframe']")));
        driver.switchTo().frame(driver.findElement(
                By.xpath("//iframe[@class = 'bepaid-iframe']")));
        Assertions.assertEquals("BePaidWidget",
                driver.findElement(By.tagName("title")).getAttribute("innerHTML"));
        driver.switchTo().parentFrame();
    }
}

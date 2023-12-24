package org.example;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

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
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
        Assertions.assertTrue(onlinePay.equalsName("Онлайн пополнение\nбез комиссии"));
    }

    @Order(2)
    @Test
    public void payPartnersTest() {
        Assertions.assertTrue(onlinePay.isEmptyPayPartners());
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
    public void titlesTest() {
        Assertions.assertEquals(onlinePay.getConnectionPhonePlaceholder(),
                "Номер телефона");
        Assertions.assertEquals(onlinePay.getConnectionSumPlaceholder(),
                "Сумма");
        Assertions.assertEquals(onlinePay.getConnectionEmailPlaceholder(),
                "E-mail для отправки чека");
        Assertions.assertEquals(onlinePay.getInternetPhonePlaceholder(),
                "Номер абонента");
        Assertions.assertEquals(onlinePay.getInternetSumPlaceholder(),
                "Сумма");
        Assertions.assertEquals(onlinePay.getInternetEmailPlaceholder(),
                "E-mail для отправки чека");
        Assertions.assertEquals(onlinePay.getScoreInstalmentPlaceholder(),
                "Номер счета на 44");
        Assertions.assertEquals(onlinePay.getInstalmentSumPlaceholder(),
                "Сумма");
        Assertions.assertEquals(onlinePay.getInstalmentEmailPlaceholder(),
                "E-mail для отправки чека");
        Assertions.assertEquals(onlinePay.getScoreArrearsPlaceholder(),
                "Номер счета на 2073");
        Assertions.assertEquals(onlinePay.getArrearsSumPlaceholder(),
                "Сумма");
        Assertions.assertEquals(onlinePay.getArrearsEmailPlaceholder(),
                "E-mail для отправки чека");
    }

    @Order(5)
    @Test
    public void clickBtnTest() {
        String money = "10.50";
        String phone = "297777777";
        onlinePay.clickButtonServices();
        onlinePay.clickButtonCommunicationServices();
        onlinePay.inputPhone(phone);
        onlinePay.inputMoney(money);
        onlinePay.inputEmail("test@gmail.com");
        onlinePay.clickButtonContinue();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//iframe[@class = 'bepaid-iframe']")));
        driver.switchTo().frame(driver.findElement(
                By.xpath("//iframe[@class = 'bepaid-iframe']")));
        Assertions.assertEquals("BePaidWidget",
                driver.findElement(By.tagName("title")).getAttribute("innerHTML"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//p[@class='header__payment-amount']")));
        Assertions.assertEquals(money + " BYN", driver.findElement(
                By.xpath("//p[@class='header__payment-amount']")).getText());
        Assertions.assertEquals("Оплатить " + money + " BYN", driver.findElement(
                By.xpath("//button[@class='colored disabled ng-star-inserted']")).getText());
        Assertions.assertEquals("Оплата: Услуги связи Номер:375" + phone, driver.findElement(
                By.xpath("//p[@class='header__payment-info']")).getText());
        Assertions.assertEquals("Номер карты", driver.findElement(
                By.xpath("//input[@formcontrolname='creditCard']/parent::*/label")).getText());
        Assertions.assertEquals("Срок действия", driver.findElement(
                By.xpath("//input[@formcontrolname='expirationDate']/parent::*/label")).getText());
        Assertions.assertEquals("CVC", driver.findElement(
                By.xpath("//input[@formcontrolname='cvc']/parent::*/label")).getText());
        Assertions.assertEquals("Имя держателя (как на карте)", driver.findElement(
                By.xpath("//input[@formcontrolname='holder']/parent::*/label")).getText());
        List<WebElement> iconsPay = driver.findElements(
                By.xpath("//input[@formcontrolname='creditCard']" +
                        "/parent::*/parent::*/div/div/div/child::*"));
        Assertions.assertFalse(iconsPay.isEmpty());
        driver.switchTo().parentFrame();
    }
}

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class OnlinePay {
    public WebDriver driver;
    @FindBy(xpath = "//section[@class = 'pay']/div/h2")
    private WebElement name;
    @FindBy(xpath = "//section[@class = 'pay']/div/div[@class = 'pay__partners']/ul")
    private WebElement payPartners;
    @FindBy(xpath = "//section[@class = 'pay']/div/a")
    private WebElement link;
    @FindBy(xpath = "//section[@class = 'pay']//button[@class = 'select__header']")
    private WebElement buttonServices;
    @FindBy(xpath = "//section[@class = 'pay']//ul[@class = 'select__list']/li[1]")
    private WebElement buttonServiceOne;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-phone']")
    private WebElement phone;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-sum']")
    private WebElement money;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-email']")
    private WebElement email;
    @FindBy(xpath = "//section[@class = 'pay']//form[@id = 'pay-connection']/button")
    private WebElement buttonContinue;
    public OnlinePay(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean isName(String str) {
        return name.getText().equals(str);
    }

    public boolean isPayPartners() {
        List<String> webElements = payPartners.findElements(By.tagName("img"))
                .stream().map(p -> p.getAttribute("src")).collect(Collectors.toList());
        return !webElements.isEmpty();
    }

    public void clickLink() {
        link.click();
    }

    public void clickButtonServices() {
        buttonServices.click();
    }

    public void clickButtonServiceOne() {
        buttonServiceOne.click();
    }

    public void inputPhone(String str) {
        phone.sendKeys(str);
    }

    public void inputMoney(String str) {
        money.sendKeys(str);
    }

    public void inputEmail(String str) {
        email.sendKeys(str);
    }

    public void clickButtonContinue() {
        buttonContinue.click();
    }
}

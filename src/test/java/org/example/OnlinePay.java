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
    private WebElement buttonCommunicationServices;
    @FindBy(xpath = "//section[@class = 'pay']//ul[@class = 'select__list']/li[2]")
    private WebElement buttonHomeInternet;
    @FindBy(xpath = "//section[@class = 'pay']//ul[@class = 'select__list']/li[3]")
    private WebElement buttonInstallmentPlan;
    @FindBy(xpath = "//section[@class = 'pay']//ul[@class = 'select__list']/li[4]")
    private WebElement buttonDebt;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-phone']")
    private WebElement connectionPhone;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-sum']")
    private WebElement connectionSum;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'connection-email']")
    private WebElement connectionEmail;
    @FindBy(xpath = "//section[@class = 'pay']//form[@id = 'pay-connection']/button")
    private WebElement buttonPayConnection;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'internet-phone']")
    private WebElement internetPhone;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'internet-sum']")
    private WebElement internetSum;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'internet-email']")
    private WebElement internetEmail;
    @FindBy(xpath = "//section[@class = 'pay']//form[@id = 'pay-internet']/button")
    private WebElement buttonPayInternet;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'score-instalment']")
    private WebElement scoreInstalment;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'instalment-sum']")
    private WebElement instalmentSum;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'instalment-email']")
    private WebElement instalmentEmail;
    @FindBy(xpath = "//section[@class = 'pay']//form[@id = 'pay-instalment']/button")
    private WebElement buttonPayInstalment;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'score-arrears']")
    private WebElement scoreArrears;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'arrears-sum']")
    private WebElement arrearsSum;
    @FindBy(xpath = "//section[@class = 'pay']//input[@id = 'arrears-email']")
    private WebElement arrearsEmail;
    @FindBy(xpath = "//section[@class = 'pay']//form[@id = 'pay-arrears']/button")
    private WebElement buttonPayArrears;
    public OnlinePay(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public boolean equalsName(String str) {
        return name.getText().equals(str);
    }

    public boolean isEmptyPayPartners() {
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

    public void clickButtonCommunicationServices() {
        buttonCommunicationServices.click();
    }

    public void clickButtonHomeInternet() {
        buttonHomeInternet.click();
    }

    public void clickButtonInstallmentPlan() {
        buttonInstallmentPlan.click();
    }

    public void clickButtonDebt() {
        buttonDebt.click();
    }

    public void inputPhone(String str) {
        connectionPhone.sendKeys(str);
    }

    public void inputMoney(String str) {
        connectionSum.sendKeys(str);
    }

    public void inputEmail(String str) {
        connectionEmail.sendKeys(str);
    }

    public void clickButtonContinue() {
        buttonPayConnection.click();
    }

    public String getPlaceholder(WebElement element) {
        return element.getAttribute("placeholder");
    }

    public String getConnectionPhonePlaceholder() {
        return getPlaceholder(connectionPhone);
    }

    public String getConnectionSumPlaceholder() {
        return getPlaceholder(connectionSum);
    }

    public String getConnectionEmailPlaceholder() {
        return getPlaceholder(connectionEmail);
    }

    public String getInternetPhonePlaceholder() {
        return getPlaceholder(internetPhone);
    }

    public String getInternetSumPlaceholder() {
        return getPlaceholder(internetSum);
    }

    public String getInternetEmailPlaceholder() {
        return getPlaceholder(internetEmail);
    }

    public String getScoreInstalmentPlaceholder() {
        return getPlaceholder(scoreInstalment);
    }

    public String getInstalmentSumPlaceholder() {
        return getPlaceholder(instalmentSum);
    }

    public String getInstalmentEmailPlaceholder() {
        return getPlaceholder(instalmentEmail);
    }

    public String getScoreArrearsPlaceholder() {
        return getPlaceholder(scoreArrears);
    }

    public String getArrearsSumPlaceholder() {
        return getPlaceholder(arrearsSum);
    }

    public String getArrearsEmailPlaceholder() {
        return getPlaceholder(arrearsEmail);
    }
}

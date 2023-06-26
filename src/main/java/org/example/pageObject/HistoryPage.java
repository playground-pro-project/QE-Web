package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HistoryPage {
    public static WebDriver driver;
    public HistoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Venue List Page
    public void arenaClick(String arenaName) {
        String productElement = "---"+ arenaName +"---";
        driver.findElement(By.xpath(productElement)).click();
    }

    //Venue Detail Page
    @FindBy(xpath = "")
    private WebElement venueDetailPageIdentity;
    @FindBy(xpath = "")
    private WebElement checkAvaibilityButton;
    public boolean verifyVenueDetailPageShow() {
        return venueDetailPageIdentity.isDisplayed();
    }
    public void clickCheckAvaibilityButton() {
        checkAvaibilityButton.click();
    }

    //Check Venue Availability Page
    @FindBy(xpath = "")
    private WebElement checkVenueAvailabilityIdentity;
    @FindBy(xpath = "")
    private WebElement dateAndTimeButton;
    @FindBy(xpath = "")
    private WebElement reservasiButton;
    @FindBy(xpath = "")
    private WebElement reservationPopup;
    @FindBy(xpath = "")
    private WebElement startTimeBox;
    @FindBy(xpath = "")
    private WebElement untilTimeBox;
    @FindBy(xpath = "")
    private WebElement submitButton;
    public boolean verifyCheckVenueAvailabilityPageShow() {
        return checkVenueAvailabilityIdentity.isDisplayed();
    }
    public void clickDateAndTimeButton() {
        dateAndTimeButton.click();
    }
    public void clickReservasiButton() {
        reservasiButton.click();
    }
    public boolean verifyReservationPopupShow() {
        return reservationPopup.isDisplayed();
    }
    public void setStartTime(String startTime) {
        startTimeBox.sendKeys(startTime);
    }
    public void setUntilTime(String untilTime) {
        untilTimeBox.sendKeys(untilTime);
    }
    public void clickSubmitButton() {
        submitButton.click();
    }

    //History Page
    @FindBy(xpath = "")
    private WebElement statusOrder;
    @FindBy(xpath = "")
    private WebElement historyPageIdentity;
    @FindBy(xpath = "")
    private WebElement cancelButton;
    public String verifyStatusOrderShow() {
        return statusOrder.getText();
    }
    public boolean verifyHistoryPageShow() {
        return historyPageIdentity.isDisplayed();
    }
    public void clickCancelButton() {
        cancelButton.click();
    }

    //Confirmation and Payment Page
    @FindBy(xpath = "")
    private WebElement confirmationPaymentIdentityPage;
    @FindBy(xpath = "")
    private WebElement totalPriceText;
    @FindBy(xpath = "")
    private WebElement bankText;
    @FindBy(xpath = "")
    private WebElement confirmAndPayButton;
    public boolean verifyConfirmationPaymentIdentityPageShow() {
        return confirmationPaymentIdentityPage.isDisplayed();
    }
    public String verifyTotalPrice() {
        return totalPriceText.getText();
    }
    public void selectBank (String bank) {
        Select a = new Select(bankText);
        a.selectByVisibleText(bank);
    }
    public void clickConfirmAndPayButton() {
        confirmAndPayButton.click();
    }

}

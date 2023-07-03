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
    @FindBy(xpath = "//p[.='Basket200']")
    private WebElement lapBolaAdminJanganDihapusButton;
    public void clickLapBolaAdminJanganDihapusButton() {
        lapBolaAdminJanganDihapusButton.click();
    }

    //Venue Detail Page
    @FindBy(xpath = "")
    private WebElement venueDetailPageIdentity;
    @FindBy(xpath = "//button[@class='w-full h-12 font-semibold text-white bg-primary rounded-xl']")
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
    @FindBy(xpath = "")
    private WebElement reviewButton;
    @FindBy(xpath = "")
    private WebElement reviewPopup;
    @FindBy(xpath = "")
    private WebElement starsPopup;
    @FindBy(xpath = "")
    private WebElement reviewBox;
    @FindBy(xpath = "")
    private WebElement submitReviewButton;
    public String verifyStatusOrderShow() {
        return statusOrder.getText();
    }
    public boolean verifyHistoryPageShow() {
        return historyPageIdentity.isDisplayed();
    }
    public void clickCancelButton() {
        cancelButton.click();
    }
    public void clickreviewButton() {
        reviewButton.click();
    }
    public boolean verifyReviewPopup() {
        return reviewPopup.isDisplayed();
    }
    public void clickStarsPopup() {
        starsPopup.click();
    }
    public void setReview(String review) {
        reviewBox.sendKeys(review);
    }
    public void clickSubmitReviewButton() {
        submitReviewButton.click();
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

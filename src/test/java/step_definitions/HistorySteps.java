package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_scouse.An;
import org.example.pageObject.HistoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HistorySteps {
    private WebDriver webDriver;
    public HistorySteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //History 1
    @When("user clicks on \"(.*)\"")
    public void clickArenaName(String arena) {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.arenaClick(arena);
    }
    @And("redirected to 'Venue Detail' pages")
    public void verifyVenueDetailPage() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.verifyVenueDetailPageShow();
    }
    @Then("user click on 'Check Avaibility' buttons")
    public void clickCheckAvaibilityButton() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.clickCheckAvaibilityButton();
    }
    @And("redirected to 'Check Venue Avaibility' pages")
    public void verifyCheckVenueAvaibilityPage() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.verifyCheckVenueAvailabilityPageShow();
    }
    @When("user select date, time, and click 'Reservation' buttons")
    public void selectTimeReservation() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.clickDateAndTimeButton();
        historyPage.clickReservasiButton();
    }
    @And("'Reservation' pop up will appears")
    public void verifyReservationPopup() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.verifyReservationPopupShow();
    }
    @And("user inputs \"(.*)\" as start time and \"(.*)\" as until time")
    public void inputStartAndUntilTime(String startTime, String untilTime) {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.setStartTime(startTime);
        historyPage.setUntilTime(untilTime);
    }
    @And("click on 'Submit' buttons")
    public void clickSubmitButtons() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.clickSubmitButton();
    }
    @And("Reservation with status \"(.*)\" will appears")
    public void verifyRservationStatus(String status) {
        HistoryPage historyPage = new HistoryPage(webDriver);
        Assert.assertEquals(status, historyPage.verifyStatusOrderShow());
    }

    //History 3
    @Then("user redirected to 'Confirmation and Payment' pages")
    public void verifyConfirmationAndPaymentPage() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.verifyConfirmationPaymentIdentityPageShow();
    }
    @And("verify the total prices is \"(.*)\"")
    public void verifyTotalPrice(String totalPrice) {
        HistoryPage historyPage = new HistoryPage(webDriver);
        Assert.assertEquals(totalPrice, historyPage.verifyTotalPrice());
    }
    @When("user selects a \"(.*)\"")
    public void selectBank(String bank) {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.selectBank(bank);
    }
    @And("click on 'Confirm and Pay' buttons")
    public void clickConfirmAndPayButton() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.clickConfirmAndPayButton();
    }

    //History 4
    @And("'My Transaction' pages is showed")
    public void verifyMyTransactionPage() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.verifyHistoryPageShow();
    }

    //History 5
    @And("user click on 'Cancel' buttons")
    public void clickCancelButton() {
        HistoryPage historyPage = new HistoryPage(webDriver);
        historyPage.clickCancelButton();
    }






}

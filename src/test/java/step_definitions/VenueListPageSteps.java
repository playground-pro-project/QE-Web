package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en_lol.WEN;
import org.example.pageObject.*;
import org.junit.Assert;

import java.util.Random;
import java.util.UUID;

public class VenueListPageSteps {

    @Given("User already login")
    public void userAlreadyOnOTPPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        landingPage.clickLogin();
        loginPage.setEmailLoginPage("user2@default.com");
        loginPage.setPasswordLoginPage("@Derinm01#");
        loginPage.clickLogin();
        Thread.sleep(3000);
    }

    @Then("User click first venue")
    public void clickFirstVenue() throws InterruptedException {
        VenueListPage venueListPage = new VenueListPage(Hooks.webDriver);
        venueListPage.clickVenue();
    }

    @And("Verify user already on venue detail page")
    public void verifyVenueDetailPage() {
        VenueListPage venueListPage = new VenueListPage(Hooks.webDriver);
        venueListPage.verifyDetailVenue();
    }

    @Then("User click check availability button")
    public void clickCheckAvailabilityButton() throws InterruptedException {
        VenueListPage venueListPage = new VenueListPage(Hooks.webDriver);
        venueListPage.clickCheckAvailabilityButton();
    }

    @And("Verify user already on venue availability page")
    public void verifyVenueAvailabilityPage() {
        VenueListPage venueListPage = new VenueListPage(Hooks.webDriver);
        venueListPage.verifyVenueDetailPage();
    }
}



package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.VenueListPage;
import org.junit.Assert;

public class LandingPageSteps {
    @Given("user open the landing page")
    public void verifyLoginPageIsDisplayed() {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        Assert.assertTrue(landingPage.isLandinPageDisplayed());
    }

    @Then("User click on login button in landing page")
    public void clickLoginButton() {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        landingPage.clickLogin();
    }

    @Then("Verify user already on landing page")
    public void verifyLandingPage() {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        Assert.assertTrue(landingPage.isLandinPageDisplayed());
    }

    @When("User get first page venue id")
    public void getFirstPageVenueId() throws InterruptedException {
        Thread.sleep(2000);
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        LandingPage.FIRST_PAGE_VENUE_ID = landingPage.getIdVenue();
    }

    @Then("User click next page button")
    public void clickNextPageButton() throws InterruptedException {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        landingPage.clickNextPageButton();
    }

    @And("Verify user already on next page")
    public void verifyUserAlreadyOnNextPage() throws InterruptedException {
        Thread.sleep(2000);
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        String secondPageVenueId = landingPage.getIdVenue();

        Assert.assertNotEquals(LandingPage.FIRST_PAGE_VENUE_ID, secondPageVenueId);
    }
}




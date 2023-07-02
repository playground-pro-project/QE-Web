package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;

public class LoginPageSteps {
    @When("user click signup button on login page")
    public void userClickSignupButtonOnLoginPage() {
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        loginPage.clickSignUpLoginPage();
    }

    @Then("Verify user already on login page")
    public void verifyLandingPage() {
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Given("user on the login page")
    public void verifyLoginPageIsDisplayed() {
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        landingPage.clickLogin();
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("user input \"(.*)\" as email and input \"(.*)\" as password")
    public void inputCredential(String email, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        loginPage.setEmailLoginPage(email);
        loginPage.setPasswordLoginPage(password);
        loginPage.clickLogin();
        Thread.sleep(3000);
    }


    @Then("Verify appear caution message \"(.*)\" on login page")
public void verifyErrorText(String errorText) {
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        Assert.assertEquals(errorText, loginPage.verifyErrorUnregisteredEmailText());
    }



}

package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;

public class RegisterPageSteps {
    @Given("User already on register page")
    public void userAlreadyOnRegisterPage(){
    LandingPage landingPage = new LandingPage(Hooks.webDriver);
    LoginPage loginPage = new LoginPage(Hooks.webDriver);

    landingPage.clickLogin();
    loginPage.clickSignUpLoginPage();
    RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
    Assert.assertTrue(registerPage.verifyRegisterPage());
    }

    @Then("Verify user already on register page")
    public void verifyRegisterPage(){
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        Assert.assertTrue(registerPage.verifyRegisterPage());
    }

    @When("User input \"(.*)\" as fullName and input \"(.*)\" as phone and input \"(.*)\" as email and input \"(.*)\" as password and input \"(.*)\" as confirmPassword")
    public void inputCredential(String fullName, String phone, String email, String password, String confirmPassword) throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        registerPage.setFullNameForm(fullName);
        registerPage.setPhoneForm(phone);
        registerPage.setEmailForm(email);
        registerPage.setPasswordForm(password);
        registerPage.setConfirmPasswordForm(confirmPassword);
        registerPage.clickCheckBox();
    }

    @Then("User click register button")
    public void clickRegisterButton() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        registerPage.clickRegister();
        Thread.sleep(6000);
    }

    @And("Verify register success")
    public void verifyRegisterSucces() {
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        Assert.assertEquals("Code OTP", registerPage.verifyRegisterSucces());
    }
    @Then("Verify appear caution message \"(.*)\" on register page")
    public void verifyErrorText(String errorText) {
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        Assert.assertEquals(errorText, registerPage.verifyErrorText());
    }

}

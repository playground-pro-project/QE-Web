package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LandingPage;
import org.example.pageObject.LoginPage;
import org.example.pageObject.OTPPage;
import org.example.pageObject.RegisterPage;
import org.junit.Assert;

import java.util.Random;
import java.util.UUID;

public class OTPPageSteps {
    @Given("User already on OTP page")
    public void userAlreadyOnOTPPage() throws InterruptedException {
        LandingPage landingPage = new LandingPage(Hooks.webDriver);
        LoginPage loginPage = new LoginPage(Hooks.webDriver);
        RegisterPage registerPage = new RegisterPage(Hooks.webDriver);
        OTPPage otpPage = new OTPPage(Hooks.webDriver);


        String characters = "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }

        String randomPhone = "081"+sb.toString();
        String randomEmail = UUID.randomUUID().toString()+"@test.com";

        landingPage.clickLogin();
        loginPage.clickSignUpLoginPage();
        registerPage.setFullNameForm(UUID.randomUUID().toString());
        registerPage.setPhoneForm(randomPhone);
        registerPage.setEmailForm(randomEmail);
        registerPage.setPasswordForm("Password123@");
        registerPage.setConfirmPasswordForm("Password123@");
        registerPage.clickCheckBox();
        registerPage.clickRegister();
        Thread.sleep(6000);
    }

    @When("Set otp \"(.*)\"")
    public void setOTP(String otp) throws InterruptedException {
        OTPPage otpPage = new OTPPage(Hooks.webDriver);
        otpPage.setOTP(otp);
    }

    @Then("User click verify button")
    public void clickVerifyButton() throws InterruptedException {
        OTPPage otpPage = new OTPPage(Hooks.webDriver);
        otpPage.clickOTP();
        Thread.sleep(3000);
    }

    @And("User see caution message \"(.*)\" on OTP page")
    public void verifyErrorText(String errorText) {
        OTPPage otpPage = new OTPPage(Hooks.webDriver);
        Assert.assertEquals(errorText, otpPage.verifyErrorOTPText());
    }



}

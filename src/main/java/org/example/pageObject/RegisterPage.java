package org.example.pageObject;

import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    private WebDriver webDriver;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//p[@class='text-xl font-bold text-white']")
    private WebElement btnRegister;

    @FindBy(xpath = "//input[@id='fullname']")
    private WebElement fullNameForm;

    @FindBy(xpath = "//input[@id='phone']")
    private WebElement phoneForm;
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailForm;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordForm;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement confirmPasswordForm;

    @FindBy(xpath = "//input[@class='checkbox checkbox-primary']")
    private WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    private WebElement errorContainer;

    @FindBy(xpath = "//p[@class='text-3xl font-bold']")
    private WebElement otpPage;


    public void setFullNameForm(String fullName){
        fullNameForm.sendKeys(fullName);
    }

    public void setPhoneForm(String phone){
        phoneForm.sendKeys(phone);
    }

    public void setEmailForm(String email){
        emailForm.sendKeys(email);
    }

    public void setPasswordForm(String password){
        passwordForm.sendKeys(password);
    }

    public void setConfirmPasswordForm(String confirmPassword){
        confirmPasswordForm.sendKeys(confirmPassword);
    }

    public void clickCheckBox(){
        checkBox.click();
    }

    public void clickRegister(){
        btnRegister.click();
    }

    public String verifyErrorText() {
        return errorContainer.getText();
    }


    public boolean verifyRegisterPage(){
        return btnRegister.isDisplayed();
    }

    public String verifyRegisterSucces(){
        return otpPage.getText();
    }
}

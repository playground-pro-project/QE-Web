package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//p[@class='text-xl font-bold text-white']")
    private WebElement btnLoginLoginPage;

    @FindBy(xpath = "//a[.='Sign Up']")
    private WebElement btnSignUpLoginPage;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailForm;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordForm;

    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement errorContainer;



    public void setEmailLoginPage(String email){
        emailForm.sendKeys(email);
    }

    public void setPasswordLoginPage(String password){
        passwordForm.sendKeys(password);
    }

    public void clickLogin(){
        btnLoginLoginPage.click();
    }

    public boolean verifyLoginPage(){
       return btnLoginLoginPage.isDisplayed();
    }

    public boolean clickSignUpLoginPage(){
        btnSignUpLoginPage.click();
        return true;
    }

    public String verifyErrorUnregisteredEmailText() {
        return errorContainer.getText();
    }


}

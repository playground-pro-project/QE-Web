package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OTPPage {
    private WebDriver webDriver;

    public OTPPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//input[@id='otp_code']")
    private WebElement otpForm;

    @FindBy(xpath = "//p[@class='text-xl font-bold text-white']")
    private WebElement btnOTP;

    @FindBy(xpath = "//*[@id=\"swal2-html-container\"]")
    private WebElement errorContainer;


    public void setOTP(String otp){
        otpForm.sendKeys(otp);
    }

    public void clickOTP(){
        btnOTP.click();
    }

    public String verifyErrorOTPText() {
        return errorContainer.getText();
    }


}

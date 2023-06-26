package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BecomeOwnerPage {
    public static WebDriver driver;
    public BecomeOwnerPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Dropdown
    @FindBy(xpath = "")
    private WebElement becomeOwnerButton;
    @FindBy(xpath = "")
    private WebElement profilLogoDropdown;
    public void clickProfilDropdowns() {
        profilLogoDropdown.click();
    }
    public void clickbecomeOwnerButton() {
        becomeOwnerButton.click();
    }

    //Become Owner Page
    @FindBy(xpath = "")
    private WebElement verifyBecomeOwnerShow;
    @FindBy(xpath = "")
    private WebElement submitBecomeOwnerButton;
    @FindBy(xpath = "")
    private WebElement cancelButton;
    @FindBy(xpath = "")
    private WebElement popupSuccessUploadKTP;
    @FindBy(xpath = "")
    private WebElement popupFailedUploadKTP;
    public boolean verifyverifyBecomeOwnerShow() {
        return verifyBecomeOwnerShow.isDisplayed();
    }
    public void clicksubmitBecomeOwnerButton() {
        submitBecomeOwnerButton.click();
    }
    public void clickCancelButton() {
        cancelButton.click();
    }
    public boolean verifySuccessUploadKTPShow() {
        return popupSuccessUploadKTP.isDisplayed();
    }
    public boolean verifyFailedUploadKTPShow() {
        return popupFailedUploadKTP.isDisplayed();
    }

}

package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProfilPage {
    public static WebDriver driver;
    public ProfilPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Login Page
    @FindBy(xpath = "")
    private WebElement emailBox;
    @FindBy(xpath = "")
    private WebElement passwordBox;
    @FindBy(xpath = "")
    private WebElement signInButton;
    public void setEmail(String email) {
        emailBox.sendKeys(email);
    }
    public void setPassword(String password) {
        passwordBox.sendKeys(password);
    }
    public void clickSignIn() {
        signInButton.click();
    }

    //Venue List Page
    @FindBy(xpath = "")
    private WebElement profilLogoDropdown;
    @FindBy(xpath = "")
    private WebElement profileButtonOnDropdown;
    public void clickProfilDropdown() {
        profilLogoDropdown.click();
    }
    public void clickProfilButtonDropdown() {
        profileButtonOnDropdown.click();
    }

    //Profile Page
    @FindBy(xpath = "")
    private WebElement uploadaPhotoButton;
    @FindBy(xpath = "")
    private WebElement profilPictureLogo;
    @FindBy(xpath = "")
    private WebElement popupProfilPictureCantChanged;
    @FindBy(xpath = "")
    private WebElement popupProfilPictureSuccessfullyDeleted;
    @FindBy(xpath = "")
    private WebElement removePhotoButton;
    @FindBy(xpath = "")
    private WebElement deleteAccountButton;
    @FindBy(xpath = "")
    private WebElement settingButton;
    @FindBy(xpath = "")
    private WebElement changePasswordButton;
    @FindBy(xpath = "")
    private WebElement popupPassword;
    @FindBy(xpath = "")
    private WebElement oldPasswordBox;
    @FindBy(xpath = "")
    private WebElement newPasswordBox;
    @FindBy(xpath = "")
    private WebElement confirmPasswordBox;
    @FindBy(xpath = "")
    private WebElement submitButton;
    @FindBy(xpath = "")
    private WebElement passwordSuccessfullyChangedShow;
    @FindBy(xpath = "")
    private WebElement passwordFailedChangedShow;
    public void clickUploadaPhotoButton() {
        uploadaPhotoButton.click();
    }
    public boolean verifyProfilPicture() {
        return profilPictureLogo.isDisplayed();
    }
    public boolean verifyProfilPictureCantChanged() {
        return popupProfilPictureCantChanged.isDisplayed();
    }
    public boolean verifyProfilPictureSuccessfullyDeleted() {
        return popupProfilPictureSuccessfullyDeleted.isDisplayed();
    }
    public void clickRemovePhotoButton() {
        removePhotoButton.click();
    }
    public void clickDeleteAccountButton() {
        deleteAccountButton.click();
    }
    public void clickSettingButton() {
        settingButton.click();
    }
    public void clickChangePasswordButton() {
        changePasswordButton.click();
    }
    public void verifyPopupPassword() {
        popupPassword.isDisplayed();
    }
    public void setOldPassword(String oldPassword) {
        oldPasswordBox.sendKeys(oldPassword);
    }
    public void setNewPassword(String newPassword) {
        newPasswordBox.sendKeys(newPassword);
    }
    public void setConfirmPassword(String confirmPassword) {
        confirmPasswordBox.sendKeys(confirmPassword);
    }
    public void clickSubmitChangePasswordButton() {
        submitButton.click();
    }
    public void verifyPasswordSuccessfullyChanged() {
        passwordSuccessfullyChangedShow.isDisplayed();
    }
    public void verifyPasswordFailedChanged() {
        passwordFailedChangedShow.isDisplayed();
    }


}

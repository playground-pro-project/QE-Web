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
        emailBox.sendKeys(password);
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
    private WebElement removePhotoButton;
    @FindBy(xpath = "")
    private WebElement deleteAccountButton;
    public void clickUploadaPhotoButton() {
        uploadaPhotoButton.click();
    }
    public boolean verifyProfilPicture() {
        return profilPictureLogo.isDisplayed();
    }
    public boolean verifyProfilPictureCantChanged() {
        return popupProfilPictureCantChanged.isDisplayed();
    }
    public void clickRemovePhotoButton() {
        removePhotoButton.click();
    }
    public void clickDeleteAccountButton() {
        deleteAccountButton.click();
    }
}

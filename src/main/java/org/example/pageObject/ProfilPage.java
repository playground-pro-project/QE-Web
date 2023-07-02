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
    //Landing Page
    @FindBy(xpath = "//button[@class='mr-4 btn btn-warning']")
    private WebElement loginButtonOnLandingPage;
    public void clickLoginButtonOnLandingPage() {
        loginButtonOnLandingPage.click();
    }

    //Login Page
    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailBox;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordBox;
    @FindBy(xpath = "//div[@id='btn-login']")
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
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement profilPageShow;
    @FindBy(xpath = "//input[@id='picture_id']")
    private WebElement uploadImage;
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement profilPictureLogo;
    @FindBy(xpath = "")
    private WebElement popupProfilPictureCantChanged;
    @FindBy(xpath = "//h2[@class='swal2-title']")
    private WebElement popupProfilPictureSuccessfullyDeleted;
    @FindBy(xpath = "//label[@class='flex items-center justify-center h-12 gap-3 font-semibold text-white btn btn-ghost hover:text-black bg-error rounded-xl']")
    private WebElement removePhotoButton;
    @FindBy(xpath = "//button[@class='btn btn-error text-white px-3 rounded-md text-center text-bold']")
    private WebElement deleteAccountButton;
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement accountSuccessDeleteShow;
    @FindBy(xpath = "//label[@class='btn btn-wide btn-primary text-white']")
    private WebElement changePasswordButton;
    @FindBy(xpath = "//p[contains(.,'Old Password:')]")
    private WebElement popupPassword;
    @FindBy(xpath = "//input[@id='old_password']")
    private WebElement oldPasswordBox;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement newPasswordBox;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    private WebElement confirmPasswordBox;
    @FindBy(xpath = "//button[@class='btn btn-wide btn-primary text-white translate-y-1']")
    private WebElement submitButton;
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement passwordSuccessfullyChangedShow;
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement passwordFailedChangedShow;
    @FindBy(xpath = "//button[@class='btn btn-primary text-white px-3 py-2 rounded-md text-center text-bold']")
    private WebElement submitButtonToAddImageonProfile;
    public boolean verifyProfilPageShow() {
        return profilPageShow.isDisplayed();
    }
    String pathImageProfil = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";
    //String pathImageProfil = System.getProperty("user.dir")+"/src/test/resources/input_files/";
    public void chooseUploadImage(String imageFile){
        uploadImage.sendKeys(pathImageProfil+(imageFile));
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
    public boolean verifyAccountSuccessDeleteShow() {
        return accountSuccessDeleteShow.isDisplayed();
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
    public void clickSubmitButtonToAddImageonProfile() {
        submitButtonToAddImageonProfile.click();
    }


}

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
    @FindBy(xpath = "//a[.='Become Owner']")
    private WebElement becomeOwnerButton;
    @FindBy(xpath = "//img[@id='avatar']")
    private WebElement profilLogoDropdown;
    public void clickProfilDropdowns() {
        profilLogoDropdown.click();
    }
    public void clickbecomeOwnerButton() {
        becomeOwnerButton.click();
    }

    //Become Owner Page
    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-neutral uppercase items-center']")
    private WebElement verifyBecomeOwnerShow;
    @FindBy(xpath = "//input[@id='profile_picture']")
    private WebElement uploadKTP;
    @FindBy(xpath = "//button[@class='btn bg-primary w-48 h-8 text-white rounded-lg']")
    private WebElement submitBecomeOwnerButton;
    @FindBy(xpath = "//button[@class='btn bg-gray-500 w-48 text-white rounded-lg']")
    private WebElement cancelButton;
    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-neutral uppercase items-center']")
    private WebElement popupSuccessUploadKTP;
    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-neutral uppercase items-center']")
    private WebElement popupFailedUploadKTP;
    public boolean verifyverifyBecomeOwnerShow() {
        return verifyBecomeOwnerShow.isDisplayed();
    }
    String pathImageKTP = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";
    public void chooseUploadKTP(String imageFile){
        uploadKTP.sendKeys(pathImageKTP+(imageFile));
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

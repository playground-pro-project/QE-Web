package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfilPage {
    public static WebDriver driver;
    public EditProfilPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Dropdown
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

    //Profil Page
    @FindBy(xpath = "")
    private WebElement settingButton;
    @FindBy(xpath = "")
    private WebElement editProfilButton;
    public void clickSettingButton() {
        settingButton.click();
    }
    public void clickEditProfilButton() {
        editProfilButton.click();
    }

    //Edit Profil Page
    @FindBy(xpath = "")
    private WebElement verifyEditProfilShow;
    @FindBy(xpath = "")
    private WebElement nameBox;
    @FindBy(xpath = "")
    private WebElement emailBox;
    @FindBy(xpath = "")
    private WebElement phoneBox;
    @FindBy(xpath = "")
    private WebElement addressBox;
    @FindBy(xpath = "")
    private WebElement bioBox;
    @FindBy(xpath = "")
    private WebElement saveButton;
    @FindBy(xpath = "")
    private WebElement successPopup;
    public void verifyEditProfil() {
        verifyEditProfilShow.isDisplayed();
    }
    public void setName(String email) {
        nameBox.sendKeys(email);
    }
    public void setEmail(String email) {
        emailBox.sendKeys(email);
    }
    public void setPhone(String email) {
        phoneBox.sendKeys(email);
    }
    public void setAddress(String email) {
        addressBox.sendKeys(email);
    }
    public void setBio(String email) {
        bioBox.sendKeys(email);
    }
    public void clickSaveButton() {
        saveButton.click();
    }
    public void verifySuccessPopup() {
        successPopup.isDisplayed();
    }







}

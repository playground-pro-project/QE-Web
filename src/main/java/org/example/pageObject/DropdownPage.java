package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {
    public static WebDriver driver;
    public DropdownPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Venue List Page for User
    @FindBy(xpath = "")
    private WebElement profilLogoDropdown;
    @FindBy(xpath = "")
    private WebElement profileButtonOnDropdown;
    @FindBy(xpath = "")
    private WebElement myTransactionButtonOnDropdown;
    @FindBy(xpath = "")
    private WebElement BecomeOwnerButtonOnDropdown;
    @FindBy(xpath = "")
    private WebElement logoutButtonOnDropdown;
    public void clickProfilDropdown() {
        profilLogoDropdown.click();
    }
    public void clickProfilButtonDropdown() {
        profileButtonOnDropdown.click();
    }
    public void clickmyTransactionButtonOnDropdown() {
        myTransactionButtonOnDropdown.click();
    }
    public void clickBecomeOwnerButtonOnDropdown() {
        BecomeOwnerButtonOnDropdown.click();
    }
    public void clicklogoutButtonOnDropdown() {
        logoutButtonOnDropdown.click();
    }

    //Venue List Page for Hoster
    @FindBy(xpath = "")
    private WebElement myVenueButtonOnDropdown;
    public void clickmyVenueButtonOnDropdown() {
        myVenueButtonOnDropdown.click();
    }

    //Profil Page
    @FindBy(xpath = "")
    private WebElement profilPageShow;
    public boolean verifyProfilPage() {
        return profilPageShow.isDisplayed();
    }

    //My Transaction Page
    @FindBy(xpath = "")
    private WebElement MyTransactionPageShow;
    public boolean verifyMyTransactionPage() {
        return MyTransactionPageShow.isDisplayed();
    }

    //Become Owner Page
    @FindBy(xpath = "")
    private WebElement BecomeOwnerPageShow;
    public boolean verifyBecomeOwnerPage() {
        return BecomeOwnerPageShow.isDisplayed();
    }

    //Landing Page
    @FindBy(xpath = "")
    private WebElement LandingPageShow;
    public boolean verifyLandingPage() {
        return LandingPageShow.isDisplayed();
    }

    //My Venue Page
    @FindBy(xpath = "")
    private WebElement MyVenuePageShow;
    public boolean verifyMyVenuePage() {
        return MyVenuePageShow.isDisplayed();
    }
}

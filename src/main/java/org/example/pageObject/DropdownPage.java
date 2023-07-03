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
    @FindBy(xpath = "//img[@id='avatar']")
    private WebElement profilLogoDropdown;
    @FindBy(xpath = "//li[@id='nav-profile']/a[@href='/profile']/a[.='Profile']")
    private WebElement profileButtonOnDropdown;
    @FindBy(xpath = "//a[@href='/mytransaction']/a[.='My Transaction']")
    private WebElement myTransactionButtonOnDropdown;
    @FindBy(xpath = "//a[.='Become Owner']")
    private WebElement BecomeOwnerButtonOnDropdown;
    @FindBy(xpath = "//a[.='Logout']")
    private WebElement logoutButtonOnDropdown;
    @FindBy(xpath = "//button[@class='swal2-confirm swal2-styled swal2-default-outline']")
    private WebElement popUpYesLogoutButton;
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
    public void clickpopUpYesLogoutButton() {
        popUpYesLogoutButton.click();
    }

    //Venue List Page for Hoster
    @FindBy(xpath = "//a[@href='/myvenue']")
    private WebElement myVenueButtonOnDropdown;
    public void clickmyVenueButtonOnDropdown() {
        myVenueButtonOnDropdown.click();
    }

    //Profil Page
    @FindBy(xpath = "//p[@class='text-[#291334] text-5xl tracking-wider font-bold text-center']")
    private WebElement profilPageShow;
    public boolean verifyProfilPage() {
        return profilPageShow.isDisplayed();
    }

    //My Transaction Page
    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-neutral uppercase']")
    private WebElement MyTransactionPageShow;
    public boolean verifyMyTransactionPage() {
        return MyTransactionPageShow.isDisplayed();
    }

    //Become Owner Page
    @FindBy(xpath = "//p[@class='text-4xl font-semibold text-neutral uppercase items-center']")
    private WebElement BecomeOwnerPageShow;
    public boolean verifyBecomeOwnerPage() {
        return BecomeOwnerPageShow.isDisplayed();
    }

    //Landing Page
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement LandingPageShow;
    public boolean verifyLandingPage() {
        return LandingPageShow.isDisplayed();
    }

    //My Venue Page
    @FindBy(xpath = "//div[@class='text-2xl font-bold']")
    private WebElement MyVenuePageShow;
    public boolean verifyMyVenuePage() {
        return MyVenuePageShow.isDisplayed();
    }






}

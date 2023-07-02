package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyVenuePage {
    public static WebDriver driver;
    public MyVenuePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //My Venue Page
    @FindBy(xpath = "//label[@class='w-32 mt-1 font-medium text-white btn btn-primary']")
    private WebElement addVenueButton;
    @FindBy(xpath = "//div[@class='flex items-center justify-center w-full text-2xl font-semibold text-darkBlue']")
    private WebElement addVenuePopup;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement venueNameBox;
    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement descriptionBox;
    @FindBy(xpath = "//div[@class='flex items-center justify-center w-full text-2xl font-semibold text-darkBlue']")
    private WebElement successAddVenueShow;
//    @FindBy(xpath = "//input[@id='location']")
//    private WebElement locationBox;
    @FindBy(xpath = "//button[@class='w-32 text-white btn btn-primary']")
    private WebElement submitButtonMyVenuePage;
    @FindBy(xpath = "//div[@class='flex flex-wrap justify-center gap-5 p-5']/div[1]//p[@class='mt-2 text-2xl font-bold text-oren']")
    private WebElement basket201Button;
    @FindBy(xpath = "//label[@class='flex items-center justify-center h-12 gap-3 font-semibold text-white btn btn-ghost hover:text-black bg-warning rounded-xl']")
    private WebElement editBasket201Button;
    @FindBy(xpath = "//div[.='Edit Venue']")
    private WebElement editVenuePopUpBasket201;
    @FindBy(xpath = "//input[@id='name']")
    private WebElement venueNameBasket201Box;
    @FindBy(xpath = "//input[@id='location']")
    private WebElement locationBasket201Box;
    @FindBy(xpath = "//textarea[@id='description']")
    private WebElement descriptionBasket201Box;
    @FindBy(xpath = "//button[@id='btn-save']")
    private WebElement saveButtonBasket201;
    @FindBy(xpath = "//div[.='Edit Venue']")
    private WebElement successEditVenueBasket201;
    public void clickAddVenueButton() {
        addVenueButton.click();
    }
    public boolean verifyAddVenuePopup() {
        return addVenuePopup.isDisplayed();
    }
    public void setVenueNameBox(String name) {
        venueNameBox.sendKeys(name);
    }
    public void setDescriptionBox(String desc) {
        descriptionBox.sendKeys(desc);
    }
//    public void setLocationBox(String loc) {
//        locationBox.sendKeys(loc);
//    }
    public void clickSubmitButtonMyVenuePage() {
        submitButtonMyVenuePage.click();
    }
    public boolean verifyVenueCantAdded() {
        return addVenuePopup.isDisplayed();
    }
    public void clickBasket201Button() {
        basket201Button.click();
    }
    public void clickEditBasket201Button() {
        editBasket201Button.click();
    }
    public boolean verifyEditVenuePopUpBasket201() {
        return editVenuePopUpBasket201.isDisplayed();
    }
    public void setvenueNameBasket201Box(String name) {
        venueNameBasket201Box.sendKeys(name);
    }
    public void setlocationBasket201Box(String loc) {
        locationBasket201Box.sendKeys(loc);
    }
    public void setDescriptionBasket201Box(String desc) {
        descriptionBasket201Box.sendKeys(desc);
    }
    public void clickSaveButtonBasket201() {
        saveButtonBasket201.click();
    }
    public boolean verifySuccessEditVenueBasket201() {
        return successEditVenueBasket201.isDisplayed();
    }
    public boolean verifySuccessAddVenueShow() {
        return  successAddVenueShow.isDisplayed();
    }










}

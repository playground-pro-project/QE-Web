package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private WebDriver webDriver;

    public LandingPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = webDriver;
    }

    public static String FIRST_PAGE_VENUE_ID;

    @FindBy(xpath = "//button[@class='mr-4 btn btn-warning']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='flex flex-wrap justify-center gap-5 p-10']/div[1]//img[@alt='Image Cover']")
    private WebElement singleVenue;

    @FindBy(xpath = "//div[@class='flex items-center gap-3 mt-5 text-xl font-semibold text-gray-500']")
    private WebElement venueName;

    @FindBy(xpath = "//p[@class='px-4 mt-5 text-3xl font-bold']")
    private WebElement bestOffers;

    @FindBy(xpath = "//div[@class='flex flex-wrap justify-center gap-5 p-10']/div[1]")
    private WebElement firstCardVenue;

    @FindBy(xpath = "//button[@id='next-page']")
    private WebElement nextPageButton;


    public void clickSingleVenue() {
        singleVenue.click();
    }

    public boolean isLandinPageDisplayed(){
        return bestOffers.isDisplayed();
    }

    public boolean isDisplayedSingleVenue(){
        venueName.isDisplayed();
        return true;
    }


    public void clickLogin() {
        btnLogin.click();
    }

    public String getIdVenue() {
        return firstCardVenue.getAttribute("id");
    }

    public void clickNextPageButton() throws InterruptedException {
        nextPageButton.click();
    }

}

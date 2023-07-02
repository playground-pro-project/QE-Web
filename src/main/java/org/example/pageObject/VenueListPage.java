package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenueListPage {
    private WebDriver webDriver;

    public VenueListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.webDriver = webDriver;
    }




    @FindBy(xpath = "//div[@class='flex flex-wrap justify-center gap-5 p-10']/div[1]//img[@alt='Image Cover']")
    private WebElement ClickVenue;

    @FindBy(xpath = "//button[@class='w-full h-12 font-semibold text-white bg-primary rounded-xl']")
    private WebElement CheckAvailabilityButton;

    @FindBy(xpath = "//div[@class='mt-10 ml-10 text-3xl font-semibold text-center']")
    private WebElement titleVenueDetail;



    public void clickVenue() throws InterruptedException {
        Thread.sleep(2000);
        ClickVenue.click();
    }

    public void verifyDetailVenue() {
        CheckAvailabilityButton.isDisplayed();
    }

    public void clickCheckAvailabilityButton() throws InterruptedException {
        CheckAvailabilityButton.click();
        Thread.sleep(2000);
    }

    public void verifyVenueDetailPage() {
        titleVenueDetail.isDisplayed();
    }


}

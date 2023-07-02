package org.example.pageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VenueDetailPage {
    public static WebDriver driver;
    public VenueDetailPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "")
    private WebElement editButtonOnVenueDetailPage;
    @FindBy(xpath = "//label[@class='flex items-center justify-center h-12 gap-3 font-semibold text-white btn btn-ghost hover:text-black bg-primary rounded-xl']")
    private WebElement addImageButton;
    @FindBy(xpath = "//div[.='Add Image']")
    private WebElement popupAddImageOnVenueDetail;
    @FindBy(xpath = "//div[@id='upload-image']")
    private WebElement uploadVenueImage;
    @FindBy(xpath = "//button[@id='btn-submit']")
    private WebElement submitAddImageButton;
    @FindBy(xpath = "//span[@class='swal2-x-mark-line-left']")
    private WebElement successImageUploadShow;
    @FindBy(xpath = "//div[@class='swal2-html-container']")
    private WebElement failedImageUploadShow;
    @FindBy(xpath = "//p[.='Basket203']")
    private WebElement basket203ButtonThatWillDeleted;
    @FindBy(xpath = "//div[@id='map']")
    private WebElement basket203DeleteButton;
    @FindBy(xpath = "//div[@class='w-4/5 text-4xl font-bold']")
    private WebElement successDeleteShow;
    public void clickEditButtonOnVenueDetailPage() {
        editButtonOnVenueDetailPage.click();
    }
    public void clickAddImageButton() {
        addImageButton.click();
    }
    public boolean verifyPopupAddImageOnVenueDetail() {
        return popupAddImageOnVenueDetail.isDisplayed();
    }
   // String pathVenueImage = System.getProperty("user.dir")+"/src/test/resources/input_files/";
    String pathVenueImage = System.getProperty("user.dir")+"\\src\\test\\resources\\input_files\\";
    public void chooseUploadVenueImage(String imageFile){
        uploadVenueImage.sendKeys(pathVenueImage+(imageFile));
    }
    public void clickSubmitAddImageButton() {
        submitAddImageButton.click();
    }
    public boolean verifySuccessImageUploadShow() {
        return successImageUploadShow.isDisplayed();
    }
    public boolean verifyFailedImageUploadShow() {
        return failedImageUploadShow.isDisplayed();
    }
    public void clickBasket203ButtonThatWillDeleted() {
        basket203ButtonThatWillDeleted.click();
    }
    public void clickBasket203DeleteButton() {
        basket203DeleteButton.click();
    }
    public boolean verifySuccessDeleteShow() {
        return successDeleteShow.isDisplayed();
    }

}

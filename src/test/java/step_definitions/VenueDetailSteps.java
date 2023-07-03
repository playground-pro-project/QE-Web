package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.HistoryPage;
import org.example.pageObject.ProfilPage;
import org.example.pageObject.VenueDetailPage;
import org.openqa.selenium.WebDriver;

public class VenueDetailSteps {
    private WebDriver webDriver;
    public VenueDetailSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("hoster click on 'Edit' button")
    public void hosterClickOnEditButton() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.clickEditButtonOnVenueDetailPage();
    }
    @When("hoster click on 'Add Image' button")
    public void hosterClickOnAddImageButton() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.clickAddImageButton();
    }
    @And("pop up 'Upload Your Image' is appear")
    public void popUpUploadYourImageIsAppear() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.verifyPopupAddImageOnVenueDetail();
    }
    @And("hoster select file from directory \"(.*)\"")
    public void chooseImageFromExplorers(String imageFile) {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.chooseUploadVenueImage(imageFile);
    }
    @And("click submit")
    public void clickSubmit() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.clickSubmitAddImageButton();
    }
    @And("picture successfully uploaded")
    public void pictureSuccessfullyUploaded() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.verifySuccessImageUploadShow();
    }
    @And("picture can not uploaded")
    public void pictureCanNotUploaded() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.verifyFailedImageUploadShow();
    }

    //Delete Venue
    @And("hoster click venue that want to delete")
    public void hosterClickVenueThatWantToDelete() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.clickBasket203ButtonThatWillDeleted();
    }
    @Then("hoster click on 'Delete' button")
    public void hosterClickOnDeleteButton() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.clickBasket203DeleteButton();
    }
    @And("venue successfully deleted")
    public void venueSuccessfullyDeleted() {
        VenueDetailPage venueDetailPage = new VenueDetailPage(webDriver);
        venueDetailPage.verifySuccessDeleteShow();
    }
}

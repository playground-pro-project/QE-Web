package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.HistoryPage;
import org.example.pageObject.MyVenuePage;
import org.example.pageObject.ProfilPage;
import org.openqa.selenium.WebDriver;

public class MyVenueSteps {
    private WebDriver webDriver;
    public MyVenueSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Add Review 1
    @Then("hoster click on 'Add Venue' buttons")
    public void verifyVenueDetailPage() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.clickAddVenueButton();
    }
    @And("'Add Venue' pop up will showed")
    public void addVenuePopUpWillShowed() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.verifyAddVenuePopup();
    }
//    @When("hoster input \"(.*)\" as Venue Name, \"(.*)\" as Description, and choose locations")
//    public void hosterInputAsVenueNameAsDescriptionAndChooseLocation(String name, String desc) {
//        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
//        myVenuePage.setVenueNameBox(name);
//        myVenuePage.setDescriptionBox(desc);
//    }
    @When("input \"(.*)\" as venue name, \"(.*)\" as Description, and choose locations")
    public void inputValidEditVenue(String name, String des) {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.setVenueNameBox(name);
        myVenuePage.setDescriptionBox(des);
    }

    @Then("hoster click 'Submit' button")
    public void hosterClickSubmitButton() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.clickSubmitButtonMyVenuePage();
    }
    @And("Venue can be added")
    public void venueCanBeAdded() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.verifySuccessAddVenueShow();
    }
    @When("hoster input \"(.*)\" as Description and \"(.*)\" as location")
    public void setAddVenueInvalid(String desc, String loc) {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.setDescriptionBox(desc);
    }
    @Then("new venue can't be added")
    public void newVenueCanTBeAdded() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.verifyVenueCantAdded();
    }

    //Edit Venue 1
    @And("user click on one of the venue")
    public void userClickOnOneOfTheVenue() throws InterruptedException {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.clickBasket201Button();
        Thread.sleep(2000);
    }
    @And("click on 'Edit' button")
    public void clickOnEditButton() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.clickEditBasket201Button();
    }
    @And("'Edit Venue' pop up appear")
    public void editVenuePopUpAppear() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.verifyEditVenuePopUpBasket201();
    }
    @When("hoster input \"(.*)\" as Venues Name, \"(.*)\" as Location, \"(.*)\" as Description")
    public void inputData1(String name, String loc, String desc) {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.setvenueNameBasket201Box(name);
        myVenuePage.setlocationBasket201Box(loc);
        myVenuePage.setDescriptionBasket201Box(desc);
    }
    @When("hoster input \"(.*)\" as Venue Name")
    public void inputData2(String name) {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.setvenueNameBasket201Box(name);
    }
    @And("click 'Save' button")
    public void clickSaveButton() throws InterruptedException {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.clickSaveButtonBasket201();
        Thread.sleep(2000);
    }
    @Then("Venue's information is updated")
    public void venueSInformationIsUpdated() {
        MyVenuePage myVenuePage = new MyVenuePage(webDriver);
        myVenuePage.verifySuccessEditVenueBasket201();
    }


}

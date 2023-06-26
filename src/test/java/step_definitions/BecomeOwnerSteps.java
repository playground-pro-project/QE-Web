package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.pageObject.BecomeOwnerPage;
import org.openqa.selenium.WebDriver;

public class BecomeOwnerSteps {
    private WebDriver webDriver;
    public BecomeOwnerSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Become Owner 1
    @When("hoster click 'Profil' buttons")
    public void clickProfilLogoDropdowns() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.clickProfilDropdowns();
    }
    @And("select 'Became Owner' buttons")
    public void selectBecomeOwner() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.clickbecomeOwnerButton();
    }
    @And("'Became Owner' pages is showed")
    public void verifyBecomeOwnerPage() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.verifyverifyBecomeOwnerShow();
    }
    @And("click 'Become Owner' buttons")
    public void clickBecomeOwnerButton() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.clicksubmitBecomeOwnerButton();
    }
    @And("ktp pictures successfully uploaded")
    public void verifySuccessUploadKTP() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.verifySuccessUploadKTPShow();
    }

    //Become Owner 2
    @And("invalid pictures can not be uploaded")
    public void verifyFailedUploadKTP() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.verifyFailedUploadKTPShow();
    }

    //Become Owner 3
    @And("hoster click on 'Cancel' buttons")
    public void clickOnCancelButton() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.clickCancelButton();
    }
    @And("no picture uploaded")
    public void verifyNoPictureUploaded() {
        BecomeOwnerPage becomeOwnerPage = new BecomeOwnerPage(webDriver);
        becomeOwnerPage.verifyverifyBecomeOwnerShow();
    }

}

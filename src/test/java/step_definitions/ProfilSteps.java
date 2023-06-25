package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.ProfilPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ProfilSteps {
    private WebDriver webDriver;
    public ProfilSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Positive Case 1
    @Given("user already do logins with \"(.*)\" as email and \"(.*)\" as password")
    public void loginProcess(String email, String password) {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setEmail(email);
        profilPage.setPassword(password);
        profilPage.clickSignIn();
    }
    @And("already on 'Profil' pages")
    public void verifyProfilPage() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickProfilDropdown();
        profilPage.clickProfilButtonDropdown();
    }
    @When("user click 'Upload a photo' buttons")
    public void clickUploadPhoto() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickUploadaPhotoButton();
    }
    @Then("profil pictures successfully changed")
    public void verifyProfilPicture() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyProfilPicture());
    }

    //Negative Case 1
    @Then("profil pictures can't be changed")
    public void verifyProfilPictureNotChanged() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyProfilPictureCantChanged());
    }

    //Negative Case 2
    @When("user click 'Remove a photo' buttons")
    public void clickRemovePhoto() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickRemovePhotoButton();
    }
    @Then("profil pictures was deleted")
    public void verifyPictureIsDeleted() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyProfilPictureCantChanged());
    }

    //Delete Account
    @And("click on 'Delete Account' buttons")
    public void clickDeleteAccount() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickDeleteAccountButton();
    }
}

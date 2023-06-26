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

    //Change Profil Picture 1
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

    //Change Profil Picture 2
    @Then("profil pictures can't be changed")
    public void verifyProfilPictureNotChanged() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyProfilPictureCantChanged());
    }

    //Change Profil Picture 3
    @When("user click 'Remove a photo' buttons")
    public void clickRemovePhoto() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickRemovePhotoButton();
    }
    @Then("profil pictures was deleted")
    public void verifyPictureIsDeleted() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        Assert.assertTrue(profilPage.verifyProfilPictureSuccessfullyDeleted());
    }

    //Delete Account
    @And("click on 'Delete Account' buttons")
    public void clickDeleteAccount() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickDeleteAccountButton();
    }

    //Change Password 1
    @Then("user click on setting buttons")
    public void clickSettingButton() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickSettingButton();
    }
    @And("selects 'Change Password'")
    public void selectChangePassword() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickChangePasswordButton();
    }
    @When("'Change Password' pop up will appears")
    public void verifyPopupChangePassword() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.verifyPopupPassword();
    }
    @And("user inputs \"(.*)\" as Old Password, \"(.*)\" as New Password, and \"(.*)\" as Confirm Password")
    public void inputPassword(String oldPwd, String newPwd, String confirmPwd) {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setOldPassword(oldPwd);
        profilPage.setNewPassword(newPwd);
        profilPage.setConfirmPassword(newPwd);
    }
    @Then("user click submits")
    public void clickSubmitPassword() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.clickSubmitChangePasswordButton();
    }
    @And("passwords successfully changed")
    public void verifyChangePasswordSuccess() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.verifyPasswordSuccessfullyChanged();
    }

    //Change Password 2
    @And("passwords can't be changed")
    public void verifyChangePasswordFailed() {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.verifyPasswordFailedChanged();
    }




}

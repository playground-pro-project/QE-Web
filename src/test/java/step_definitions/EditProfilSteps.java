package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.DropdownPage;
import org.example.pageObject.EditProfilPage;
import org.openqa.selenium.WebDriver;

public class EditProfilSteps {
    private WebDriver webDriver;
    public EditProfilSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Positive Case 1
    @And("user already on 'Edit Profil' pages")
    public void verifyEditProfilPage() {
        EditProfilPage editProfilPage = new EditProfilPage(webDriver);
        editProfilPage.verifyEditProfil();
    }
    @When("user inputs \"(.*)\" as Name, \"(.*)\" as Email, \"(.*)\" as Phone")
    public void inputFirstEdit(String name, String email, String phone) {
        EditProfilPage editProfilPage = new EditProfilPage(webDriver);
        editProfilPage.setName(name);
        editProfilPage.setEmail(email);
        editProfilPage.setPhone(phone);
    }
    @And("inputs \"(.*)\" as Address, \"(.*)\" as Bio")
    public void inputSecondEdit(String address, String bio) {
        EditProfilPage editProfilPage = new EditProfilPage(webDriver);
        editProfilPage.setAddress(address);
        editProfilPage.setBio(bio);
    }
    @Then("user click on save buttons")
    public void clickSaveButton() {
        EditProfilPage editProfilPage = new EditProfilPage(webDriver);
        editProfilPage.clickSaveButton();
    }
    @And("user's new profils will be saved")
    public void popupSuccess() {
        EditProfilPage editProfilPage = new EditProfilPage(webDriver);
        editProfilPage.verifySuccessPopup();
    }









}

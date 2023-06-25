package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.DropdownPage;
import org.example.pageObject.ProfilPage;
import org.openqa.selenium.WebDriver;

public class DropdownSteps {
    private WebDriver webDriver;
    public DropdownSteps() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    //Positive Case 1
    @When("user click 'Profil' buttons")
    public void clickProfilLogoDropdown() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilDropdown();
    }
    @And("selects 'Profil'")
    public void clickProfilButton() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilButtonDropdown();
    }
    @Then("'Profil' pages is showed")
    public void verifyProfilPage() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyProfilPage();
    }

    //Positive Case 2
    @And("selects 'My Transaction'")
    public void selectMyTransactionButton() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickmyTransactionButtonOnDropdown();
    }
    @Then("'History' pages is showed")
    public void verifyHistoryPage() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyMyTransactionPage();
    }

    //Positive Case 3
    @And("click on 'Become Owner' buttons")
    public void clickBecomeOwner() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickBecomeOwnerButtonOnDropdown();
    }
    @Then("user will redirected to 'Became Owner' pages")
    public void verifyBecomeOwner() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyBecomeOwnerPage();
    }

    //Positive Case 4
    @And("click on 'Logout' buttons")
    public void clickLogout() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clicklogoutButtonOnDropdown();
    }
    @Then("user will redirected to 'Landing' pages")
    public void verifyLandingPage() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyLandingPage();
    }

    //Positive Case 5
    @Given("Hoster already do logins with \"(.*)\" as email and \"(.*)\" as password")
    public void loginProcess(String email, String password) {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setEmail(email);
        profilPage.setPassword(password);
        profilPage.clickSignIn();
    }
    @When("Hoster click 'Profil' buttons")
    public void clickProfilLogoDropdownHoster() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilDropdown();
    }

    //Positive Case 7
    @And("click on 'My Venue' buttons")
    public void clickMyVenue() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickmyVenueButtonOnDropdown();
    }
    @Then("user will redirected to 'My Venue' pages")
    public void verifyMyVenuePage() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyMyVenuePage();
    }

}

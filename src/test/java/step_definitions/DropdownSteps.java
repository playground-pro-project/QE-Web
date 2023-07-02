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
    @And("user click 'Profil' buttons")
    public void clickProfilLogoDropdown() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilDropdown();
    }
    @And("selects 'Profil'")
    public void clickProfilButton() throws InterruptedException {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilButtonDropdown();
        Thread.sleep(2000);
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
    public void verifyBecomeOwner() throws InterruptedException {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyBecomeOwnerPage();
        Thread.sleep(2000);
    }

    //Positive Case 4
    @And("click on 'Logout' buttons")
    public void clickLogout() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clicklogoutButtonOnDropdown();
    }
    @And("^click on 'Yes, Logout!' button$")
    public void clickOnYesLogoutButton() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickpopUpYesLogoutButton();
    }
    @Then("user will redirected to 'Landing' pages")
    public void verifyLandingPage() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyLandingPage();
    }

    //Positive Case 5
    @Given("Hoster already do logins with \"(.*)\" as email and \"(.*)\" as password")
    public void loginProcess(String email, String password) throws InterruptedException {
        ProfilPage profilPage = new ProfilPage(webDriver);
        profilPage.setEmail(email);
        profilPage.setPassword(password);
        profilPage.clickSignIn();
        Thread.sleep(3000);
    }
    @And("Hoster click 'Profil' buttons")
    public void clickProfilLogoDropdownHoster() {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickProfilDropdown();
    }

    //Positive Case 7
    @And("click on 'My Venue' buttons")
    public void clickMyVenue() throws InterruptedException {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.clickmyVenueButtonOnDropdown();
        Thread.sleep(2000);
    }
    @Then("user will redirected to 'My Venue' pages")
    public void verifyMyVenuePage() throws InterruptedException {
        DropdownPage dropdownPage = new DropdownPage(webDriver);
        dropdownPage.verifyMyVenuePage();
        Thread.sleep(2000);
    }


}

package steps;

import POM.HermesRegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.time.Duration;

public class Stepdefs_HermesRegisterSteps {

    private WebDriver driver;

    HermesRegisterPage registerPage=new HermesRegisterPage();

    @Given("go to website")
    public void goToWebsite() {
        driver = Driver.getDriver();

        driver.manage().window().maximize();
        driver.get("https://www.myhermes.de/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }

    @And("handle the cookie")
    public void handleTheCookie() {
        registerPage.clickOnAcceptCookiesButton();
    }

    @Then("click on Mein Konto button")
    public void clickOnMeinKontoButton() {
        registerPage.clickOnMeinKontoButton();
    }

    @When("click on Jetzt Konto erstellen button")
    public void clickOnJetztKontoErstellenButton() {
        registerPage.clickOnSignUpButtontoCreateNewAccount();
    }

    @Then("the user should be navigated to register page")
    public void theUserShouldBeNavigatedToRegisterPage() {
    }

    @Then("choose a titel")
    public void chooseATitel() {
        registerPage.selectTheGenderForSalutation();
    }

    @And("type a username {string}")
    public void typeAUsername(String username) {
        registerPage.typeUsername(username);
    }

    @And("type an Email address {string}")
    public void typeAnEmailAddress(String email) {
        registerPage.typeEmail(email);
    }

    @And("type a password {string}")
    public void typeAPassword(String password) {
        registerPage.typePassword(password);
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        registerPage.typeFirstName(firstname);
        registerPage.typeLastName(lastname);
    }

    @And("type a street {string} and house number {string}")
    public void typeAStreetAndHouseNumber(String street, String houseNumber) {
        registerPage.typeStreetName(street);
        registerPage.typeHouseNumber(houseNumber);
    }

    @And("type a PLZ {string} and place {string}")
    public void typeAPLZAndPlace(String PLZ, String city) {
        registerPage.typePostLeitZahl(PLZ);
        registerPage.typeCityName(city);
    }

    @Then("click on register button")
    public void clickOnRegisterButton() {
        registerPage.clickOnRegisterButton();
    }


    @After
    public void quitDriver(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.quit();
    }


}

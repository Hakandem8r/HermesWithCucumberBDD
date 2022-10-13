package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HermesRegisterPage extends AbstractClass {

    WebDriver driver;

    public HermesRegisterPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".m-navigation-account")
    private WebElement meinKontoButton;

    @FindBy(css = "button[aria-label='Accept']")
    private WebElement cookiesButton;

    @FindBy(css = "a#login-form-link")
    private WebElement signUpButton;

    @FindBy(css = "select#salutation")
    private WebElement gender;

    @FindBy(css = "input#username")
    private WebElement username;

    @FindBy(css = "input#email")
    private WebElement email;

    @FindBy(css = "input#password")
    private WebElement password;

    @FindBy(css = "[data-wt-name='firstname']")
    private WebElement firstname;

    @FindBy(css = "[data-wt-name='lastname']")
    private WebElement lastname;

    @FindBy(css = "[data-wt-name='street']")
    private WebElement street;

    @FindBy(css = "[data-wt-name='houseNumber']")
    private WebElement houseNumber;

    @FindBy(css = "[data-wt-name='zipCode']")
    private WebElement postLeitZahl;

    @FindBy(css = "[data-wt-name='city']")
    private WebElement city;

    @FindBy(css = ".btn.btn-block.btn-primary")
    private WebElement registerButton;


    public void clickOnMeinKontoButton(){
        clickFunction(meinKontoButton);
    }

    public void clickOnAcceptCookiesButton(){
        clickFunction(cookiesButton);
    }

    public void clickOnSignUpButtontoCreateNewAccount(){
        clickFunction(signUpButton);
    }

    public void selectTheGenderForSalutation(){
        selectElementFromDropdown(gender,"Herr");
    }

    public void typeUsername(String userName){
        sendKeysFunction(username,userName);
    }

    public void typeEmail(String eMail){
        sendKeysFunction(email,eMail);
    }

    public void typePassword(String pass){
        sendKeysFunction(password,pass);
    }

    public void typeFirstName(String firstName){
        sendKeysFunction(firstname,firstName);
    }

    public void typeLastName(String lastName){
        sendKeysFunction(lastname,lastName);
    }

    public void typeStreetName(String streetName){
        sendKeysFunction(street,streetName);
    }

    public void typeHouseNumber(String HouseNumber){
        sendKeysFunction(houseNumber,HouseNumber);
    }

    public void typePostLeitZahl(String PLZ){
        sendKeysFunction(postLeitZahl,PLZ);
    }

    public void typeCityName(String cityName){
        sendKeysFunction(city,cityName);
    }

    public void clickOnRegisterButton(){
        clickFunction(registerButton);
    }
}

package steps;

import POM.HermesHeaderMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class _2_Stepdefs_HeaderMenuSteps {

    HermesHeaderMenuPage headerMenuPage=new HermesHeaderMenuPage();

    @Then("check the header menu elements")
    public void checkTheHeaderMenuElements() {
        headerMenuPage.checkTheHeaderMenuElements();
    }

    @And("hover over header menu elements")
    public void hoverOverHeaderMenuElements() {
        headerMenuPage.hoverOverHeaderMenuElements();
    }

    @Then("click randomly on one of the header menu elements")
    public void clickRandomlyOnOneOfTheHeaderMenuElements() {
        headerMenuPage.clickRandomlyOnOneHeaderMenuElement();
    }

}

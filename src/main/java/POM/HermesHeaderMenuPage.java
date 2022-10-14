package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class HermesHeaderMenuPage extends AbstractClass{

    WebDriver driver;
    private static final Logger LOGGER=Logger.getLogger(AbstractClass.class.getName());


    public HermesHeaderMenuPage() {
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }



    public void checkTheHeaderMenuElements(){
        List<WebElement> headerMenuElements=driver.findElements(By.cssSelector("ul.m-navigation-list>li"));
        LOGGER.info("The header menu elements are: "+ headerMenuElements.size());
    }

    public void hoverOverHeaderMenuElements(){
        List<WebElement> headerMenuElements=driver.findElements(By.cssSelector("ul.m-navigation-list>li"));
        for (WebElement element:headerMenuElements){
            actionsClass(element);
        }
    }

    public void clickRandomlyOnOneHeaderMenuElement(){
        List<WebElement> headerMenuElements=driver.findElements(By.cssSelector("ul.m-navigation-list>li"));
        headerMenuElements.get(new Random().nextInt(headerMenuElements.size())).click();
    }

}

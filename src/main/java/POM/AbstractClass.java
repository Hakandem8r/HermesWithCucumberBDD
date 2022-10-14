package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public abstract class AbstractClass {

    private static final Logger LOGGER = Logger.getLogger(AbstractClass.class.getName());

    private WebDriver driver= Driver.getDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void selectElementFromDropdown(WebElement dropdown,String element){
        Select slc=new Select(dropdown);
        slc.selectByVisibleText(element);
    }

    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
       // System.out.println("My message: "+ actual.getText());
    }

    public void waitUrlContent(String ... value){
        try {
            for (String s:value){
                wait.until(ExpectedConditions.urlContains(s));
                System.out.println("My URL contains: " + s);
            }
        }catch (Exception error){
            error.getMessage();
        }
    }

    public void actionsClass(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        Actions act=new Actions(driver);
        act.moveToElement(element).pause(2000).perform();
    }

    public void scrollIntoView(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",element);
    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList){
        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;
    }

}

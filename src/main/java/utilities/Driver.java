package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        /*
        if (driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            */

        /*    ChromeOptions options=new ChromeOptions();
            driver = new ChromeDriver(options);
            options.addArguments("--headless");
            options.addArguments("start-maximized"); //Maximize direct from chrome

            options.setExperimentalOption("androidPackage","com.android.chrome");//opens from cellphone's chrome
        */
//-----------------------------------------------------------------------------------------------------

            if (driver == null){
                String browser="chrome";

                switch (browser){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver=new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver=new FirefoxDriver();
                        break;
                    case "safari":
                        WebDriverManager.safaridriver().setup();
                        driver=new SafariDriver();
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driver=new EdgeDriver();
                        break;
                    case "opera":
                        WebDriverManager.operadriver().setup();
                        break;
                    default: //headless-chrome
                        WebDriverManager.chromedriver().setup();
                        driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                        break;
                }


        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}

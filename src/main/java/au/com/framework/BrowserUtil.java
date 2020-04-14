package au.com.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserUtil {
    static RemoteWebDriver driver;
    public static RemoteWebDriver getBrowser(){
        Browser browser = Browser.valueOf(System.getProperty("browser","CHROME").toUpperCase());

        switch (browser) {
            case IE:
                driver = new InternetExplorerDriver();
                break;

            case CHROME:
                System.setProperty("webdriver.chrome.driver","/Users/admin/Downloads/chromedriver80");
                driver = new ChromeDriver();
                break;

            case SAFARI:
                driver = new SafariDriver();
                break;

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver","/Users/admin/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        return driver;

    }
}

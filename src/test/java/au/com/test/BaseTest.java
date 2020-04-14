package au.com.test;

import au.com.framework.BrowserUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class BaseTest
{
    /**
     * Rigorous Test :-)
     */
    protected RemoteWebDriver driver;


    @Before
    public void init()
    {
        driver = BrowserUtil.getBrowser();
    }

    @After
    public void tear()
    {
        driver.close();

        if (driver.getCapabilities().getBrowserName().toLowerCase().contains("chrome"))
        driver.quit();
    }
}

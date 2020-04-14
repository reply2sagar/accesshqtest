
package au.com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;

    protected BasePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean waitUntilElementIsDisplayed(By by){
        try {
            new WebDriverWait(driver, 1)
                    .ignoring(NoSuchElementException.class)
                    .until(ExpectedConditions.visibilityOf(driver.findElement(by)));
            return true;
        }catch (Exception ex){
            return false;
        }

    }

}

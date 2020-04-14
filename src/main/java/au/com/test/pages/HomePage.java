package au.com.test.pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }


    By contact = By.xpath("//a[@href='#/contact' and contains(@class,'btn')]");
    By menu = By.xpath("//a[@href='#/menu' and contains(@class,'btn')]");

    public ContactPage clickContactLink(){
        driver.get("https://dpjsjebeijxak.cloudfront.net/");
        driver.findElement(contact).click();
        return new ContactPage(driver);
    }


    public MenuPage clickMenu() {
        driver.get("https://dpjsjebeijxak.cloudfront.net/");
        driver.findElement(menu).click();
        return new MenuPage(driver);
    }
}

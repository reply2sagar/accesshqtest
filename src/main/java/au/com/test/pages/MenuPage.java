package au.com.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MenuPage extends BasePage {

    public MenuPage(WebDriver driver){
        super(driver);
    }

    By sidesLink = By.xpath("//a[contains(text(),'Sides')]");
    By kiloJoules = By.xpath("//img[@alt='Chunky Chips and Aioli']//parent::*//following-sibling::*//*[contains(@class,'kilojoules')]");
    By price = By.xpath("//img[@alt='Chunky Chips and Aioli']//parent::*//following-sibling::*//*[contains(@class,'price')]");

    public void clickSidesLink(){

        driver.findElement(sidesLink).click();
    }


    public String getPrice(){
        return driver.findElement(price).getText().replace("$", "");
    }


    public String getKiloJoules(){
        return driver.findElement(kiloJoules).getText().replace("kJ", "").trim();
    }


}

package au.com.test.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver){
        super(driver);
    }

    By submitButton = By.xpath("//a[@aria-label='submit']");
    By foreName = By.id("forename");
    By email = By.id("email");
    By message = By.id("message");


    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public boolean verifyErrorMessages(String errMessage) {
      return  driver.findElement(By.xpath("//div[text()='"+errMessage+"']")).isDisplayed();
    }

    public void setForeName(String name){
        driver.findElement(foreName).sendKeys(name);
    }

    public void setEmail(String email){
        driver.findElement(this.email).sendKeys(email);
    }

    public void setMessage(String message){
        driver.findElement(this.message).sendKeys(message);
    }

    public boolean verifyErrorMessagesDisplayed(String errMessage) {
        return waitUntilElementIsDisplayed(By.xpath("//div[text()='"+errMessage+"']"));
        //return  driver.findElement(By.xpath("//div[text()='"+errMessage+"']")).isDisplayed();
    }

}

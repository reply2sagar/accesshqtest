package au.com.test;

import au.com.test.pages.ContactPage;
import au.com.test.pages.HomePage;
import au.com.test.pages.MenuPage;
import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void HomePageTest() {
        HomePage home = new HomePage(driver);
        ContactPage contactPage = home.clickContactLink();
        contactPage.clickSubmitButton();
        Assert.assertTrue(contactPage.verifyErrorMessagesDisplayed("Forename is required"));
        Assert.assertTrue(contactPage.verifyErrorMessagesDisplayed("Email is required"));
        Assert.assertTrue(contactPage.verifyErrorMessagesDisplayed("Message is required"));
        contactPage.setForeName("Dan");
        contactPage.setEmail("dan@abc.com");
        contactPage.setMessage("Nice Pizza");
        contactPage.clickSubmitButton();
        Assert.assertFalse(contactPage.verifyErrorMessagesDisplayed("Forename is required"));
        Assert.assertFalse(contactPage.verifyErrorMessagesDisplayed("Email is required"));
        Assert.assertFalse(contactPage.verifyErrorMessagesDisplayed("Message is required"));

    }

    @Test
    public void MenuTest() {
        HomePage home = new HomePage(driver);
        MenuPage menuPage = home.clickMenu();
        menuPage.clickSidesLink();

        Assert.assertEquals(menuPage.getPrice(), "9.99");
        Assert.assertEquals(menuPage.getKiloJoules(), "3273");
    }
}

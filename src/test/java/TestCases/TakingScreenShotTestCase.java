package TestCases;

import DemoWebShop.BrowserActions;
import DemoWebShop.HomePage;
import DemoWebShop.LoginPage;
import DemoWebShop.Shoes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class TakingScreenShotTestCase {
    @Test
    public void Login() throws IOException {
        WebDriver driver = new ChromeDriver();
        BrowserActions ba = new BrowserActions(driver);
        Reporter.log("Chrome Browser Open Successfully", true);
        ba.maximizeWindow();
        ba.implicitwait();
        ba.openUrl("https://demowebshop.tricentis.com/");
        Reporter.log("DemoWebShop Site is Opened", true);

        HomePage hp = new HomePage(driver);
        hp.ClickOnLoginButton();
        Reporter.log("Login page Was Opened", true);
        LoginPage lp = new LoginPage(driver);
        lp.enterUsername("ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("LoggedIn Successfully", true);
        hp.ClickOnApparelNShoes();
        Reporter.log("Clicked On Apparel and Shoes", true);
        Shoes s = new Shoes(driver);
        s.ClickOnNext();
        s.ClickOnShoes();
        Reporter.log("Clicked On Shoes", true);
        ba.ScreenShot();
        Reporter.log("ScreenShot is Taken", true);
        String actualres = hp.getLogoutBtn().getText();
        Assert.assertEquals(actualres, "Log out");
        hp.getLogoutBtn();
        Reporter.log("LoggedOut Successfully", true);
        ba.closeBrowser();
        Reporter.log("Browser Closed Successfully", true);

    }
}

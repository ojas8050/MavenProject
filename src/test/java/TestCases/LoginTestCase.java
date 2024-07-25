package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTestCase {
    @Test
    public void Login() throws IOException {
        WebDriver driver=new ChromeDriver();
        BrowserActions ba=new BrowserActions(driver);
        Reporter.log("Chrome Browser Open Successfully",true);
        ba.maximizeWindow();
        ba.implicitwait();
        ba.openUrl("https://demowebshop.tricentis.com/");
        Reporter.log("DemoWebShop Site is Opened",true);

        HomePage hp=new HomePage(driver);
        hp.ClickOnLoginButton();
        Reporter.log("Login page Was Opened",true);
        LoginPage lp=new LoginPage(driver);
        lp.enterUsername("ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("LoggedIn Successfully",true);
        String actualres = hp.getLogoutBtn().getText();
        Assert.assertEquals(actualres,"Log out");
        hp.ClickOnLogoutBtn();
        Reporter.log("LoggedOut Successfully",true);
        ba.closeBrowser();
        Reporter.log("Browser Closed Successfully",true);
    }
}

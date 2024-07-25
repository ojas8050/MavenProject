package TestCases;

import DemoWebShop.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PlaceOrderTestCase {
    @Test
    public void PlaceOrder(){
        WebDriver driver=new ChromeDriver();
        Reporter.log("ChromeBrowser launched",true);
        BrowserActions ba=new BrowserActions(driver);
        ba.maximizeWindow();ba.implicitwait();
        ba.openUrl("https://demowebshop.tricentis.com/");
        Reporter.log("DemoWebShop Homepage Opened",true);

        HomePage hp=new HomePage(driver);
        LoginPage lp=new LoginPage(driver);
        hp.ClickOnLoginButton();
        lp.enterUsername("Ojas1@gmail.com");
        lp.enterPassword("Ojas@123");
        lp.clickOnLogin();
        Reporter.log("Logged In",true);
        hp.ClickonElectronics();

        Electronics e=new Electronics(driver);
        e.ClickOnCellPhoneLink();

        CellPhone c=new CellPhone(driver);
        c.ClickonSmartPhonelink();

        SmartPhone sp=new SmartPhone(driver);
        sp.ClickonAddToCartButton();
        sp.ClickOnShoppingCart();

        Cart cart=new Cart(driver);
        cart.ClickOnTNCCheckBox();
        cart.ClickOnCheckOutButton();

        Checkout co=new Checkout(driver);
        co.ClickOnBillingAddressContinue();
        co.ClickOnShippingContinue();
        co.ClickOnNextDayAir();
        co.ClickOnShippingMethod();
        co.ClickOnPaymentMethod();
        co.ClickOnPaymentInfo();
        co.ClickOnConfirmOrder();

        hp.getLogoutBtn();
        ba.closeBrowser();




    }
}

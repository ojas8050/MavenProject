package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
    private WebDriver driver;
    private ActionClass action;

    public Checkout(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "[onclick='Billing.save()']")
    private WebElement BillingAddressContinue;
    public void ClickOnBillingAddressContinue(){
        action.click(BillingAddressContinue);
    }

    @FindBy(css = "[onclick='Shipping.save()']")
    private WebElement ShippingContinue;
    public void ClickOnShippingContinue(){
        action.click(ShippingContinue);
    }

    @FindBy(css = "[onclick='ShippingMethod.save()']")
    private WebElement ShippingMethodContinue;
    public void ClickOnShippingMethod(){
        action.click(ShippingMethodContinue);
    }

    @FindBy(id = "shippingoption_1")
    private WebElement NextDayAir;
    public void ClickOnNextDayAir(){
        action.click(NextDayAir);
    }

    @FindBy(css = "[onclick='PaymentMethod.save()']")
    private WebElement PaymentMethod;
    public void ClickOnPaymentMethod(){
        action.click(PaymentMethod);
    }

    @FindBy(css = "[onclick='PaymentInfo.save()']")
    private WebElement PaymentInfo;
    public void ClickOnPaymentInfo(){
        action.click(PaymentInfo);
    }

    @FindBy(css = "[onclick='ConfirmOrder.save()']")
    private WebElement ConfirmOrder;
    public void ClickOnConfirmOrder(){
        action.click(ConfirmOrder);
    }



}

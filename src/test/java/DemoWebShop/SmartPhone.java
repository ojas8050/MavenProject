package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartPhone {
    private WebDriver driver;
    private ActionClass action;

    public SmartPhone(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-cart-button-43")
    private WebElement addtocartButton;
    public void ClickonAddToCartButton(){
        action.click(addtocartButton);
    }

    @FindBy(xpath = "//span[text()='Shopping cart']")
    private WebElement ShoppingCart;
    public void ClickOnShoppingCart(){
        action.click(ShoppingCart);
    }


}

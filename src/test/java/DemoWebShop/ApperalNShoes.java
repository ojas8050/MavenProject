package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApperalNShoes {
    private WebDriver driver;
    private ActionClass action;

    public ApperalNShoes(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[text()='24.00']/../..//input")
    private WebElement ShirtAddToCartButton;
    public void ClickOnShirtAddToCartButton(){
        action.click(ShirtAddToCartButton);
    }

    @FindBy(id = "add-to-cart-button-10")
    private WebElement AddtoCartBtn;
    public void ClickOnAddTocart(){
        action.click(AddtoCartBtn);
    }

}

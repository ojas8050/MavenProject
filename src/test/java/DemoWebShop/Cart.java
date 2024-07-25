package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    private WebDriver driver;
    private ActionClass action;

    public Cart(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "termsofservice")
    private WebElement TNCCheckBox;
    public void ClickOnTNCCheckBox(){
        action.click(TNCCheckBox);
    }

    @FindBy(id = "checkout")
    private WebElement CheackOutButton;
    public void ClickOnCheckOutButton(){
        action.click(CheackOutButton);
    }


}

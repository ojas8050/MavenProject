package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    private ActionClass actions;

public HomePage(WebDriver driver){
    this.driver = driver;
    this.actions = new ActionClass(driver);
    PageFactory.initElements(driver,this);
}

    @FindBy(css = ".ico-login")
    private WebElement LoginButton;

    @FindBy(xpath = "//span[normalize-space()='Shopping cart']")
    private WebElement ShoppingCartbtn;

    @FindBy(xpath = "//span[normalize-space()='Wishlist']`")
    private WebElement WhishListBtn;

    @FindBy(id = "small-searchterms")
    private WebElement SearchBoxTextField;

    @FindBy(css = "input[value='Search']")
    private WebElement SearchBtn;

    @FindBy(partialLinkText = "Apparel & Shoes")
    private WebElement apparelNshoes;

    public WebElement getLogoutBtn() {
        return LogoutBtn;
    }

    @FindBy(linkText = "Log out")
    private WebElement LogoutBtn;

    public void ClickOnLoginButton(){
        actions.click(LoginButton);
    }
    public void ClickOnApparelNShoes(){
        actions.click(apparelNshoes);
    }

    public void ClickOnLogoutBtn(){
        actions.click(LogoutBtn);
    }

    @FindBy(partialLinkText = "Electronics")
    private WebElement electroniclink;
    public void ClickonElectronics(){
        actions.click(electroniclink);
    }



}

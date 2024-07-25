package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;
    private ActionClass actions;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.actions = new ActionClass(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    private WebElement unTextField;

    @FindBy(id = "Password")
    private WebElement pwdTextField;

    @FindBy(css = "input[value='Log in']")
    private WebElement loginBtn;

    @FindBy(linkText = "Forgot password?")
    private WebElement forgotPwdLink;

    @FindBy(css = "input[value='Register']")
    private WebElement registerBtn;

    public void enterUsername(String username) {
        actions.sendKeys(unTextField, username);
    }

    public void enterPassword(String password) {
        actions.sendKeys(pwdTextField, password);
    }

    public void clickOnLogin() {
        actions.click(loginBtn);
    }

}

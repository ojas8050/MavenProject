package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYou {
    private WebDriver driver;
    private ActionClass action;

    public ThankYou(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "//input[@onclick=\"setLocation('/')\"]")
    private WebElement Continue;
    public void ClickOnContinue(){
        action.click(Continue);
    }
}

package DemoWebShop;

import com.google.common.collect.Table;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhone {
    private WebDriver driver;
    private ActionClass action;

    public CellPhone(WebDriver driver){
        this.driver=driver;
        this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Smartphone")
    private WebElement smartphonelink;

    public void ClickonSmartPhonelink(){
        action.click(smartphonelink);
    }


}

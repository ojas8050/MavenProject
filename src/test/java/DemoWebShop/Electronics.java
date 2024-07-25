package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics {
    private WebDriver driver;
    private ActionClass action;

    public Electronics(WebDriver driver){
            this.driver=driver;
            this.action=new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Cell phones")
    private WebElement CellPhonelink;

    public void ClickOnCellPhoneLink(){
        action.click(CellPhonelink);
    }

}

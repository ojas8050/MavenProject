package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shoes {
    private WebDriver driver;
    private ActionClass actions;

    public Shoes(WebDriver driver) {
        this.driver = driver;
        this.actions = new ActionClass(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Next']")
    private WebElement Secondpage;

    @FindBy(linkText = "Women's Running Shoe")
    private WebElement WomensRunningShoes;

    public void ClickOnNext(){
        actions.click(Secondpage);
    }

    public void ClickOnShoes(){
        actions.click(WomensRunningShoes);
    }



}

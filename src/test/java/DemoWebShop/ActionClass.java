package DemoWebShop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionClass {
    private WebDriver driver;

    public ActionClass(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.clear(); // Clear existing text if needed
        element.sendKeys(text);
    }
}

package DemoWebShop;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BrowserActions {
    private WebDriver driver;

    public BrowserActions(WebDriver driver) {
        this.driver = driver;
    }

    // Open a URL
    public void openUrl(String url) {
        driver.get(url);
    }

    // Close the browser
    public void closeBrowser() {
        driver.quit();
    }

    // Maximize the browser window
    public void maximizeWindow() {
        driver.manage().window().maximize();
    }

    public void implicitwait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    public void ScreenShot() throws IOException {
        TakesScreenshot takescreenShot=(TakesScreenshot) driver;
        File temp = takescreenShot.getScreenshotAs(OutputType.FILE);//
        File src=new File("./ErrorShot/image.png");
        FileHandler.copy(temp, src);
    }

}
package ShareData;

import Logger.LoggerUtility;
import ShareData.Browser.BrowserFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ShareData {
    private WebDriver driver;

    //    @BeforeMethod
    public void setup(){


        driver = new BrowserFactory().getBrowserDriver();
        LoggerUtility.info("The browser was opened with succes");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    //    @AfterMethod
    public void clear(){
        driver.quit();
        LoggerUtility.info("The browser was closed with succes");
    }

    public WebDriver getDriver() {
        return driver;
    }
}

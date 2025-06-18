package utils;

import constants.Messages;
import enums.BrowserDriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
    public static WebDriver createDriver() throws Exception {
        BrowserDriverType browserType = ConfigReader.getBrowserDriver();
        WebDriver driver = switch (browserType) {
            case CHROME -> new ChromeDriver();
            case FIREFOX -> new FirefoxDriver();
            case SAFARI -> new SafariDriver();
            case NONE -> null;
        };

        if (driver == null) {
            throw new Exception(Messages.EXCEPTION_CANT_FIND_BROWSER_DRIVER);
        }

        return driver;
    }

    public static WebDriver createDriverWithDefaultConfig() throws Exception {
        WebDriver driver = createDriver();

        // Update configs here.
        driver.manage().window().setSize(ConfigReader.getBaseDimension());
        return driver;
    }
}

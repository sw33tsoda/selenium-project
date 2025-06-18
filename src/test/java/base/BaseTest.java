package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.WebDriverFactory;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeEach
    public void init() throws Exception {
        driver = WebDriverFactory.createDriverWithDefaultConfig();
    }

    @AfterEach void cleanup() {
        if (driver != null) driver.quit();
    }

    protected void navigateFromBase(String path) {
        String url = String.join(ConfigReader.getBaseURL(), path);
        driver.navigate().to(url);
    }
}

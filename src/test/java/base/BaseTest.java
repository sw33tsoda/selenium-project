package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.WebDriverFactory;

import java.util.Optional;

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
        String baseUrl = ConfigReader.getBaseURL();
        String url = baseUrl.concat(path.isBlank() ? "" : path);
        driver.navigate().to(url);
    }
}

package tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

class GridTest {

    @ParameterizedTest
    @ValueSource(strings = {"chrome", "safari"})
    void testGoogleOnBrowsers(String browser) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(browser);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        driver.get("https://www.google.com");

        System.out.println("Browser: " + browser + " | Title: " + driver.getTitle());
        driver.quit();
    }
}

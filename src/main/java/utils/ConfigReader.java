package utils;

import constants.Messages;
import enums.BrowserDriverType;
import enums.ConfigProperties;
import org.openqa.selenium.Dimension;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try {
            FileInputStream inputStream = new FileInputStream("resources/config.properties");
            props.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(Messages.IO_FAILED_TO_READ_FILE);
        }
    }

    public static String getPropertyValue(ConfigProperties keyName) {
        return props.getProperty(keyName.getPropertyKey());
    }

    public static BrowserDriverType getBrowserDriver() {
        return BrowserDriverType.fromString(getPropertyValue(ConfigProperties.BROWSER_DRIVER));
    }

    public static Dimension getBaseDimension() {
        int width = Integer.parseInt(getPropertyValue(ConfigProperties.BROWSER_BASE_WIDTH));
        int height = Integer.parseInt(getPropertyValue(ConfigProperties.BROWSER_BASE_HEIGHT));
        return new Dimension(width, height);
    }

    public static String getBaseURL() {
        return getPropertyValue(ConfigProperties.BROWSER_BASE_URL);
    }
}

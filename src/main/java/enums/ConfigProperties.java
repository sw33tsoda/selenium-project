package enums;

public enum ConfigProperties {
    /**
     * If a new property variable is added to 'config.properties' file, add a corresponding enum property here.
     */
    // <editor-fold desc="config.properties enum">
    BROWSER_BASE_URL("browser_base_url"),
    BROWSER_DRIVER("browser_driver"),
    BROWSER_BASE_WIDTH("browser_based_width"),
    BROWSER_BASE_HEIGHT("browser_based_height");
    // </editor-fold>


    private final String propertyKey;

    ConfigProperties(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyKey() {
        return propertyKey;
    }
}

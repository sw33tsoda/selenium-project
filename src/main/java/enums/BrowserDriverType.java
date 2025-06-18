package enums;

public enum BrowserDriverType {
    NONE(null),
    CHROME("chrome"),
    FIREFOX("firefox"),
    SAFARI("safari");

    private final String propertyKey;

    BrowserDriverType(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getBrowserName() {
        return propertyKey;
    }

    public static BrowserDriverType fromString(String value) {
        for (BrowserDriverType type : values()) {
            if (type != NONE && type.getBrowserName().equalsIgnoreCase(value)) {
                return type;
            }
        }
        return NONE;
    }
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {
    private final String path = "";

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement header;

    @FindBy(xpath = "//*[@id='app']/div/div/div[1]/a/img")
    private WebElement banner;

    @FindBy(css = ".top-card")
    private List<WebElement> clickableCards;

    public HomePage(WebDriver incomingDriver) {
        super(incomingDriver);
        PageFactory.initElements(driver, this);
    }

    public String getPath() {
        return path;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getBanner() {
        return banner;
    }

    public List<WebElement> getClickableCards() {
        return clickableCards;
    }

    public void clickHeader() {
        getHeader().click();
    }

    public void clickBanner() {
        getBanner().click();
    }

    /**
     * Find a specified card in all displayed cards
     * @param text - text used for locating element
     * @return WebElement
     */
    public WebElement getCard(String text) {
        for (WebElement card : clickableCards) {
            if (card.getText().equals(text)) {
                return card;
            }
        }
        return null;
    }

    public void clickCard(WebElement card) {
        card.click();
    }
}

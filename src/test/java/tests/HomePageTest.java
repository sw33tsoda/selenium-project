package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    private HomePage page;

    @BeforeEach
    public void setup() {
        page = new HomePage(driver);
        navigateFromBase(page.getPath());
    }

    @DisplayName("Home page should have a header")
    @Test
    public void headerExistenceTest() {
        WebElement element = page.getHeader();
        Assertions.assertNotNull(element);
    }

    @DisplayName("Home page header is an image with a specified image link")
    @Test
    public void headerImageAndLinkTest() {
        String elementTagName = page.getHeader().getTagName();
        String elementSrc = page.getHeader().getAttribute("src");
        Assertions.assertEquals(elementTagName, "img", "Header is not an image");
        Assertions.assertEquals(elementSrc, "https://demoqa.com/images/Toolsqa.jpg");
    }

    @DisplayName("Home page should have a banner")
    @Test
    public void bannerExistenceTest() {
        WebElement element = page.getBanner();
        Assertions.assertNotNull(element);
    }

    @DisplayName("Home page banner is an image with a specified image link")
    @Test
    public void bannerImageAndLinkTest() {
        String elementTagName = page.getBanner().getTagName();
        String elementSrc = page.getBanner().getAttribute("src");
        Assertions.assertEquals(elementTagName, "img", "Banner is not an image");
        Assertions.assertEquals(elementSrc, "https://demoqa.com/images/WB.svg");
    }
}

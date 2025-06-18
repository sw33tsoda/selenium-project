package tests;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class HomePageTest extends BaseTest {
    private HomePage page;

    @BeforeEach
    public void setup() {
        page = new HomePage(driver);
    }

    @DisplayName("Home page should have a header")
    @Test
    public void headerExistenceTest() {
        Assertions.assertNotNull(page.getHeader());
    }
}

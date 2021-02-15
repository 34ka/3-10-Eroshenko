package tests;

import driver.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GitLabTest {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new WebDriverProvider().get();
    }
    @Test
    public void testMainPage() {
        driver.get("https://github.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}

package tests;

import com.codeborne.selenide.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GitHubTest {

    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new WebDriverProvider().get();

    }
    @Test
    public void testMainPage() {
        driver.get("https://gitlab.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}

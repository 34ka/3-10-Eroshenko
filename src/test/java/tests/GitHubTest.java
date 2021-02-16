package tests;

import driver.ServiceConfig;
import driver.WebDriverProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;
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
        final ServiceConfig config = ConfigFactory.newInstance().create(ServiceConfig.class);
        driver.get(config.webUrl());
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}

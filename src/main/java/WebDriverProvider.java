import com.google.common.base.Suppliers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.function.Supplier;

public class WebDriverProvider implements Supplier<WebDriver> {

    @Override
    public WebDriver get() {
        final String browserName = getBrowserName();
        if ("chrome".equals(browserName)) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if ("firefox".equals("browser.name")) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        throw new RuntimeException("Unknown browser name: " + browserName);
    }

    private String getBrowserName() {
        return System.getProperty("browser.name", "chrome");
    }
}

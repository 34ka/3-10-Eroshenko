package driver;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:local.properties",
        "classpath:default.properties",
        "file:~/project.properties"
})
public interface WebDriverConfig extends Config {

    @Key("webdriver.browser.name")
    BrowserName browserName();

    @DefaultValue("false")
    @Key("webdriver.remote")
    boolean remote();

    @Key("webdriver.remote.url")
    URL remoteURL();

    @Key("webdriver.remote.password")
    String password();
}

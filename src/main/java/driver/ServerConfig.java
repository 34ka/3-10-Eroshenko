package driver;

import org.aeonbits.owner.Config;

import java.util.List;

public interface ServerConfig extends Config {

    @ConverterClass(ServerConverter.class)
    @DefaultValue("google.com:4444, yandex.com:4444")
    List<Server> getServers();
}

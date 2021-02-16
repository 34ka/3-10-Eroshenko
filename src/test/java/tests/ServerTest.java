package tests;

import driver.Server;
import driver.ServerConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ServerTest {

    @Test
    public void testServer() {
        ServerConfig config = ConfigFactory.newInstance()
                .create(ServerConfig.class);

        for (Server server: config.getServers()) {
            System.out.println(server.host + " ; " +server.port);
        }
    }
}

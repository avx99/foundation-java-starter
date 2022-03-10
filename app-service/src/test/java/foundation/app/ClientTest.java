package foundation.app;

import dev.soffa.foundation.client.RestClient;
import dev.soffa.foundation.context.Context;
import foundation.app.api.EchoAPI;
import foundation.app.api.usecases.EchoInput;
import foundation.app.api.schema.Message;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class ClientTest {

    @LocalServerPort
    private int port;

    @Test
    public void testEchoClient() {
        EchoAPI client = RestClient.newInstance(EchoAPI.class, "http://localhost:" + port);
        Message response = client.echo(new EchoInput("Hello"), new Context());
        assertEquals("Hello", response.getContent());
    }

}

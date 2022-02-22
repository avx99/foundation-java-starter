package foundation.app;

import foundation.app.api.EchoAPI;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.core.RestClient;
import io.soffa.foundation.core.context.DefaultRequestContext;
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
        EchoResponse response = client.echo(new EchoRequest("Hello"), new DefaultRequestContext());
        assertEquals("Hello", response.getMessage());
    }

}

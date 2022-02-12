package foundation.app;

import foundation.app.api.EchoAPI;
import foundation.app.api.model.EchoRequest;
import foundation.app.api.model.EchoResponse;
import io.soffa.foundation.api.RestClient;
import io.soffa.foundation.context.RequestContext;
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
        EchoResponse response = client.echo(new EchoRequest("Hello"), new RequestContext());
        assertEquals("Hello", response.getMessage());
    }

}

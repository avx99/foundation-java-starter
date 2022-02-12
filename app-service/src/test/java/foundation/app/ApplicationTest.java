package foundation.app;

import foundation.app.api.model.EchoRequest;
import io.soffa.foundation.test.DatabaseTest;
import io.soffa.foundation.test.HttpExpect;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class ApplicationTest extends DatabaseTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testActuator() {
        HttpExpect test = new HttpExpect(mvc);
        test.get("/actuator/health").expect().isOK().json("$.status", equalTo("UP"));
    }

    @Test
    public void testEchoAPI() {
        HttpExpect test = new HttpExpect(mvc);
        test.post("/echo")
            .withJson(new EchoRequest("Hello")).expect().isOK()
            .json("$.message", equalTo("Hello"));
    }

}

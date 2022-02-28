package foundation.app;

import com.intuit.karate.junit5.Karate;
import io.soffa.foundation.commons.TextUtil;;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("test")
class FeatureTest {

    @LocalServerPort
    private int port;

    @Value("${server.servlet.contextPath:}")
    private String contextPath;

    @Karate.Test
    public Karate testFeatures() {
        return Karate.run(
            feature("echo")
        ).systemProperty("baseUrl", TextUtil.format("http://localhost:%d%s", port, contextPath));
    }

    @SuppressWarnings("SameParameterValue")
    private String feature(String name) {
        return "classpath:/feature/" + name + ".feature";
    }

}

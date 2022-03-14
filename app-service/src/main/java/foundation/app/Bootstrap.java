package foundation.app;

import dev.soffa.foundation.Foundation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) {
        Foundation.run(Bootstrap.class, args);
    }

}

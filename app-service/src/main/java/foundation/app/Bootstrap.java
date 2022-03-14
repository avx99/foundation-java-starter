package foundation.app;

import dev.soffa.foundation.Foundation;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootstrap {

    public static void main(String[] args) {
        // Remarquez l'ulisation de Foundation en lieu et place de la classe SpringBoot
        Foundation.run(Bootstrap.class, args);
    }

}

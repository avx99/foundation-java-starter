package foundation.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import static foundation.app.Application.APP_PKG;
import static foundation.app.Application.FOUNDATION_PKG;

@SpringBootApplication
@EntityScan(basePackages = {FOUNDATION_PKG, APP_PKG})
@EnableJpaRepositories(basePackages = {FOUNDATION_PKG, APP_PKG})
public class Application {

    public static final String FOUNDATION_PKG = "io.soffa.foundation";
    public static final String APP_PKG = "foundation.app";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

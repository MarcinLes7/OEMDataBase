package pl.wszib.oemdatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

//@PropertySource("classpath:db-postgres.properties")
@SpringBootApplication
public class OemDataBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(OemDataBaseApplication.class, args);
    }

}

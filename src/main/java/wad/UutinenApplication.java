package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class UutinenApplication {

    public static void main(String[] args) {
        SpringApplication.run(UutinenApplication.class, args);
    }
}

package ecom.spring.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"ecom.spring.library.*", "ecom.spring.admin.*"})
@EnableJpaRepositories(value = "ecom.spring.library.repository")
@EntityScan(value = "ecom.spring.library.model")
public class AdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }

}

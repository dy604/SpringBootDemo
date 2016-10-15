package demo.msa.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by root on 9/19/16.
 */
@RestController
@SpringBootApplication
public class Application {

    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}

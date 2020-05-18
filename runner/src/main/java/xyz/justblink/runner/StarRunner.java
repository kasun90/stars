package xyz.justblink.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"xyz.justblink"})
public class StarRunner {
    public static void main(String[] args) {
        SpringApplication.run(StarRunner.class, args);
    }
}

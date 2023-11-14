package jungco.cbp.circuitbreakerproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class CircuitBreakerProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CircuitBreakerProjectApplication.class, args);
    }

}

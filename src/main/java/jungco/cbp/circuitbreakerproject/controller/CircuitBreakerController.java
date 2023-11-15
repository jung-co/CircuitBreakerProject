package jungco.cbp.circuitbreakerproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    @Autowired
    private CircuitBreakerService circuitBreakerTestService;

    @GetMapping("/user/{userId}")
    String getUserName(@PathVariable Long userId) {
        String userInfo = circuitBreakerTestService.getUserName(userId);
        return userInfo
    }
}

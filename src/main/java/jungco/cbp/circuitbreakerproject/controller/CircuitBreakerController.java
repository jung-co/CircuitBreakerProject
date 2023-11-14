package jungco.cbp.circuitbreakerproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CircuitBreakerController {

    @GetMapping("/user/{userName}")
    public RestTemplate getUserName (@PathVariable String userName){
        return CircuitBrekerService.getItemList();
    }
}

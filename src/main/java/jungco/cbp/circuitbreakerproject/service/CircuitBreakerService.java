package jungco.cbp.circuitbreakerproject.service;

import org.springframework.stereotype.Service;

@Service
class CircuitBrekerService {

//    @CircuitBreaker(name = "cat-image-circuit-breaker", fallbackMethod = "fallbackCatImage")
    String getUserName(Long userId) {
        if (userId < 10L) {
            return userId + " userName jung-co";
        }
        throw new RuntimeException("there is no userName for " + userId);
    }

    private String fallbackUserName(Long userId, Throwable t) {
        return "fallback userName";
    }
}

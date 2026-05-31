package com.rawan.greeting;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class GreetingController {
    @GetMapping("/greeting")
    public Map<String, String> getGreeting() {
        return Map.of("message", "Hello from Spring Boot");
    }

    @PostMapping("/greeting")
    public Map<String, String> postGreeting(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        return Map.of("message", "Hello, " + name);
    }
}

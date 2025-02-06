/**
 * 
 */
package com.example.demo.controller;

/**
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ⓵
@RequestMapping("/greet") 
public class GreetingController {
    
    private final GreetingService2 greetingService;

    public GreetingController(GreetingService2 greetingService2) {
        this.greetingService = greetingService2;
    }

    @GetMapping("/{name}") // ⓶
    public String greet(@PathVariable String name) { // ⓷
        return greetingService.greet(name);
    }
}

/**
 * 
 */
package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ⓵
@RequestMapping("/greet")
public class GreetController {

    @GetMapping("/{name}") // ⓶
    public Map<String, String> greet(@PathVariable String name) { // ⓷
        Map<String, String> response = new HashMap<>();
        response.put("message", "Hello, " + name);
        return response;
    }
}

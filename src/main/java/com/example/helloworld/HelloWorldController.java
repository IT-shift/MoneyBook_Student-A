/**
 * 
 */
package com.example.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloWorldController {

    // 初期画面の表示
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // ボタン押下後に"Hello, World!"を表示
    @PostMapping("/greet")
    public String greet(Model model) {
        model.addAttribute("message", "Hello, World!");
        return "index";
    }
}

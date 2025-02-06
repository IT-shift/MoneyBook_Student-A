/**
 * 
 */
package com.example.demo.controller;

/**
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(required = false) String id,
                        @RequestParam(required = false) String password,
                        Model model) {
        boolean hasError = false;

        if (id == null || id.isEmpty()) {
            model.addAttribute("idError", "IDが未入力です。");
            hasError = true;
        }
        if (password == null || password.isEmpty()) {
            model.addAttribute("passwordError", "パスワードが未入力です。");
            hasError = true;
        }
        if (hasError) {
            return "login";
        }

        if (!loginService.authenticate(id, password)) {
            model.addAttribute("loginError", "IDまたはパスワードが間違っています。");
            return "login";
        }

        return "redirect:/top";
    }

    @GetMapping("/top")
    public String showTopPage() {
        return "top";
    }
}

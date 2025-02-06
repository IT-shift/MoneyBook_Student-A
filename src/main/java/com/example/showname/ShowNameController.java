/**
 * 
 */
package com.example.showname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShowNameController {

    // 初期画面を表示
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // 名前を受け取って表示する
    @PostMapping("/showname")
    public String showName(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }
}

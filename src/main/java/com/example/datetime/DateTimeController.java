/**
 * 
 */
package com.example.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DateTimeController {

    // 初期画面を表示
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // ボタン押下後、現在の日時を取得して表示
    @PostMapping("/datetime")
    public String showDateTime(Model model) {
        // 現在の日時を取得
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // モデルに日時を追加
        model.addAttribute("currentDateTime", formattedDateTime);
        return "index";
    }
}

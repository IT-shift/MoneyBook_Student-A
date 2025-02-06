/**
 * 
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ⓵ クラスをSpringのコントローラーとして指定
@RequestMapping("/hello") // /hello にアクセスしたときにこのクラスのメソッドが処理するよう設定
public class HelloController {

    @GetMapping // ⓶ GETリクエストを処理する
    public String sayHello() {
        return "Hello, Spring!"; // ⓷ クライアントに返すレスポンス
    }
}

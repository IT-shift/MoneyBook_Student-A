/**
 * GETリクエストを受け取り、固定の文字列メッセージを返すAPIを作成してください。

要件
1. GETリクエストで以下の形式のエンドポイントを作成する。
/hello
※出力は"http://localhost:8080/hello"に接続する。
2. 以下のような結果を返します。
"Hello, Spring Boot!"

・com.example.demo.controller 以下に ekadai2_HelloController.java というファイル名で下記プログラムを作
成してください。
・以下の ⓵〜⓺の穴を埋めてプログラムを完成させてください。
 */
package com.example.demo.controller; // ①

import org.springframework.web.bind.annotation.GetMapping; // ⓶
import org.springframework.web.bind.annotation.RestController; // ⓷

@RestController // ⓸
public class ekadai2_HelloController {

    @GetMapping("/hello") // ⓹
    public String sayHello() {
        return "Hello, Spring Boot!"; // ⓺
    }
}

/**
 * パスパラメータを受け取り、動的なレスポンスを返すAPIを作成してください。

要件
1. GETリクエストで以下の形式のエンドポイントを提供:
/greet/{name} ※nameは任意の文字列を入れます
※出力は"http://localhost:8080/greet/{name}"に接続する。
2. 例として、/greet/Aliceにアクセスすると以下のような結果を返します。
例:"Hello, Alice!"

・com.example.demo.controller 以下に ekadai2_GreetController.java というファイル名で下記プログラムを作
成してください。
・以下の ⓵〜⓼の穴を埋めてプログラムを完成させてください。
 */
package com.example.demo.controller; // ⓵

import org.springframework.web.bind.annotation.PathVariable; // ⓶
import org.springframework.web.bind.annotation.RequestMapping; // ⓷
import org.springframework.web.bind.annotation.RestController; // ⓸

@RestController // ⓹
public class ekadai2_GreetController {
    
    @RequestMapping("/greet/{name}") // ⓺
    public String greet(@PathVariable String name) { // ⓻
        return "Hello, " + name + "!"; // ⓼
    }
}

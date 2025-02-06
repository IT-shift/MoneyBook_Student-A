/**
 * 【毎日課題】
クエリパラメータを受け取り、計算結果を返すAPIを作成してください。

要件
1. GETリクエストで以下の形式のエンドポイントを作成します。
/calculate
2. このエンドポイントは、クエリパラメータaとbを受け取ります。
※出力は"http://localhost:8080/calculate?a=X&b=Y"に接続する。
XとYは任意の数値を入れます。
2. 例として、/calculate?a=5&b=3にアクセスすると以下の結果を返します。
例:"Result: 8"

・com.example.demo.controller 以下に Ekadai2_CalculateController.java というファイル名で下記プログラム
を作成してください。
・以下の ⓵〜⓽の穴を埋めてプログラムを完成させてください。

⓵
import ⓶;
import ⓷;
import ⓸;
⓹
public class Ekadai2_CalculateController {
⓺
public String calculate(⓻) {
⓼;
⓽;
}
}
 */
package com.example.demo.controller; // ⓵

import org.springframework.web.bind.annotation.GetMapping; // ⓶
import org.springframework.web.bind.annotation.RequestParam; // ⓷
import org.springframework.web.bind.annotation.RestController; // ⓸

@RestController // ⓹
public class Ekadai2_CalculateController {

    @GetMapping("/calculate") // ⓺
    public String calculate(@RequestParam int a, @RequestParam int b) { // ⓻
        int result = a + b; // ⓼
        return "Result: " + result; // ⓽
    }
}

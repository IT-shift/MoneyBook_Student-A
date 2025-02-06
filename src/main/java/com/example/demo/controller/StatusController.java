/**
 * 課題winvac10-1
サーバーが正常に稼働しているかどうかを返すシンプルなAPIを作成してください。
要件
1. GETリクエストで以下の形式のエンドポイントを提供:
/status
※出力は"http://localhost:8080/status"に接続する。
2. 結果として、以下を返す:
{"status": "Server is running"}
 */
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/status")
    public String getStatus() {
        return "{\"status\": \"Server is running\"}";
    }
}

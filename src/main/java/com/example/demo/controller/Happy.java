/**
 * 以下のプログラムを作成してください。
com.example.demo以下にHappy.java,resource/templete以下にhappybirthday.htmlというファイル名で下記の
プログラムを完成させてください。

1 htmlファイルの(設問)に適したプログラムを記述してください。
2 ブラウザで下記URLを入力して適切に表示されるか確認してください。
http://localhost:8080/happybirthday
※javaファイルの(自分の名前)をご自身の苗字に変換してみてね♪

 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Happy {
    @RequestMapping("/happybirthday")
    public String happybirthday(Model model) {
        model.addAttribute("name", "有馬さん"); // (自分の名前)を田中に変更
        return "happybirthday";
    }
}

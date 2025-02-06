/**
 * 下記のSpring MVCに関する問題を解いてください。
※「03_Spring MVCでの開発(フォームクラスの実装)」の講義資料を参考にしてください。
「イベント登録フォーム」をテーマにしたフォームクラスを実装します。
コントローラークラスを作成に関して、以下の ⓵〜⓻ にプログラムを追記し、
EventRegistrationController.java を完成させてください。

【コントローラークラスを作成する】
demo/src/main/java/com/example/demo/controller 配下に以下のクラスを作成します。
/register エンドポイントでは、イベント登録フォーム画面を表示します。
/confirmRegistration エンドポイントでは、POSTされたデータを確認画面に渡します。
@ModelAttribute により、フォームクラスを介してデータを連携します。
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.EventRegistrationForm;

@Controller // ⓵
public class EventRegistrationController {

    // イベント登録フォーム画面の表示
    @RequestMapping(value = "/register", method = RequestMethod.GET) // ⓶
    public String registrationForm(Model model) { // ⓷
        model.addAttribute("eventRegistrationForm", new EventRegistrationForm()); // 新しいフォームをモデルに追加
        return "register"; // ⓸
    }

    // 登録内容確認画面の表示
    @RequestMapping(value = "/confirmRegistration", method = RequestMethod.POST) // ⓹
    public String confirmRegistration(@ModelAttribute EventRegistrationForm form, BindingResult result, Model model) { // ⓺ フォームクラスを引数に取る
        if (result.hasErrors()) {
            return "register"; // 入力エラーがあればフォーム画面に戻る
        }
        model.addAttribute("eventRegistrationForm", form); // 送信されたデータをモデルに追加
        return "confirmRegistration"; // ⓻
    }
}

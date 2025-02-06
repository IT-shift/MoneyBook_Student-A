package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.form.OrderForm;

@Controller
public class OrderController {
    
	// ⓵ 注文フォーム画面を表示するメソッド
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order(@ModelAttribute OrderForm orderForm, Model model) { // ⓶ フォームクラスとモデルを引数に取る
		model.addAttribute("orderForm", orderForm); // ⓷ モデルにフォームオブジェクトを追加
		return "order"; // 表示するテンプレート名を返す
	}

	// ⓸ 注文確認画面を表示するメソッド（POST専用）
	@RequestMapping(value = "/confirmOrder", method = RequestMethod.POST)
	public String confirmOrder(@ModelAttribute OrderForm orderForm, BindingResult result, Model model) { // ⓹ フォームクラスとBindingResult、モデルを引数に取る
		if (result.hasErrors()) {
			return "order";
		}
		model.addAttribute("orderForm", orderForm); // ⓺ モデルにフォームデータを追加
		return "confirmOrder";
	}
}

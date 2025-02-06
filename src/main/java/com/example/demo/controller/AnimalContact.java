//package com.example.demo.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.example.demo.form.AnimalForm;
//@Controller
//public class AnimalContact{
//
//	//設問1
//	@RequestMapping(value = "/animalcontact", method = RequestMethod.GET)
//    public String animalcontact(Model model) {
//        model.addAttribute("animalForm", new AnimalForm());
//        return "animalcontact";
//	}
//	
//	@RequestMapping(value = "/animalconfirm", method = RequestMethod.POST)
//	public String animalconfirm(@ModelAttribute AnimalForm form, BindingResult result, Model model) {
//		if (result.hasErrors()) {
//			return "animalcontact";
//		}else {
//			form.setAnimalDate(form.getAnimalYear() + "年" + form.getAnimalMonth() + "月" + form.getAnimalDay() + "日");
//            model.addAttribute("animalForm", form);
//			return "animalconfirm";
//		}
//	}
//}

package com.example.demo.controller;

import jakarta.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.AnimalForm;

@Controller
public class AnimalContact {

    @GetMapping("/animalcontact")
    public String showForm(AnimalForm animalForm) {
        return "animalcontact";
    }

    @PostMapping("/animalconfirm")
    public String validateForm(@Valid AnimalForm animalForm, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "animalcontact";
        }
        model.addAttribute("message", "登録が完了しました！");
        return "success";
    }
}
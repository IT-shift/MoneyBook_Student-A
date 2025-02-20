/**
 * 
 */
package com.example.demo.controller;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Payout;
import com.example.demo.repository.PayoutRepository;

@Controller
@RequestMapping("/payout")
public class PayoutController {

    @Autowired
    private PayoutRepository payoutRepository;

    @GetMapping
    public String showPayoutPage(Model model) {
        LocalDate startDate = YearMonth.now().atDay(1);
        LocalDate endDate = YearMonth.now().atEndOfMonth();
        
        List<Payout> payouts = payoutRepository.findByDateBetweenOrderByDateAscClassificationAscAmountAsc(startDate, endDate);
        model.addAttribute("payouts", payouts);
        model.addAttribute("newPayout", new Payout());
        
        return "payout";
    }

    @PostMapping("/add")
    public String addPayout(@ModelAttribute Payout payout, Model model) {
//    	if (payout.getClassification() == null || payout.getClassification().isEmpty()) {
//    	    System.out.println("分類が未入力です。");
//    	}
    	if (payout.getDate() == null || payout.getClassification().isEmpty() || payout.getAmount() <= 0) {
            model.addAttribute("error", "「日付」「分類」「金額」は必ず入力してください");
            return "payout";
        }
        
        payoutRepository.save(payout);
        return "redirect:/payout";
    }

    @PostMapping("/update")
    public String updatePayout(@RequestParam Long id, @ModelAttribute Payout payout) {
        Payout existing = payoutRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setDate(payout.getDate());
            existing.setClassification(payout.getClassification());
            existing.setAmount(payout.getAmount());
            existing.setShop(payout.getShop());
            existing.setPayment(payout.getPayment());
            existing.setMemo(payout.getMemo());
            payoutRepository.save(existing);
        }
        return "redirect:/payout";
    }

    @PostMapping("/delete")
    public String deletePayout(@RequestParam Long id) {
        payoutRepository.deleteById(id);
        return "redirect:/payout";
    }
}

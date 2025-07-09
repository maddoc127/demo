package com.form.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.demo.Users.soru;

@Controller
public class Question_controler {
    @GetMapping("/soru")
    public String showForm(Model model) {
        model.addAttribute("soru", new soru());
        return "sorular_data";
    }

    @PostMapping("/sorusubmit")
    public String processForm(@ModelAttribute soru soru, Model model) {
        model.addAttribute("submittedsoru", soru);
        return "sorular_results";
    }
}

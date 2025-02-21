package com.form.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.form.demo.Users.calc;

@Controller
public class calc_controler {
    @GetMapping("/calcdata")
    public String showForm(Model model) {
        model.addAttribute("calc", new calc()); 
        return "calc_data";
    }

    @PostMapping("/calcsubmit")
    public String processForm(@ModelAttribute calc calc, Model model) {
        model.addAttribute("submittedcalc", calc); 
        return "calc_result"; 
    }
}



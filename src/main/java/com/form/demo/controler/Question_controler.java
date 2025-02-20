package com.form.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class Question_controler {
    @GetMapping("/soru")
    public String getMethodName(Model model) {
        String[] items = {"a","b","c","d","e"};
        model.addAttribute("items", items);
        return "soru";
    }
    
}

package com.form.demo.controler;

import com.form.demo.Users.calc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.ArrayList;

@Controller
public class calc_controler {
    List<Double> hafiza = new ArrayList<>();
    @GetMapping("/calcdata")
    public String showForm(Model model) {
        model.addAttribute("calc", new calc()); 
        return "calc_data";
    }

    @PostMapping("/calcsubmit")
    public String processForm(@ModelAttribute calc calc, Model model) {
        calc.setSonuc(0);
        this.hafiza.add(calc.getSonuc());
        model.addAttribute("submittedcalc", calc); 
        System.out.println(hafiza);
        return "calc_result"; 
    }
}



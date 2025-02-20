package com.form.demo.controler;
import com.form.demo.Users.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class user_controler {
    @GetMapping("/data")
    public String showForm(Model model) {
        model.addAttribute("user", new User()); // Send an empty User object
        return "data"; // data.html
    }

    @PostMapping("/submit")
    public String processForm(@ModelAttribute User user, Model model) {
        model.addAttribute("submittedUser", user); // Pass submitted data to result page
        return "results"; // results.html
    }
}


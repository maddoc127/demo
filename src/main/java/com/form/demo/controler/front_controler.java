package com.form.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class front_controler {
    @RequestMapping("/front")
    public String requestMethodName3() {
        return "front";
    }

    @RequestMapping("/")
    public String requestMethodNameFormBuilder() {
        return "form_builder";
    }
}
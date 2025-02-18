package com.form.demo.controler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class front_controler {
    @RequestMapping("/front")
    public String requestMethodName3() {
        return "front";
}
}
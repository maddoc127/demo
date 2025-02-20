package com.form.demo.controler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class Main_page_controler {
    @RequestMapping("/")
    public String requestMethodName() {
        return "hello";}
    @RequestMapping("/tr")
    public String requestMethodName2() {
        return "merhaba";
    }
    @RequestMapping("/fr")
    public String requestMethodName3() {
        return "front";
    }
    @RequestMapping("/byname")
    public String requestMethodName4(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "hello " + name;
    }
    @RequestMapping("/square")
    public int requestMethodName5(@RequestParam(value = "number", defaultValue = "0") int number) {
        return number * number;
    }
    @RequestMapping("/plus")
    public int requestMethodName6(@RequestParam(value = "number", defaultValue = "0") int number,@RequestParam(value = "number2", defaultValue = "0") int number2) {
        return number + number2;
    }
    
}


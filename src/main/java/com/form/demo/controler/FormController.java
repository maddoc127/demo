package com.form.demo.controler;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forms")
public class FormController {

    @PostMapping("/submit")
    public ResponseEntity<String> handleFormSubmit(@RequestBody Map<String, List<String>> payload) {
        List<String> questions = payload.get("questions");

        System.out.println("Gelen Sorular:");
        for (String question : questions) {
            System.out.println("-> " + question);
        }

        return ResponseEntity.ok("Sorular alındı.");
    }
}
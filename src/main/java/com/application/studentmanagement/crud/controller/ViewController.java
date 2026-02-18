package com.application.studentmanagement.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ViewController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot with JSP!");
        return "index";
    }
    @PostMapping("/add")
    public String helloPost(@ModelAttribute String name, String password, Model model) {
        model.addAttribute("add", "Your Name: " + name);
        model.addAttribute("password", password);
        return "result";
    }
}

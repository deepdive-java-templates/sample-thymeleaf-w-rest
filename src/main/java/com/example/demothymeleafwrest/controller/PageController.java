package com.example.demothymeleafwrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String samplePageRender(Model model) {
        model.addAttribute("sample", "Some text as render as sample");
        return "hello-world-page";
    }

}

package org.pokiecake.hayeswebdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String homePage() {
        return "landing-page";
    }

    @GetMapping("/submit-job")
    public String submitJobPage() {
        return "submit-job";
    }

    @PostMapping("/submit-file")
    public String submitFile() {
        return "submit-confirm";
    }
}

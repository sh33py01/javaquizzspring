package com.example.Quizz.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class logincontroller {

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
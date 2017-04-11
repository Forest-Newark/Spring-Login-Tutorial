package com.forestnewark;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * Basic Spring Boot Web App.  Created by Forest Newark.
 */

@Controller
public class LoginController {

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/AfterLogin")
    public String afterLogin(Model model, String username){
        model.addAttribute("username",username);
        model.addAttribute("time",LocalDateTime.now());
        return "AfterLogin";
    }

}

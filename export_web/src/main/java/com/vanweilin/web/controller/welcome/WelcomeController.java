package com.vanweilin.web.controller.welcome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Project: saas_export
 * @Date: 2020/9/12 18:10
 * @Description:
 */
@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    @GetMapping
    public String toIndex() {
        return"/home/main";
    }

    @GetMapping("home")
    public String toHome(){
        return "/home/home";
    }
}

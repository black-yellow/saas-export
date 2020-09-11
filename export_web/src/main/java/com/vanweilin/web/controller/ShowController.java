package com.vanweilin.web.controller;

import com.vanweilin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 19:13
 * @Description:
 */
@Controller
@RequestMapping("/show")
public class ShowController {

    @Autowired
    private CompanyService companyService;


    @GetMapping("company")
    public String showCompany(Model model) {

        model.addAttribute("companyList", companyService.getAllCompany());
        return "/pages/test.jsp";
    }


}

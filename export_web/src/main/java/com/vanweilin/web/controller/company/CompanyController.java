package com.vanweilin.web.controller.company;

import com.vanweilin.model.company.Company;
import com.vanweilin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


/**
 * @Auther: Administrator
 * @Project: saas_export
 * @Date: 2020/9/12 19:22
 * @Description:
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
    public static final String PATHTOLIST = "redirect:/company/list";

    @Autowired
    private CompanyService companyService;

    /*显示所有company数据信息*/
    @GetMapping("list")
    public String showCompanyInfo(Model model) {
        model.addAttribute("companyList", companyService.getAllCompany());
        return "/company/company-list";

    }

    /*删除company信息*/
    @RequestMapping("delete/{id}")
    public String deleteCompany(@PathVariable("id") String cid) {
        companyService.removeCompany(cid);
        return PATHTOLIST;
    }

    /*由于添加和修改都是同步操作
     * 因此添加和修改的后端数据使用同一个方法
     * 但是跳转通过不同名称进行重定向*/
    @GetMapping("toAdd")
    public String toAddPage() {
        return "/company/company-add";
    }

    @RequestMapping("toUpdate")
    public ModelAndView toUpadtePAge(String id) {
        ModelAndView modelAndView = new ModelAndView("/company/company-update");
        Company company = companyService.getCompany(id);
        modelAndView.addObject("company", company);

        return modelAndView;
    }


    @RequestMapping(value = "toEdit", method = RequestMethod.POST)
    public String toEdit(Company company) {
        if (!StringUtils.isEmpty(company.getId())) {
            companyService.updateCompany(company);

        } else {
            company.setId(UUID.fromString(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())).toString());
            company.setExpirationDate(new Date());
            companyService.addCompany(company);
        }
        return PATHTOLIST;


    }
}

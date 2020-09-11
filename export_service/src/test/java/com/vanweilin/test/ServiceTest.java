package com.vanweilin.test;

import com.vanweilin.dao.company.CompanyDao;
import com.vanweilin.model.company.Company;
import com.vanweilin.service.CompanyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 19:41
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext_*.xml")
public class ServiceTest {
    @Autowired
    private CompanyService companyService;

    @Test
    public void test01(){
        System.out.println(companyService.getAllCompany());
    }


}

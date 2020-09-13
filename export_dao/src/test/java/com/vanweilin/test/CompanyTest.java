package com.vanweilin.test;

import com.vanweilin.dao.company.CompanyDao;
import com.vanweilin.model.company.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 17:56
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext_dao.xml")
public class CompanyTest {
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void test01() {
//        System.out.println(companyDao.selAllCompany());
        Company company = new Company();
        company.setId("9167c6c4-6d49-4190-9396-2d038de3304b");
        company.setAddress("湖北武汉华中农业大学");
        company.setIndustry("湖北生鄂州市");
//        companyDao.addCompany(company);
        companyDao.updateCompany(company);
    }
}

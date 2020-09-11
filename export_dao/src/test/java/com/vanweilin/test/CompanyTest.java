package com.vanweilin.test;

import com.vanweilin.dao.company.CompanyDao;
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
        System.out.println(companyDao.selAllCompany());
    }
}

package com.vanweilin.dao.company;

import com.vanweilin.model.company.Company;

import java.util.List;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 17:51
 * @Description:
 */
public interface CompanyDao {
    /*查询所有的company信息*/
    List<Company> selAllCompany();
}

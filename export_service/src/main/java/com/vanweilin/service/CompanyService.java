package com.vanweilin.service;

import com.vanweilin.model.company.Company;

import java.util.List;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 18:56
 * @Description:
 */
public interface CompanyService {

    /*获取全部company信息*/
    List<Company> getAllCompany();
}

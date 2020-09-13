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

    /*去除某个id的company*/
    void removeCompany(String cid);

    /*添加company信息*/
    void addCompany(Company company);

    /*修改company信息*/
    void updateCompany(Company company);

    /*获得指定id的company信息*/
    Company getCompany(String id);
}

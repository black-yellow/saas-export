package com.vanweilin.dao.company;

import com.vanweilin.model.company.Company;
import org.apache.ibatis.annotations.Param;

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

    /*删除指定id的company信息*/
    void deleteCompany(String cid);

    /*添加company信息*/
    void addCompany(Company company);

    /*修改company信息*/
    void updateCompany(Company company);

    /*查询指定id的信息*/
    Company selCompany(String id);
}

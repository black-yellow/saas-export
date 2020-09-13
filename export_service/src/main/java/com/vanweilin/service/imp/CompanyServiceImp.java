package com.vanweilin.service.imp;

import com.vanweilin.dao.company.CompanyDao;
import com.vanweilin.model.company.Company;
import com.vanweilin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 18:56
 * @Description:
 */
@Service
public class CompanyServiceImp implements CompanyService {
    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getAllCompany() {

        return companyDao.selAllCompany();
    }

    @Override
    public void removeCompany(String cid) {
        companyDao.deleteCompany(cid);
    }

    @Override
    public void addCompany(Company company) {
        companyDao.addCompany(company);
    }

    @Override
    public void updateCompany(Company company) {
        companyDao.updateCompany(company);
    }

    @Override
    public Company getCompany(String id) {
        Company company = companyDao.selCompany(id);
        return company;
    }
}

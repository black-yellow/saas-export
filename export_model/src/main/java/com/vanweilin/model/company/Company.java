package com.vanweilin.model.company;


import java.util.Date;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 17:59
 * @Description:
 */
public class Company {


    private String id;
    private String name;
    private Date expirationDate;
    private String address;
    private String licenseId;
    private String representative;
    private String phone;
    private String companySize;
    private String industry;
    private String remarks;
    private Integer state;
    private Double balance;
    private String city;


    public Company() {
    }

    public Company(String id, String name, Date expirationDate, String address, String licenseId, String representative, String phone, String companySize, String industry, String remarks, Integer state, Double balance, String city) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
        this.address = address;
        this.licenseId = licenseId;
        this.representative = representative;
        this.phone = phone;
        this.companySize = companySize;
        this.industry = industry;
        this.remarks = remarks;
        this.state = state;
        this.balance = balance;
        this.city = city;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * 设置
     * @param expirationDate
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return licenseId
     */
    public String getLicenseId() {
        return licenseId;
    }

    /**
     * 设置
     * @param licenseId
     */
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    /**
     * 获取
     * @return representative
     */
    public String getRepresentative() {
        return representative;
    }

    /**
     * 设置
     * @param representative
     */
    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return companySize
     */
    public String getCompanySize() {
        return companySize;
    }

    /**
     * 设置
     * @param companySize
     */
    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    /**
     * 获取
     * @return industry
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * 设置
     * @param industry
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * 获取
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置
     * @param remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取
     * @return state
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * 设置
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Company{id = " + id + ", name = " + name + ", expirationDate = " + expirationDate + ", address = " + address + ", licenseId = " + licenseId + ", representative = " + representative + ", phone = " + phone + ", companySize = " + companySize + ", industry = " + industry + ", remarks = " + remarks + ", state = " + state + ", balance = " + balance + ", city = " + city + "}";
    }
}

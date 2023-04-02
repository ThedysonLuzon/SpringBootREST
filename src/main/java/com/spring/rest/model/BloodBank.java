package com.spring.rest.model;

public class BloodBank {

    private int bloodbankId;
    private String bloodbankName;
    private String address;
    private String city;
    private String phone;
    private String website;
    private String email;


    public BloodBank(int bloodbankId, String bloodbankName, String address, String city, String phone, String website, String email) {
        this.bloodbankId = bloodbankId;
        this.bloodbankName = bloodbankName;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.website = website;
        this.email = email;
    }

    // setters and getters

    public int getBloodBankId() {
        return bloodbankId;
    }

    public void setBloodBankId(int bloodbankId) {
        this.bloodbankId = bloodbankId;
    }

    public String getBloodBankName() {
        return bloodbankName;
    }

    public void setBloodBankName(String bloodbankName) {
        this.bloodbankName = bloodbankName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

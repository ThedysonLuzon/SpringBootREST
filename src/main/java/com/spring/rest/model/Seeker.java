package com.spring.rest.model;

public class Seeker {

    private int seekId;
    private String fName;
    private String lName;
    private int age;
    private String gender;
    private String bloodGroup;
    private String city;
    private String phone;

    public Seeker(int seekId, String fName, String lName, int age, String gender, String bloodGroup, String city, String phone) {
        this.seekId = seekId;
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.phone = phone;
    }

    //get and set methods


    public int getSeekId() {
        return seekId;
    }

    public void setSeekId(int seekId) {
        this.seekId = seekId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
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
}

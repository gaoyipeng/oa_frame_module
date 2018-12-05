package com.sxdx.oa_service.springCacheTest.model;

public class Employee {
    private Integer id;

    private String lastname;

    private String email;

    private Integer gender;

    private Integer did;

    public Employee(Integer id, String lastname, String email, Integer gender, Integer did) {
        this.id = id;
        this.lastname = lastname;
        this.email = email;
        this.gender = gender;
        this.did = did;
    }

    public Employee() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
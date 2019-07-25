package com.aaa.entity;

import java.io.Serializable;

public class Person_Info implements Serializable {
    private Integer personId;

    private String personName;

    private Integer personAreaId;

    private Integer personAge;

    private String areaName;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    private String personAddress;

    private static final long serialVersionUID = 1L;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName == null ? null : personName.trim();
    }

    public Integer getPersonAreaId() {
        return personAreaId;
    }

    public void setPersonAreaId(Integer personAreaId) {
        this.personAreaId = personAreaId;
    }

    public Integer getPersonAge() {
        return personAge;
    }

    public void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress == null ? null : personAddress.trim();
    }
}
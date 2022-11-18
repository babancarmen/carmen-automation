package com.siit.course;

import com.siit.course.Person;

import java.util.Date;

public class CarBrands {

    private String name;
    private Date establishDate;
    private  String owner;
    private String contact;
    private Person ceo;

    public CarBrands(String name, Date establishDate, String owner, String contact, Person ceo) {
        this.name = name;
        this.establishDate = establishDate;
        this.owner = owner;
        this.contact = contact;
        this.ceo = ceo;
    }

    public CarBrands() {
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.establishDate;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public String getOwner() {
        return owner;
    }

    public String getContact() {
        return contact;
    }

    public Person getCeo() {
        return ceo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setCeo(Person ceo) {
        this.ceo = ceo;
    }
}

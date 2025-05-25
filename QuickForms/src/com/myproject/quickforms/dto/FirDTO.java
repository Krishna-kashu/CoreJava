package com.myproject.quickforms.dto;

public class FirDTO {
    private String name;
    private String contact;
    private String datetime;
    private String location;
    private String description;


    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getDatetime() {
        return datetime;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

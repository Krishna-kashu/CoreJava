package com.myproject.quickforms.dto;


public class DonationDTO {
    private String name;
    private String contact;
    private String email;
    private String amount;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public String getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}

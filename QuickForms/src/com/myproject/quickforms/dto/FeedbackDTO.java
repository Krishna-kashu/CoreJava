package com.myproject.quickforms.dto;

public class FeedbackDTO {
    private String name;
    private String contact;
    private String email;
    private String feedback;

    public FeedbackDTO(){
        System.out.println("no-argument const. of FeedbackDTO");
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

    public String getFeedback() {
        return feedback;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}

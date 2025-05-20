package com.myproject.quickforms.dto;

public class LabDTO {
    private String name;
    private String rollNumber;
    private String expNumber;
    private String observation;

    public LabDTO() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getExpNumber() {
        return expNumber;
    }

    public void setExpNumber(String expNumber) {
        this.expNumber = expNumber;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}

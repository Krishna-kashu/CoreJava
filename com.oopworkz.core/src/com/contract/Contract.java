package com.contract;

public class Contract {
    private String contractorName;
    private double contractValue;
    public Contract() {
        System.out.println("no-arg constructor of Contract");
    }

    public void sign() {
        System.out.println("Running sign() in Contract");
    }
    public Contract(String contractorName, double contractValue) {
        this.contractorName = contractorName;
        this.contractValue = contractValue;
        System.out.println("String, double constructor of Contract");
    }

    public Contract(Contract ref) {
        this.contractorName = ref.contractorName;
        this.contractValue = ref.contractValue;
    }

    @Override
    public String toString() {
        return "Contract Contractor: " + contractorName + ", Value: " + contractValue;
    }
}

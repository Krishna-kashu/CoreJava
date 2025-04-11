package com.contract;

public class ContractRunner {
    public static void main(String[] args) {
        Contract contract = new Contract();
        contract.sign();

        Contract contract1 = new FreelanceContract();
        contract1.sign();

        System.out.println("**********");

        FreelanceContract fc = new FreelanceContract();
        fc.sign();
        fc.addDeliverables();
    }
}

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

        Contract contract2 = new Contract("John Doe", 5000.0);
        Contract contract3 = new Contract(contract2);
        System.out.println(contract3);
    }
}

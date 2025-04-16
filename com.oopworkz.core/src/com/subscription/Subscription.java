package com.subscription;

public class Subscription {
    private String serviceName;
    private int durationMonths;
    public Subscription() {
        System.out.println("no-arg constructor of Subscription");
    }

    public void activate() {
        System.out.println("Running activate() in Subscription");
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setDurationMonths(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    public Subscription(Subscription ref) {
        this.serviceName = ref.serviceName;
        this.durationMonths = ref.durationMonths;
    }

    @Override
    public String toString() {
        return "Service: " + serviceName + ", Duration: " + durationMonths + " months";
    }

}

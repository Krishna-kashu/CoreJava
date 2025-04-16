package com.service;

public class Service {
    private String serviceName;
    private boolean available;
    public Service() {
        System.out.println("no-arg constructor of Service");
    }

    public void provide() {
        System.out.println("Running provide in Service");
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Service(Service ref) {
        this.serviceName = ref.serviceName;
        this.available = ref.available;
    }

    @Override
    public String toString() {
        return "Service: " + serviceName + ", Available: " + available;
    }

}

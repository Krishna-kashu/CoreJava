package com.form;

public class RegistrationForm extends Form {
    public RegistrationForm() {
        System.out.println("no-arg constructor of RegistrationForm");
    }

    @Override
    public void submit() {
        System.out.println("Running overridden submit in RegistrationForm");
    }

    void validateFields() {
        System.out.println("Running validateFields in RegistrationForm");
    }
}

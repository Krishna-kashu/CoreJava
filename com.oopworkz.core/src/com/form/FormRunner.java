package com.form;

public class FormRunner {
    public static void main(String[] args) {
        Form form = new Form();
        form.submit();

        Form form1 = new RegistrationForm();
        form1.submit();

        System.out.println("**********");

        RegistrationForm regForm = new RegistrationForm();
        regForm.submit();
        regForm.validateFields();
    }
}

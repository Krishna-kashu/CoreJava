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

        Form form2 = new Form("Admission Form", 10);
        Form form3 = new Form(form2);
        System.out.println(form3);

    }
}

package com.form;

public class Form {
    private String formTitle;
    private int fieldsCount;
        public Form() {
            System.out.println("no-arg constructor of Form");
        }

        public void submit() {
            System.out.println("Running submit in Form");
        }
    public Form(String formTitle, int fieldsCount) {
        this.formTitle = formTitle;
        this.fieldsCount = fieldsCount;
        System.out.println("String, int constructor of Form");
    }

    public Form(Form ref) {
        this.formTitle = ref.formTitle;
        this.fieldsCount = ref.fieldsCount;
    }

    @Override
    public String toString() {
        return "Form Title: " + formTitle + ", Fields Count: " + fieldsCount;
    }
    }
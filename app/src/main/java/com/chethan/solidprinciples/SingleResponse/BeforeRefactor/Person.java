package com.chethan.solidprinciples.SingleResponse.BeforeRefactor;

/**
 *  The following example is a TypeScript class that defines a Person, this class should not include email
 *  validation because that is not related with a person behaviour
 */
public class Person {
    private String name;
    private String surName;
    private String email;

    public Person(String name, String surName, String email) {
        this.name = name;
        this.surName = surName;

        if (isValidEmailAddress(email))
            this.email = email;
        else {
            throw new Error("Invalid Email");
        }
    }

    public boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

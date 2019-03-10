package com.chethan.solidprinciples.SingleResponse.AfterRefactoring;

/**
 * We can improve the class above by removing the responsibility of email validation from the Person class
 * and creating a new Email class that will have that responsibility:
 */

public class Person {
    private String name;
    private String surName;
    private Email email;

    public Person(String name, String surName, Email email) {
        this.name = name;
        this.surName = surName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Email getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}

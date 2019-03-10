package com.chethan.solidprinciples.DependencyInversionPrinciple.After;

public class CustomerDataAccess implements ICustomerDataAccess {
    public CustomerDataAccess() {
    }

    public String GetCustomerName(int id) {
        return "Dummy Customer Name";
    }
}

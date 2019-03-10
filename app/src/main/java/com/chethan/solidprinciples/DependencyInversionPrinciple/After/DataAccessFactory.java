package com.chethan.solidprinciples.DependencyInversionPrinciple.After;

public class DataAccessFactory {
    public static ICustomerDataAccess GetCustomerDataAccessObj()
    {
        return new CustomerDataAccess();
    }
}

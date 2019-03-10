package com.chethan.solidprinciples.DependencyInversionPrinciple.After;

public class CustomerBusinessLogic {
    ICustomerDataAccess custDataAccess;

    public CustomerBusinessLogic() {
        custDataAccess = DataAccessFactory.GetCustomerDataAccessObj();
    }

    public String GetCustomerName(int id) {
        return custDataAccess.GetCustomerName(id);
    }
}

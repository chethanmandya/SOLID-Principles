package com.chethan.solidprinciples.DependencyInversionPrinciple.Before;

public class CustomerBusinessLogic {
    public CustomerBusinessLogic() {
    }

    public String GetCustomerName(int id) {
        DataAccess dataAccess = DataAccessFactory.GetDataAccessObj();

        return dataAccess.GetCustomerName(id);
    }
}

package com.chethan.solidprinciples.DependencyInversionPrinciple.Before;

public class DataAccessFactory {
    public static DataAccess GetDataAccessObj() {
        return new DataAccess();
    }
}

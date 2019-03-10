package com.chethan.solidprinciples.LiskovSubstitution.After;

public class ContractEmployee extends Employee implements IEmployee {

    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public int getEmployeeId() {
        return getId();
    }

    @Override
    public String getEmployeeName() {
        return getName();
    }

    @Override
    public float getMinimumSalary() {
        return 5000;
    }
}

package com.chethan.solidprinciples.LiskovSubstitution.Before;

public class ContractEmployee extends Employee {

    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public float getMinimumSalary() {
        return 5000;
    }

    @Override
    public float calculateBonus(float salary) {
        throw new UnsupportedOperationException("No implementation available");
    }
}

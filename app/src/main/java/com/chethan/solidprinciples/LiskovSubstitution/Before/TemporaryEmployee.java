package com.chethan.solidprinciples.LiskovSubstitution.Before;

public class TemporaryEmployee extends Employee {
    public TemporaryEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public float getMinimumSalary() {
        return 5000;
    }

    @Override
    public float calculateBonus(float salary) {
        return (float) (salary * 0.5);
    }
}

package com.chethan.solidprinciples.LiskovSubstitution.Before;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public float getMinimumSalary() {
        return 15000;
    }

    @Override
    public float calculateBonus(float salary) {
        return (float) (salary * 0.8);
    }
}

package com.chethan.solidprinciples.LiskovSubstitution.After;

public class PermanentEmployee extends Employee implements IEmployee, IEmployeeBonus {

    public PermanentEmployee(int id, String name) {
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
        return 15000;
    }

    @Override
    public float CalculateEmployeeBonus(float salary) {
        return (float) (salary * 0.8);
    }
}

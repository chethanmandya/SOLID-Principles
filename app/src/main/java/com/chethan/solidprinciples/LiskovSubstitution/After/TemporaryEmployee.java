package com.chethan.solidprinciples.LiskovSubstitution.After;

public class TemporaryEmployee extends Employee implements IEmployee, IEmployeeBonus {

    public TemporaryEmployee(int id, String name) {
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
        return 0;
    }

    @Override
    public float CalculateEmployeeBonus(float salary) {
        return (float) (salary * 0.5);
    }
}

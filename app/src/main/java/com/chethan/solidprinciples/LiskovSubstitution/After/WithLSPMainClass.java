package com.chethan.solidprinciples.LiskovSubstitution.After;


import java.util.ArrayList;
import java.util.List;

public class WithLSPMainClass {

    List<IEmployee> listOfEmployee = new ArrayList<IEmployee>();

    public WithLSPMainClass() {
        listOfEmployee.add(new PermanentEmployee(1, "Chethan"));
        listOfEmployee.add(new TemporaryEmployee(2, "Raj"));
        listOfEmployee.add(new ContractEmployee(3, "Rimple"));
    }

    public void displayEmployeeDetails() {
        for (IEmployee employee : listOfEmployee) {
            try {
                System.out.println(employee.getEmployeeId() + " : " + employee.getEmployeeName() + " : " + employee.getMinimumSalary());
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

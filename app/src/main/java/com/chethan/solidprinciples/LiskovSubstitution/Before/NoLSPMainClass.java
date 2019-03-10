package com.chethan.solidprinciples.LiskovSubstitution.Before;

import java.util.ArrayList;
import java.util.List;

public class NoLSPMainClass {

    List<Employee> listOfEmployee = new ArrayList<Employee>();

    public NoLSPMainClass() {
        listOfEmployee.add(new PermanentEmployee(1, "Chethan"));
        listOfEmployee.add(new TemporaryEmployee(2, "Raj"));
        listOfEmployee.add(new ContractEmployee(3, "Rimple"));
    }

    public void displayEmployeeDetails() {
        for (Employee employee : listOfEmployee) {
            try {
                System.out.println(employee.getId() + " : " + employee.getName() + " : " + employee.calculateBonus(employee.getMinimumSalary()));
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

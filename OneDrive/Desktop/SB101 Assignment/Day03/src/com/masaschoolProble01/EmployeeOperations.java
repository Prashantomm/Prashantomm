package com.masaschoolProble01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class EmployeeOperations {
    public static String getEmployeeWithMinimumSalary(List<Employee> employeeList) {
        Optional<Employee> minSalariedEmployee = employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
        if (minSalariedEmployee.isPresent()) {
            return minSalariedEmployee.get().getName();
        } else {
            return "No employees found";
        }
    }
}

@FunctionalInterface
interface CreateEmployeeObject{
    Employee getObject(int employeeId, String name, double salary);
}

@FunctionalInterface
interface ShowDetails {
    String getEmployeeDetailsInString();
}

@FunctionalInterface
interface FindMin{
    String getMinSalariedEmployee(List<Employee> employeeList);
}



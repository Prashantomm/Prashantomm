package com.masaschoolProble01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodRefDemo {
    public static void main(String[] args) {
        CreateEmployeeObject createEmp = Employee::new;
        Employee emp1 = createEmp.getObject(1, "Prashant", 1000.0);
        
        Employee emp2 = createEmp.getObject(2, "Suraj", 7000.0);
        Employee emp3 = createEmp.getObject(3, "Subham", 4000.0);
        Employee emp4 = createEmp.getObject(4, "Navneet", 6000.0);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        Collections.sort(employeeList);
        FindMin findMin = EmployeeOperations::getEmployeeWithMinimumSalary;
        System.out.println(findMin.getMinSalariedEmployee(employeeList));
    }
}

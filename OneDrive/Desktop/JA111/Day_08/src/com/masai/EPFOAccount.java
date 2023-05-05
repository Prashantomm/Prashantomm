package com.masai;

public class EPFOAccount {
	private String accountNo;
    private int balance;

    EPFOAccount(String accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public String toString() {
        return "Account number: " + accountNo + " Balance: " + balance + "/-";
    }

}

class Employee {
    // write code here
    private String employeeId;
    private String name;
    private int salary;
    private EPFOAccount epfoAccount;

    Employee(String employeeId, String name, int salary, EPFOAccount e2) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.epfoAccount = e2;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee e = (Employee) o;
        return e.employeeId.equals(employeeId);
    }

    public int hashCode() {
        return employeeId.hashCode();
    }

    public String toString() {
        return "Employee Id: " + employeeId + " Name: " + name + " Salary: " + salary + " EPFO Account details: ("
                + epfoAccount + ")";
    }

}


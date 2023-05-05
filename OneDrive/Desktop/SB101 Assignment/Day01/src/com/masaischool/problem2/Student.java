package com.masaischool.problem2;

public abstract class Student {
	
	private int rollNo;
    private String name;
    private String state;
    
    public Student(int rollNo, String name, String state) {
        this.rollNo = rollNo;
        this.name = name;
        this.state = state;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public String getState() {
        return state;
    }
    
    @Override
    public String toString() {
        return "Roll No: " + rollNo + ", Name: " + name + ", State: " + state;
    }
}

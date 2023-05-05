package com.masaischoolProblem02;

class NoStudentPassedException extends Exception {
    public NoStudentPassedException() {
        super("No student is passed");
    }
}
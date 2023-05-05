package com.masaischool.problem2;

import java.util.*;
public class Demo {
	
	 static void findStudentWithSameState(List<Student> resultList, List<? extends Student> list1, List<? extends Student> list2, String state) {
	        for (Student student : list1) {
	            if (student.getState().equals(state)) {
	                resultList.add(student);
	            }
	        }
	        
	        for (Student student : list2) {
	            if (student.getState().equals(state)) {
	                resultList.add(student);
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        List<SchoolStudent> schoolStudents = new ArrayList<>();
	        schoolStudents.add(new SchoolStudent(1, "Bulbul", "Bhubneshwar", "Odissa Board"));
	        schoolStudents.add(new SchoolStudent(2, "Jayesh", "Patna", "Bihar Board"));
	        schoolStudents.add(new SchoolStudent(3, "Krishna", "Hazaribagh", "Jharkhand Board"));
	        schoolStudents.add(new SchoolStudent(4, "Prithvi", "Raiganj", "Bengal Board"));
	        schoolStudents.add(new SchoolStudent(5, "Kajal", "Samastipur", "Bihar Board"));
	        
	        List<CollegeStudent> collegeStudents = new ArrayList<>();
	        collegeStudents.add(new CollegeStudent(101, "Aushi", "Kolakta", "Calcutta University"));
	        collegeStudents.add(new CollegeStudent(102, "Anjali", "Banglore", "DSI University"));
	        collegeStudents.add(new CollegeStudent(103, "Akansha", "Durgapur", "BCI University"));
	        collegeStudents.add(new CollegeStudent(104, "Dipti", "Jaipur", "Rajasthan University"));
	        collegeStudents.add(new CollegeStudent(105, "Navya", "Patna", "Bihar University"));
	        
	        List<Student> resultList = new ArrayList<>();
	        findStudentWithSameState(resultList, schoolStudents, collegeStudents, "Banglore");
	        
	        System.out.println(resultList);
	    }

}
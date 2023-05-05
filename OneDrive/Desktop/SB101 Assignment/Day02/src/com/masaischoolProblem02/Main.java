package com.masaischoolProblem02;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for student " + (i+1));
            System.out.print("Enter roll no: ");
            int rollNo = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            students.add(new Student(rollNo, name, marks));
        }

        // Create a functional interface to classify students
        StudentClassifier classifier = studentList -> {
            Map<String, List<Student>> result = new HashMap<>();
            List<Student> failList = new ArrayList<>();
            List<Student> passList = new ArrayList<>();
            List<Student> topperList = new ArrayList<>();
            for (Student s : studentList) {
                if (s.getMarks() < 165) {
                    failList.add(s);
                } else if (s.getMarks() < 400) {
                    passList.add(s);
                } else {
                    topperList.add(s);
                }
            }
            result.put("Fail", failList);
            result.put("Pass", passList);
            result.put("Topper", topperList);
            return result;
        };

        // Call the classifier to get the result map
        Map<String, List<Student>> resultMap = classifier.classify(students);

        // Print the result using consumer
        Consumer<Map<String, List<Student>>> consumer = result -> {
            System.out.println("Fail List:");
            result.get("Fail").forEach(System.out::println);
            System.out.println("Pass List:");
            result.get("Pass").forEach(System.out::println);
            System.out.println("Topper List:");
            result.get("Topper").forEach(System.out::println);
        };

        consumer.accept(resultMap);
    }

    @FunctionalInterface
    interface StudentClassifier {
        Map<String, List<Student>> classify(List<Student> studentList);
    }
}

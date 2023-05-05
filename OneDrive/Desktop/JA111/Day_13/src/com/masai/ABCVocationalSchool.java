package com.masai;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class ABCVocationalSchool{
	  static long getCourseDurationinDays(String startDateText, String endDateText) throws InvalidDatesException, TooLongCourseException, TooShortCourseException {
		  
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		LocalDate sd = LocalDate.parse(startDateText, dft);
		LocalDate ed = LocalDate.parse(endDateText, dft);
		
		long diff = ChronoUnit.DAYS.between(sd, ed);
		
		Period p = Period.between(sd, ed);
		
		if(diff<0) {
			throw new InvalidDatesException("Start date must not be after end date");
		}
		
		if(diff>30) {
			throw new TooLongCourseException("Course duration should not be more than 30 days");
		}
		
		if(diff<15) {
			throw new TooShortCourseException("Course duration should not be less than 15 days");
		}
		  
		  return diff;
	    //write code to get duration in days between start date and end date
	    //if duration of course is more than 30 days, throws TooLongCourseException
	    //if duration of course is less than 15 days, throws TooShortCourseException
	    //if start date is after end date, throws InvalidDatesException
	  }
	  
	  static long getMedicalLeavesDurationinDays(String startDateText, String endDateText, long courseDurationInDays) throws InvalidDatesException, TooMuchMedicalLeavesException {
		  
		  DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			LocalDate sd = LocalDate.parse(startDateText, dft);
			LocalDate ed = LocalDate.parse(endDateText, dft);
			
			long diff = ChronoUnit.DAYS.between(sd, ed);
			
			Period p = Period.between(sd, ed);
			
			if(diff<0) {
				throw new InvalidDatesException("Start date must not be after end date");
			}
			
			if(diff>0.2*courseDurationInDays) {
				throw new TooMuchMedicalLeavesException("Maximum 20% of total course duration can be taken as medical leave");
			}
		return diff;
	    //write code to get duration in days between start date and end date of medical leave
	    //if duration of medical leave is more than 20% to course duration, throws TooMuchMedicalLeavesException
	    //if start date is after end date, throws InvalidDatesException
	  }
	  
	  static double getAttendancePercentage(long courseDurationInDays, long medicalLeavesInDays, long attendanceInDays) throws TooShortAttendanceException{
		  long Days =  courseDurationInDays - medicalLeavesInDays;
		  
		  double attendance = (attendanceInDays/Days)*100;
		  
		  if(attendance<75) {
			  throw new TooShortAttendanceException("Minimum 75% attendance is required to appear in examination");
		  }
		
		  return attendance;
	    //code to return total percentage of attendance
	    //throws TooShortAttendanceException if attendance is less than 75.00%
	  }
	  
	  static String getRemark(double attendancePercentage){
		  
		  if(attendancePercentage>=95) {
			  return "You got 10 out of 10 marks in discipline and extracurricular activity";
		  }
		  
		  if(attendancePercentage>=90) {
			  return "You got 8 out of 10 marks in discipline and extracurricular activity";
		  }
		  
		  if(attendancePercentage>=85) {
			  return "You got 6 out of 10 marks in discipline and extracurricular activity";
		  }
		  if(attendancePercentage>=80) {
			  return "You got 4 out of 10 marks in discipline and extracurricular activity";
		  }
		  if(attendancePercentage>=75) {
			  return "You got 2 out of 10 marks in discipline and extracurricular activity";
		  }
		return "";
	    //return remark based on attendance percentage such that this method is called when attendance percentage is more than or equals to 75.00
	  }
	  
	  public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    try{
	      System.out.print("Enter course start date of course ");
	      String courseStartDate = sc.next();
	      System.out.print("Enter course end date of course ");
	      String courseEndDate = sc.next();
	      long courseDurationInDays = getCourseDurationinDays(courseStartDate, courseEndDate);
	      System.out.println("Total course duration is " + courseDurationInDays + " days");
	      System.out.print("Have you taken medical leaves? (y/n) ");
	      char takenMedicalLeave = sc.next().toLowerCase().charAt(0);
	      long medicalLeavesInDays = 0;
	      if(takenMedicalLeave == 'y'){

	        System.out.print("Enter medical leave start date ");
	        String medicalStartDate = sc.next();
	        System.out.print("Enter medical leave end date ");
	        String medicalEndDate = sc.next();
	        medicalLeavesInDays = getMedicalLeavesDurationinDays(medicalStartDate, medicalEndDate, courseDurationInDays);
	        System.out.println("Total medical leave duration is " + medicalLeavesInDays + " days");
	      }
	      System.out.print("Enter number of days you attended this course ");
	      long attendanceInDays = sc.nextLong();
	      double attendancePercentage = getAttendancePercentage(courseDurationInDays,
	      medicalLeavesInDays, attendanceInDays);
	      System.out.println(getRemark(attendancePercentage));
	    }catch(Exception ex){
	      System.out.println(ex.getMessage());
	    }
	    sc.close();
	  }
	}


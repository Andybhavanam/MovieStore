package com.java.practice.series;

import java.util.Scanner;

public abstract class StudentImpl implements StudentInterface{
	
	Scanner input = new Scanner(System.in);
	
	private static double total;
	private static double average;
	
	public void studentComputation(){
		
		StudentUtility obj = new StudentUtility();

		/*System.out.println("Enter Student Number:");
		obj.setStudentNumber(input.nextInt());
		
		System.out.println("Enter Student Name:");
		input.next();
		obj.setStudentName(input.nextLine());*/
		
		System.out.println("Enter Course 1 Marks:");
		obj.setMarks1(input.nextDouble());
		
		System.out.println("Enter Course 2 Marks:");
		obj.setMarks2(input.nextDouble());
		
		System.out.println("Enter Course 3 Marks:");
		obj.setMarks3(input.nextDouble());
		
		if((obj.getMarks1()>100||obj.getMarks2()>100||obj.getMarks3()>100) ||
		(obj.getMarks1()<=0||obj.getMarks2()<=0||obj.getMarks3()<=0)){
			System.out.println("The total marks for each course are 100! And don't give negative marks Try Again !");
			System.exit(0);
		}
		
		total = obj.getMarks1()+obj.getMarks2()+obj.getMarks3();
		average = total/3.0;
		System.out.println("Total Marks: "+total);
		System.out.println("The Average of the Marks: "+average);
	}

	
	public void studentGarding() {
		studentCalculation();
	}
	
	private void studentCalculation(){
		if(average>75){
			System.out.println("Distinction!");
		}else if(average<75 && average >60){
			System.out.println("First Class ");
		}else if(average<60 && average >45){
			System.out.println("Second Class ");
		}else if(average<45 && average >35){
			System.out.println("Third Class ");
		}else if(average<35){
			System.out.println("Retake buddy !");
		}
	}

}

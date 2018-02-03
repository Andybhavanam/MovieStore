package com.java.practice.series;

public class CodeTest {
	
	public static void main(String[] args) {
		System.out.println("Salary after 5 years including interest : " +salaryClaculation(5, 5000, 0.15));
	}
	
	public static double salaryClaculation(int totalYears, double salary, double interest){
		int year =1;
		while(year<=totalYears){
			salary = salary+(salary*interest);
			year ++;
		}
		return salary;
	}
}

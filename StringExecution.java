package com.java.practice.series;

public class StringExecution {
	
	public static void main(String[] args){
		String s1 = new String();
		
		String s3= new String();
		s1 = "Test";
		String s2 = s1;
		s3 = "Test";
		
		if(s1==s2){
			System.out.println("s1==s2");
			if(s1.equals(s3)){
				System.out.println("s1.equals(s3)");
			}
		}else if(s2==s3){
			System.out.println("s2==s3");
		}
	}
}

package com.java.practice.series;

public class Execution {
	
	/*public static void test(double s){
		System.out.println("Integer");
	}
	
	public static void test(String s){
		System.out.println("String");
	}
	
	public static void test(Object s){
		System.out.println("Object");
	}

	
	
	public static void main(String[] a){
		test(null);
	}*/
	
	int result;
	
	public static void main(String[] a){
		Execution execution = new Execution();
		System.out.println(execution.factorial(5));
	}
	public int factorial(int n){
		if(n==1){
			return result=1;
		}else{
			return result=n*factorial(n-1);
		}
	}
}

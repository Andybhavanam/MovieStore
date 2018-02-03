package com.java.practice.series;

public class Area {
	private static final double pi=3.45;
	
		
	public void area(int length, int breadth){
		int area = length*breadth;
		System.out.println(area);
	}
	
	public void area(int sideLength){
		int area = sideLength*sideLength;
		System.out.println(area);
	}
	
	public void areaCircle(int radius){
		double area = pi*radius*radius;
		System.out.println(area);
		
	}

}

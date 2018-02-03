package com.java.practice.series;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImplementingArray {
	
	public static void main(String[] args) {
		implementation();
	}
	
	public static void implementation(){
		
		Map<String, Double> employeeMap = new HashMap<String, Double>();
		
		employeeMap.put("Peter", 5555.0);
		employeeMap.put("Janny", 5000.0);
		employeeMap.put("Dann", 6849.0);
		employeeMap.put("Ron", 3467.0);
		employeeMap.put("Natalie", 1234.0);
		employeeMap.put("Dino", 89735.0);
		employeeMap.put("Tom", 7635.0);
		
		List<Double> employeeSalaryList = new ArrayList<Double>(employeeMap.values());
		Collections.sort(employeeSalaryList);
		
		for(int i = employeeSalaryList.size()-1; i>=0;i--){
			System.out.println(employeeSalaryList.get(i));
		}
	}
}

package com.java.practice.series;

import java.util.*;

public class Sample {
	public String solution(int A, int B) {
	     int result= (A/B);
	     int remainder=(A%B);
	     List<Integer> remainders = new ArrayList<Integer>();
	     List<Integer> digits = new ArrayList<Integer>();
	     Integer start=null;
	     while(!remainders.contains(remainder)){
	    	 remainders.add(remainder);
	    	 digits.add((10*remainder/B));
	    	 remainder=(10*remainder/B);
	    	 start=remainders.get(remainder);
	     }
	     return start.toString();
	 }
}


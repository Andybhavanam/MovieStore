package com.java.practice.series;

public class FizzBuzz {

	public static void main(String[] args) {
		int N=105;
		
		for(int i=1;i<=N;i++){
			
			System.out.println(i % 3 == 0 || i % 5 == 0 || i%7==0? 
					((i % 3) == 0 ? "Fizz" : "") + 
					((i % 5) == 0 ? "Buzz" : "") +
					((i % 7) == 0 ? "Woof" : ""): i);
		}

	}

}

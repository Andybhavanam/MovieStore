package com.java.practice.series;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args){
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] inpar = s.split(" ");
		
		for(int i=0;i<inpar.length;i++){
			System.out.println(inpar[i]);
		}
		
		
		
		for(int i = 0;i<inpar.length;i++){
			try{
				if(inpar[i].equals("POP")){
					st.pop();
				}
				else if(inpar[i].equals("DUP")){
					System.out.println(st.push(st.peek()));
				}
				else if(inpar[i].equals("+")){
					st.push(st.pop()+st.pop());
				}
				else if(inpar[i].equals("-")){
					st.push(st.pop()-st.pop());
				}
				else{
					st.push(Integer.parseInt(inpar[i]));
				}
			}catch(Exception e){
				System.out.println("-1");
			}
		}
		
		System.out.println(st);
	}
}
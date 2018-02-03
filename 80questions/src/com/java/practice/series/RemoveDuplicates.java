package com.java.practice.series;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] array = {1, 3, 4, 5, 7, 7, 8, 3, 4, 2, 1, 1};
		int[] secondArray = new int[array.length];
		Arrays.sort(array);
		int j=0;

		for(int i=0; i<array.length-1;i++){
			if(array[i]<array[i+1]){
				secondArray[j]=array[i];
				j++;
			}
			secondArray[j]=array[i+1];
		}
		
		for(int value:secondArray){
			System.out.println(value);
		}
	}
}

package com.java.practice.series;

import java.util.Scanner;

public class CheckIfFibbonacci {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elememt to find it is fibbonacci :");
        int n = scanner.nextInt();
		int i = 0;
		int j = 1;
		int k = 0;
		while (k < n) {
			k = i + j;
			i = j;
			j = k;
			System.out.print(k + " ");
		}
		System.out.println();
		if (k == n)
			System.out.printf("%d is fibbonacci number", n);
		else
			System.out.printf("%d is not Fibbonacci number", n);

	}

}
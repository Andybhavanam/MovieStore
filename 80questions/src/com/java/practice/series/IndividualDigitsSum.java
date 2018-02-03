package com.java.practice.series;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndividualDigitsSum extends Area{
	
		//18
		public static void individualDigitsSum(){
			int number = 257, digit, sum=0;
			
			while(number>0){
				digit=number%10;
				number=number/10;
				sum= sum+digit;
			}
			System.out.println(sum);
		}
		
		//19
		public static void greatestNumberOf2Numbers(){
			int a=2,b=4, largestNumber;
			largestNumber = (a>b)?a:b;
			System.out.println(largestNumber);
		}
		
		//20
		public static void greatestNumberOf3Numbers(){
			int a=7,b=9,c=5, largestNumber;
			largestNumber = (a>b)?((a>c)?a:c):((b>c)?b:c);
			System.out.println(largestNumber);
			
		}
		
		//21
		public static void greatestNumberOf4Numbers(){
			int a=1,b=2,c=3,d=4, largestNumber;
			largestNumber = ((a>b)&&(a>c)&&(a>d)) ? a : (((b>c)&&(b>d)) ? b :((c>d)?c:d));
			System.out.println(largestNumber);
		}
		
		//22
		public static void multiplicationOfDigits(){
			int number = 421, digit, multiply=1;
			while(number>0){
				digit = number%10;
				number= number/10;
				multiply =multiply*digit;
			}
			System.out.println(multiply);
		}
		
		//23
		public static void shortestNumberOf2Numbers(){
			int a=2,b=4, shortestNumber;
			shortestNumber = (a<b)?a:b;
			System.out.println(shortestNumber);
		}
		
		//24
		public static void shortestNumberOf3Numbers(){
			int a=7,b=9,c=5, shortestNumber;
			shortestNumber = (a<b)?((a<c)?a:c):((b<c)?b:c);
			System.out.println(shortestNumber);
		}
		
		//25
		public static void shortestNumberOf4Numbers(){
			int a=1,b=2,c=3,d=4, shortestNumber;
			shortestNumber = ((a<b)&&(a<c)&&(a<d)) ? a : (((b<c)&&(b<d)) ? b :((c<d)?c:d));
			System.out.println(shortestNumber);
		}
		
		//26
		public static void multiplicationTable(){
			int tableValue = 4, tableLength = 10;
			for(int i=1; i<=tableLength;i++){
				System.out.println(tableValue+"*"+i+"="+tableValue*i);
			}
		}
		
		//27
		public static void multiplicationTableSeries(){
			int tableSeriesValue =20, tableLength = 10;
			for(int i=1;i<=tableSeriesValue;i++){
				System.out.println(i+" Multiplication Table Value");
				for(int j=1;j<=tableLength;j++){
					System.out.println(i+"*"+j+"="+i*j);
				}
			}
		}
		
		//28
		public static void sumOfEvenNumberSeries(){
			/*int seriesLength = 200, sum =0 ;
			for(int i=1; i<=seriesLength; i++){
				if(i%2==0){
					sum+=i;
				}
			}
*/			//sum of even numbers: n(n+1)
			//Even Number: 2n
			int startingElement = 2, endingElement = 9, sum ;
			
			startingElement = (startingElement%2==0)? startingElement:startingElement+1;
			endingElement = (endingElement%2==0)?endingElement:endingElement-1;
			
			int numberOfElements = ((startingElement+endingElement)/2)-1;
			sum = numberOfElements*(numberOfElements+1);
			System.out.println(sum);
		}
		
		//29
		public static void sumOfOddNumberSeries(){
			//Sum of Odd : n^2
			//Odd Number: 2n-1
			
			int startingNumber = 2, endingNumber = 9, sum;
			
			startingNumber = (startingNumber%2!=0)? startingNumber:startingNumber-1;
			endingNumber = (endingNumber%2!=0)?endingNumber:endingNumber-1;
			
			int numberOfElements = ((startingNumber+endingNumber)/2);
			//1 2 3 4 5 6 7 8 9 10
			//1 3 5 7 9 = 25
			//2 4 6 8 10 = 30
			sum = (numberOfElements)*numberOfElements;
			System.out.println(sum);
			
		}
		
		//30
		public static void sumOfNumberSeries(){
			int startingNumber = 2, endingNumber = 101, sum;
			int numberOfElemnts = (endingNumber-startingNumber)+1;
			sum = numberOfElemnts*(numberOfElemnts+1)/2;
			System.out.println(sum);
					
		}
		
		//31
		public static void swap2Numbers(){
			int a[] = {5,1,2,4,3};
			int temp=0;
			for(int i=0;i<a.length;i++){
				for(int j=i;j<a.length;j++){
					if(a[i]>a[j]){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}
		}
		
		//32
		public static void swap2NumbersWithoutTemp(){
			//a, b
			//{5,1,2,4,3} a=5, b=1
			//a=a+b=6
			//b=a-b=5
			//a=a-b=1
			int a[] = {5,1,2,4,3};
			int temp=0;
			for(int i=0;i<a.length;i++){
				for(int j=i;j<a.length;j++){
					if(a[i]>a[j]){
						a[i]=a[i]+a[j];
						a[j]=a[i]-a[j];
						a[i]=a[i]-a[j];
					}	
				}
			}
			for(int i=0;i<a.length;i++){
				System.out.println(a[i]);
			}	
		}
		
		//33
		public static void swap2NumbersInSingleLine(){
			//x = x ^ y ^ (y = x);
			//b=a+b-(a=b);
			//https://sites.google.com/site/mukeshkmrgarg/5-different-ways-of-swapping-two-numbers
			int a= 5, b=4;
			b=a+b-(a=b);
			System.out.println(a+" "+b);
		}
		
		//34
		public static void squareOfGivenNumber(){
			int number = 9;
			System.out.println(number*number);
		}
		
		//35
		public static void squareAndCube(){
			//int number = 9;
			System.out.println("Number"+"\t"+"Square"+"\t"+"Cube");
			for(int number = 1;number<=10;number++){
				System.out.println(number+"\t"+number*number+"\t"+number*number*number);
			}
			
		}
		
		//36
		public static void numbersDivisibleBy10(){
			Scanner input = new Scanner(System.in);
			System.out.println("Enter lowerLimitNumber");
			int lowerLimitNumber = input.nextInt();
			System.out.println("Enter upperLimitNumber");
			int upperLimitNumber = input.nextInt();
			for(int number=lowerLimitNumber; number<=upperLimitNumber;number++){
				if(number%10==0)
					System.out.println(number);
			}
		}
		
		//37, 38
		public static void numberSeries(int number){
			/*for(int i=1;i<=7;i++){
				if(i==7){
					System.out.print(i+".");
				}else{
					System.out.print(i+",");
				}
			}
			System.out.print(":::");
			for(int i=0;i<=7;i++){
				if(i==7){
					System.out.print(i+".");
				}else{
					System.out.print(i+",");
				}
			}*/
			
			//1,2,3,4,5,6,7,6,5,4,3,2,1.
			for(int i=1;i<=number;i++){
				System.out.print(i+",");
			}
			int i=number-1;
			while(i>0){
				if(i==1){
					System.out.print(i+".");
					i--;
				}else{
					System.out.print(i+",");
					i--;
				}	
			}
		}
		
		//40
		public static void designTriangle(){
			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*"+" ");
				}System.out.println();
				
			}
		}
		
		//39
		public static void designTriangleNumbers1(){
			int sum=0;
			for(int i=1;i<=5;i++){
				for(int j=1;j<=i;j++){
					sum=sum+1;
					System.out.print(sum+" ");
				}System.out.println();
				
			}
		}
		
		//41
		public static void designTriangleNumbers2(){
			for(int i=5;i>=1;i--){
				for(int j=i;j>=1;j--){
					System.out.print("*"+" ");
				}System.out.println();
				
			}
		}
		
		//42
		public static void designTriangle3(){
			int n =5;
			
			for(int lines = 1;lines<=n;lines++){
				
				for(int i=1;i<=n-lines;i++){
					System.out.print(" ");
				}
					
				for(int j=1;j<=lines;j++){
					System.out.print("*"+" ");
				}
				
				System.out.println();
			}
		}
		
		//43
		public static void designTriangle4(){
			int n=5;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=i;j++){
					System.out.print("*"+" ");
				}System.out.println();
			}
			for(int i=n;i>=1;i--){
				for(int j=i-1;j>=1;j--){
					System.out.print("*"+" ");
				}System.out.println();
			}
		}
		
		//44
		public static void designTriangle5(){
			int n=5;
			for(int lines=1;lines<=n;lines++){
				for(int i=1;i<=n-lines;i++){
					System.out.print(" ");
				}
				for(int j=1;j<=lines;j++){
					System.out.print("*"+" ");
				}System.out.println();
			}
			//4, 5-4=1
			//3, 5-3=2
			for(int lines=n-1;lines>=1;lines--){
				for(int i=1;i<=n-lines;i++){
					System.out.print(" ");
				}
				for(int j=lines;j>=1;j--){
					System.out.print("*"+" ");
				}System.out.println();
			}
		}
		
		//45
		public static void palindrome(){
			int number = 12221;
			int copyNumber = number, digit, sum =0;
			while(number>0){
				digit = number%10;
				number=number/10;
				sum = sum*10+digit;
			}
			if(sum==copyNumber){
				System.out.println("Number is Palindrome");
			}else{
				System.out.println("Number is not Palindrome!");
			}
		}
		
		//47
		public static void reverseNumber(){
			int number = 122;
			int copyNumber = number, digit, sum =0;
			while(number>0){
				digit = number%10;
				number=number/10;
				sum = sum*10+digit;
			}
			System.out.println(sum);
		}
		
		//46
		public static void powerFunction(){
			int number = 3, power = 4;
			int result = 1;
			for(int i=1;i<=power;i++){
				result = result*number;
			}
			System.out.println(result);
		}
		
		//49
		public static void secondLargest(){
			int[] a= {2,6,0,5,0};
			Arrays.sort(a);
			for(int i=0;i<a.length;i++){
				if(a[i]!=a[i+1] && a[i]<a[i+1]){
					System.out.println(a[i+1]);
					break;
				}
			}
		}
		
		//50
		public static void numbersToWords(){
			int number= 869;
			Map<Integer, String> numberMap = new HashMap<Integer, String>();
			numberMap.put(0, "zero");
			numberMap.put(1, "one");
			numberMap.put(2, "two");
			numberMap.put(3, "three");
			numberMap.put(4, "four");
			numberMap.put(5, "five");
			numberMap.put(6, "six");
			numberMap.put(7, "seven");
			numberMap.put(8, "eight");
			numberMap.put(9, "nine");
			int sum=0;
			while(number>0){
				int digit = number%10;
				number=number/10;
				sum = sum*10+digit;
			}
			
			while(sum>0){
				int digit= sum%10;
				sum=sum/10;
				if(numberMap.containsKey(digit)){
					System.out.print(numberMap.get(digit)+" ");
				}
			}
			
		}
		
		//53
		public static void decimalToBinary(){
			int number= 12, i=0;
			int binary[] = new int[8];
			while(number>=0){
				binary[i] = number%2;
				number=number/2;
				i++;
				if(number==1){
					binary[i]=1;
					break;
				}
			}
			for(int j=binary.length-1;j>=0;j--){
				System.out.print(binary[j]);
			}
		}
		
		//54
		public static void binaryToDecimal(){
			int binary = 100, sum=0, i=0;
			
			while(binary>0){
				int digit=binary%10;
				binary=binary/10;
				sum=(int)(sum + digit*Math.pow(2, i));
				i++;
			}
			System.out.println(sum);
		}
		
		//55
		public static void maleFemale(){
			int number=1;
			String decision;
			decision=(number==1)?"male":"Female";
			System.out.println(decision);
		}
		
		//56
		public static void positiveNegative(){
			int number =1;
			String decision;
			decision = (number==0)?"neutal":((number>0)?"positive":"negative");
			System.out.println(decision);
		}
		
		//57
		public static void name(){
			
		}
		
		@Override
		public void area(int length, int breadth){
			
		}
		
		public static void main(String args[]){
			//IndividualDigitsSum.positiveNegative();
			swap2NumbersInSingleLine();
			
			String str1 = "abc";
			String str2 = "abc";
			String str3 = new String("abc");
			
			if(str2==str3){
				System.out.println(false);
			}
			if(str2.equals(str3)){
				System.out.println(true);
			}
			
			
			//StudentImpl object1 = new StudentImpl();
			
			//object.studentComputation();
			//object.studentGarding();
			
			
			/*int [] a = {1,2,4,1,2,4,2,4};
			//int [] a = {1,2,3,3,1,3,1};
			int m=4;
			int n = a.length;
			int[] count = new int[m+1];
			for(int i=0;i<=m;i++)
				count[i]=0;
			int maxOccurence=1;
			int index=-1;
			for(int i=0;i<n;i++){
				if(count[a[i]]>0){
					int temp= count[a[i]];
					if(temp>maxOccurence){
						maxOccurence=temp;
						index=i;
					}
					count[a[i]] = temp+1;
				}else{
					count[a[i]] = 1;
				}
			}
			System.out.println(a[index]);*/
	}
	
	
	

}

package com.javalec.base;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0; 
		int evenSum = 0;
		int oddSum = 0; // 홀
		double count = 0;
		double evenCount = 0;
		double oddCount = 0;
		double avg = 0;
		double evenAvg = 0;
		double oddAvg = 0;
		
//		
		System.out.print("덧셈 시작 수를 입력 : ");
		int startNum =  scanner.nextInt();
		System.out.print("마지막 수를 입력 : ");
		int lastNum =  scanner.nextInt();
		
		if (startNum > lastNum ) {
			10         1
			int setFirst = startNum;
			               10
			for (int i = startNum; lastNum <= i; i--) {
				sum += i ;  10       1 
				count += 1;
				
				if (i % 2 == 0) {
					evenSum += i;
					evenCount += 1;
				}
				else {
					oddSum += i;
					oddCount += 1;
				}
				

			}
			avg = sum / count;
			evenAvg = evenSum / evenCount;
			oddAvg = oddSum / oddCount;
			
			System.out.println("\n" + setFirst + " ~ " + lastNum  + "까지의 합은 " + sum + "이며 평균은 " + avg);
			System.out.println("홀수의 총합은 " +  oddSum + "이며 평균은 " + oddAvg);
			System.out.println("짝수의 총합은 " +  evenSum + "이며 평균은 " + evenAvg);
			

		}
		else {
			for (int i = startNum; i <= lastNum ; i++) {
				sum += i;
				count += 1;
				
				if (i % 2 == 0) {
					evenSum += i;
					evenCount += 1;
				}
				else {
					oddSum += i;
					oddCount += 1;
				}

			}
			avg = sum / count;
			evenAvg = evenSum / evenCount;
			oddAvg = oddSum / oddCount;
			
			System.out.println("\n" + startNum + " ~ " + lastNum + "까지의 합은 " + sum + "이며 평균은 " + avg);
			System.out.println("홀수의 총합은 " +  oddSum + "이며 평균은 " + oddAvg);
			System.out.println("짝수의 총합은 " +  evenSum + "이며 평균은 " + evenAvg);

		} 

		
		
		
	}
}
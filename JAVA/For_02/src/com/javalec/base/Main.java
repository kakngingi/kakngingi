package com.javalec.base;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0; // 총 합계
		int evenSum = 0; // 짝수 합계
		int oddSum = 0; //  홀수 합
		double count = 0; // 총 카운트 
		double evenCount = 0; // 짝수 카운트 
		double oddCount = 0; // 홀수 카운트 
		double avg = 0; // 총 평균 
		double evenAvg = 0; // 짝수 평균 
		double oddAvg = 0;// 홀수 평균 
		
//		
		System.out.print("덧셈 시작 수를 입력 : ");
		int startNum =  scanner.nextInt(); // 시작 숫자 입력 
		System.out.print("마지막 수를 입력 : ");
		int lastNum =  scanner.nextInt(); // 종료 숫자 입력 
		
		if (startNum > lastNum ) { // 시작 숫자가 끝 숫자보다 클떄 
	
			int setFirst = startNum;
			               
			for (int i = startNum; lastNum <= i; i--) {
				sum += i ;        
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
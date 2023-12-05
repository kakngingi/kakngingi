package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int startNum = 0;	// 작은 숫자
		int endNum = 0;	// 큰 숫자 
		int sum = 0;	// 작은 숫자에서 큰 숫자까지의 합계
		
		System.out.print("범위의 숫자중 작은 숫자 : ");
		startNum = scanner.nextInt();
		System.out.print("범위의 숫자중 큰 숫자 : ");
		endNum = scanner.nextInt();
		
		for(int i = startNum; i <= endNum; i++) {	//	작은 숫자에서 큰 숫자까지의 반복문 범위지정
			sum += i;	// 작은 숫자에서 큰 숫자까지 누적
			
		}
		System.out.println(startNum + " ~ " + endNum + "까지의 합계는 : " + sum );
		
		if(sum % 2 == 0) {	// 짝수일경우 결과값 
			System.out.println("짝수입니다.");
		}else {	// 홀수일경우 결과값
			System.out.println("홀수입니다.");
			
		}

	}

}

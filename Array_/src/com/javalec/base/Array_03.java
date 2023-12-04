package com.javalec.base;

import java.util.Scanner;

public class Array_03 {

	public static void main(String[] args) {
		// 사용자가 입력하는 숫자 5개를 받아서 합계
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[5];
//		int num1
//		int num2
		int total = 0;
		double cnt = 0;
		int maxNum	= 0;
		int minNum = 0;
		
		
		for(int i=0; i<num.length; i++) {
			System.err.print(i+1+"번 숫자를 입력하세요 : ");
			num[i] = scanner.nextInt();
		}
		
		for(int i =0; i<num.length;i++){
			total += num[i];
			cnt++;
		}
		
		for(int i =0; i<num.length;i++) {
			if(num[i] > maxNum) {
				maxNum = num[i];
			}
		}
		for(int i =0; i<num.length;i++) {
			if(num[i] < minNum) {
				minNum = num[i];
		
			}
		}
		
		System.out.println("Total :" + total);
		System.out.println("Average :" + total/cnt);
		System.out.println("Max num :" + maxNum);
		System.out.println("Min num :" + minNum);
		
		
//		System.out.print("1번 숫자를 입력하세요 : ");
//		num1 = scanner.nextInt();
//		System.out.print("2번 숫자를 입력하세요 : ");
//		num2 = scanner.nextInt();
//		
	}

}

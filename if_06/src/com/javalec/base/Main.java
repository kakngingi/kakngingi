package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		
		System.out.println("국어 점수를 입력하세요!");
			num1 = scanner.nextDouble();
		
		System.out.println("영어 점수를 입력하세요!");
			num2 = scanner.nextDouble();
	
		System.out.println("수학 점수를 입력하세요!");
			num3 = scanner.nextDouble();
		
		System.out.println("평균점수 : " + (num1 + num2 + num3)/3 );
		
		if (num1 == ((num1 + num2 + num3)/3)){
		System.out.println("국어 점수는 평균 점수 입니다.");}
		else if (num1 > ((num1 + num2 + num3)/3)) { 
		System.out.println("국어 점수는 평균보다 높습니다.");}
		else {
		System.out.println("국어 점수는 평균보다 낮습니다.");
			}
		
		if (num2 == ((num1 + num2 + num3)/3)){
		System.out.println("영어 점수는 평균 점수 입니다.");}
		else if (num2 > ((num1 + num2 + num3)/3)) { 
		System.out.println("영어 점수는 평균보다 높습니다.");}
		else {
		System.out.println("영어 점수는 평균보다 낮습니다.");
			}
			
		if (num3 == ((num1 + num2 + num3)/3)){
		System.out.println("수학 점수는 평균 점수 입니다.");}
		else if (num3 > ((num1 + num2 + num3)/3)) { 
		System.out.println("수학 점수는 평균보다 높습니다.");}
		else {
		System.out.println("수학 점수는 평균보다 낮습니다.");
			}
		
		
	}
}



package com.javalec.base;

import java.util.Scanner;

public class Bmi_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Weight = 0;
		double Height = 0;
		String result = "";
		
		System.out.println("** BMI 계산기 **");
		System.out.print("몸무게를 입력하세요 : ");
		Weight = scanner.nextDouble();
		System.out.print("키를 입력하세요 : ");
		Height = scanner.nextDouble();
		
		Height = Height/100;
		double BMI = Weight / (Height*Height);
		System.out.println("귀하의 BMI는 " + BMI + "입니다.");
		
		if(BMI >= 30) {
			result = "(결과) 귀하는 고도비만입니다";}
			else if(BMI >= 25) {
				result = "(결과) 귀하는 비만입니다.";}
			else if(BMI >= 23) {
				result = "(결과) 귀하는 과체중입니다.";}
			else if(BMI >= 18.5) {
				result = "(결과) 귀하는 정상체중입니다.";}
			else if(BMI >= 0) {
				result = "결과) 귀하는 저체중입니다.";
				
		
			}
		System.out.println(result);
		}
		
	
		
		
		
	}

//		System.out.println("BMI");
//		System.out.print("height : ");
//		double height_02 = scanner.nextDouble();
//		System.out.print("weight : ");
//		double weight_02 = scanner.nextDouble();
//	
//		height_02 = height_02 / 100 ;
//		
//		double BMI = weight_02 / (height_02 * height_02);
//		
//		System.out.println(BMI);
		
		




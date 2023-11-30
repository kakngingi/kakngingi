package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		/*
		 * // 구구단 2단 출력 int dan = 5; for(int i=1; i<=9; i++) { System.out.println(dan +
		 * " X " + i + " = " + (dan*i)); }
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * for(int dan = 2; dan <=9; dan++) { System.out.println(" -----" + dan +
		 * "단 -----"); for(int i=1; i<=9; i++) { System.out.println(dan + " X " + i +
		 * " = " + (dan*i)); } }
		 */
		/*
		 * // 스캐너 생성 Scanner scanner = new Scanner(System.in);
		 * 
		 * 
		 * // 컴퓨터는 옆으로 출력을 먼저 수행하기 때문에 i 가 먼저 선행되고 그다음에 dan 수행 for(int i=1; i<=9; i++) {
		 * 
		 * for(int dan = 2; dan <=9; dan++) { System.out.print(dan + " X " + i + " = " +
		 * (dan*i)+ "\t"); } System.out.println(""); }
		 */
		/*
		 * for(int i=1; i<=9; i++) { System.out.println(); if(i % 2 == 0) for(int dan =
		 * 2; dan <=9; dan++) { System.out.print(dan + " X " + i + " = " + (dan*i)+
		 * "\t");
		 */
		/*
		 * for(int i=1; i<=9; i++) { for(int dan = 2; dan <=9; dan++) { if(dan*i % 2 ==
		 * 0 ) System.out.print(dan + " X " + i + " = " + (dan*i) + "\t"); else if(dan*i
		 * % 2 == 1) { System.out.print("\t\t"); }
		 * 
		 * } System.out.println(); }
		 */
		for (int dan = 2, i = 1; dan <= 9 && i <= 9; dan++) {
			System.out.print(dan + " X " + i + " = " + dan * i + "\t");

			if (dan == 9) {
				dan = 1;
				i++;
				System.out.println();
			}
		}
//		
//		for ( a = 1; a <= 9 a++)
//		
//		
//		for (int count = 1, danFirst = 1, danLast = 1; count <= 72; count ++) {
//			dan++;
//			System.out.print(dan + " X " + danLast + " = " + (dan * danLast) + "\t");
//			
//			if (dan == 9) {
//				dan = 2;
//				danLast++;
//				System.out.println();
//			}
//			
//		}
//			

//			int a = 2;
//			for(int i = 1; i <= 9; i++) {
//			System.out.print(a + " X " + i + " = " + (a*i) + "\t"); 
//			System.out.print(a+1 + " X " + i + " = " + ((a+1)*i) + "\t"); 
//			System.out.print(a+2 + " X " + i + " = " + ((a+2)*i) + "\t"); 
//			System.out.print(a+3 + " X " + i + " = " + ((a+3)*i) + "\t"); 
//			System.out.print(a+4 + " X " + i + " = " + ((a+4)*i) + "\t"); 
//			System.out.print(a+5 + " X " + i + " = " + ((a+5)*i) + "\t"); 
//			System.out.print(a+6 + " X " + i + " = " + ((a+6)*i) + "\t"); 
//			System.out.println(a+7 + " X " + i + " = " + ((a+7)*i) + "\t"); 

//  1.
//	for(int i = 1; i <= 9; i++) {
//	System.out.println();
//	for(int dan = 2; dan <= 9; dan++) {
//		if(i % 2 == 0)
//			System.out.print(dan + " X " + i +  " = " + (dan*i) + "\t");
//			else  
//				System.out.print(dan + " X *" + " = " + (dan*i) + "\t");

// 2.		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println();
//			for(int dan = 2; dan <= 9; dan++) {
//				System.out.print(i % 2 == 1 ? dan + " X *" + " = " + (dan*i) + "\t" : dan + " X " + i + " = " + (dan*i) + "\t" );
	}
}

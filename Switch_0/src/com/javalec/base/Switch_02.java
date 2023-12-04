package com.javalec.base;

import java.util.Scanner;

public class Switch_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String gradeResult = "";
		
		
		System.out.print("성적을 입력하세요 : ");
		score = scanner.nextInt();
		if (score > 100 || score < 0) System.out.println("다시 입력하세요");
		else {
			switch (score / 10) {
			case 10:
			case 9:
				gradeResult = "A 학점 입니다.";
				break;
			case 8:
				gradeResult = "B 학점 입니다.";
				break;
			case 7:
				gradeResult = "C 학점 입니다.";
				break;
			case 6: 
				gradeResult = "D 학점 입니다.";
				break;
			case 5: 
				gradeResult = "E 학점 입니다.";
				break;
			default :
				gradeResult = "F 학점 입니다.";	
				break;
			}
			System.out.println("귀하는 " + gradeResult);
						
		}
		
			
		
	}
}

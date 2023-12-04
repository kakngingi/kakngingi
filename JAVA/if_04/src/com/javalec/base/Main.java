package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String gradeResult = "";
		
		
		System.out.println("**학점관리**");
		System.out.print("성적을 입력하세요 : ");
		score = scanner.nextInt() / 10;
		
		
		if(score > 10 || score < 0) { // 점수가 이상있을 경우 
			System.out.println("점수를 다시 입력하세요.");
		}else { // 점수가 정상적일 경우
			if(score == 9) gradeResult = "A";
			else if(score == 8) gradeResult = "B";
			else if(score == 7) gradeResult = "C";
			else if(score == 6) gradeResult = "D";
			else gradeResult = "F";
		}
		
		
		System.out.println("귀하는 " + gradeResult + "점 입니다.");
			
	}
	}


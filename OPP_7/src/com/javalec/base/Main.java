package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int dan; // 단 변수
	int startNum;	//	시작숫자 변수
	int endNum;	//	끝 숫자 변수
	
	
	System.out.println("구구단 몇단부터 출력할까요?(단, 시작수, 끝수)");
	dan = scanner.nextInt();
	startNum = scanner.nextInt();
	endNum = scanner.nextInt();
	
	
	Calc calc = new Calc(dan, startNum, endNum);	// function 패키지 클라스에 있는 계산 입력값을 불러옴
	calc.gugu();
	}

}

/* 입력한 단숫자부터 9단까지 출력
	
	Scanner scanner = new Scanner(System.in);
	
	int dan;
	
	System.out.println("구구단 몇단부터 출력할까요?(단)");
	dan = scanner.nextInt();
	
	Calc calc = new Calc(dan);
	calc.gugu();
	}

}
*/
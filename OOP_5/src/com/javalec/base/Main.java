package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;

public class Main {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	Calc calc = new Calc();
	
	System.out.print("첫번째 숫자를 입력하세요 : ");
	calc.num1 = scanner.nextInt();
	
	System.out.print("두번째 숫자를 입력하세요 : ");
	calc.num2 = scanner.nextInt();
	
	calc.addAction();
	calc.subAction();
	calc.mulAction();
	calc.divAction();
		
	}

}

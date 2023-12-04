package com.javalec.base;

public class Varialbe_01 {

	public static void main(String[] args) {
		// Data 출력
		System.out.println("abcd");
		System.out.println("1234");
		System.out.println("1234+1");
		System.out.println(1234+1);
		
		
		System.out.println("대한민국");
		
		// 변수(Variable)
		// -정수
		int num1 = 10;
		System.out.println(num1);
		num1 = 100;
		System.out.println(num1);
		
		System.out.println("1234+1=" + (1234 + 1));
		
		//* int 정수 double 실수 표시방법 int 보다 double이 메모리값이 크다 
		
		int firstNumber = 10; // 첫번째숫자 
		int secondNumber = 20; // 두번째숫자 
		
		//* ""안에 없으면 수식에따라 데이터 출력값 변동가능, ""가 있으면 문자 문자그대로 출력
		
		// 덧셈  
		System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber+secondNumber));
		// 뺼셈
		System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber-secondNumber));
		// 곱셈
		System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber*secondNumber));
		// 나눗셈
		System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber/secondNumber));
		// 나눗셈 (나눗셈만 실수로 보이게 할떄 코딩 결과값에 더블을 넣어준다)
		System.out.println(firstNumber + "/" + secondNumber + "=" + ((double)firstNumber/secondNumber));
		
		//* 실수가 정수보다 우선순위이라 하나만 실수로 수정해도 실수값으로 표출
		
		System.out.println(10.0/20);
		
		// 변수 작명
		/*
		 - 변수는 의미 전달이 되어야 한다
		 1) camel : 2단어의 연결중 첫번째 단어는 소문자로 시작하고 두번째 단어는 대문자로 시작한다
		    ex) appleFruit, firstNumber
		    사용: 변수이름, Method 이름
		 2) pascal : 2단어의 연결중 첫번째 단어는 대문자로 시작하고 두번째 단어는 대문자로 시작한다
		 	ex) AppleFruit, FirstNumber
		 	사용 : Class 이름
		 3) snake : 2단어의 연결을 under bar로 한다.
		 	ex) apple_fruit, first_number
		 	사용 : 변수이름, Method 이름 
		 */
		
		// 상수(Constant) 바뀌지않음 final이란 키워드를 붙여주면 된다
		final int constNumber = 10;
		final double pi = (3.141592);
//		constNumber = 100;
		System.out.println(constNumber);
		System.out.println(pi);
		
		
	}

}
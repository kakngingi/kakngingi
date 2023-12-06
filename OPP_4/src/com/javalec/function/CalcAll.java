package com.javalec.function;

public class CalcAll {

	//	Field
	
	//	Constructor
	public CalcAll() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	public void calc(int first, int second) { // 출력을해서 넘겨줄때는 보이드를 사용
		System.out.println("덧셈 : " + (first + second));
		System.out.println("뺄셈 : " + (first - second));
		System.out.println("곱셈 : " + (first * second));
		System.out.println("나눗셈 : " + ((double)first / second));
	}
	
}

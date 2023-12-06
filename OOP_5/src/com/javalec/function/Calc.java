package com.javalec.function;

public class Calc {
	//	Property, Field
	public int num1 = 0;
	public int num2 = 0;
	
	// Constructor
	public Calc() {
		// TODO Auto-generated constructor stub
	}
	
	//	Method	
	
	public void addAction() {
		System.out.println("덧셈 : " + (num1+num2));
	}
	public void subAction() {
		System.out.println("뺄셈 : " + (num1-num2));
	}
	public void mulAction() {
		System.out.println("곱셈 : " + (num1*num2));
	}
	public void divAction() {
		System.out.println("나누기 : " + ((double)num1 / num2));
	}
	
}






































//	public int num1;
//	public int num2;
//	
//	//	Constructor
//	public Calc() {
//	}
//
//	//	Method
//	public void addAction() {
//		System.out.println("덧셈 : " + (num1+num2));	
//	}
//	public void subAction() {
//		System.out.println("뺄셈 : " + (num1-num2));	
//	}
//	public void mulAction() {
//		System.out.println("곱셈 : " + (num1*num2));	
//	}
//	public void divAction() {
//		System.out.println("나눗셈 : " + ((double)num1/num2));	
//	}
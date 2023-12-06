package com.java.function;

public class Calc {
	//	Field
	public int num1 = 0;
	public int num2 = 0;
	
	//	Constructor
	public Calc() {						// 원래 적어야하는데 이클립스에서는 자동으로 만들어줌 다른툴에서 안만들어줌 저는 습관 만들기
										// 생성자 이름이 똑같아도 오류가 안나는이유 overloading	
	}

	public Calc(int num1, int num2) {	// 메인에서 받은 변수를 this가 필드에 변수로 넘겨준다
		this.num1 = num1;				// 생성자는 반복문 조건문 못쓴다 오로지 생성만.
		this.num2 = num2;
	
		addAction();
		subAction();
		mulAction();
		divAction();
	}
	
	public void calcAll() {
		String arr[] = {new addAction(), new subAction(), new mulAction(), new divAction()};
		
		for(int i =0; i<arr.length; i++) {
			String a = arr[i];
			return a;
		}
	}

	//	Method
	public String addAction() {
		System.out.println("덧셈 : " + (num1+num2));
		return "";
	}
	public String subAction() {
		System.out.println("뺄셈 : " + (num1-num2));
		return "";
	}
	public String mulAction() {
		System.out.println("곱셈 : " + (num1*num2));
		return "";
	}
	public String divAction() {
		System.out.println("나눗셈 : " + ((double)num1/num2));
		return "";
		
	}
}

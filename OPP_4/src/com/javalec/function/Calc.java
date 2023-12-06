package com.javalec.function;

public class Calc {

	//	Field
	
	//	Constructor
	public Calc() {
	}
	
	//	Method
	// 	>>덧셈	(스트링으로 해보기)
	public int addAction(int first, int second) {	//	파라미터 지정
		return (first + second);	// 합계값
	}
	// 	>>뺄셈	(스트링으로 해보기)
	public int subAction(int first, int second) {	//	파라미터 지정
		return (first - second);	// 합계값
	}
	// 	>>곱셈	(스트링으로 해보기)
	public int mulAction(int first, int second) {	//	파라미터 지정
		return (first * second);	// 합계값
	}
	// 	>>나눗셈	(스트링으로 해보기)
	public double divAction(int first, int second) {	//	파라미터 지정
		return ((double)first / second);	// 합계값
	}
}

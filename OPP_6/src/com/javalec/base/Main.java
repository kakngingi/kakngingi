package com.javalec.base;

import com.java.function.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc(10, 20);
		System.out.println("---------");
		calc.num1 = 10;
		calc.num2 = 29;
		calc.calcAll();
		

	}

}

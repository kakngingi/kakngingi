package com.javalec.base;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// 파라미터가 없으면 필드에서 값 산출
		// 파라미터가 있을경우에는 생성자에서 값 산출
		
		Car car1 = new Car();
		System.out.println("car1.company = " + car1.company);
		// 현대자동차
		
		
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company = " + car2.company);
		// 현대자동차
		System.out.println("car2.model = " + car2.model);
		// 자가용
		
		
		
		
		
		
		
	}

}

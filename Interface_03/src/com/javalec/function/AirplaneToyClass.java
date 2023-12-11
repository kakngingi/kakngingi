package com.javalec.function;

public class AirplaneToyClass implements Missle, Light {

	public AirplaneToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기 입니다.");
		canLight();
		canMissle();
		System.out.println("===============");
	}
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛발사를 할 수 있습니다");
	}

	@Override
	public void canMissle() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사 할 수 있습니다.");
	}

}

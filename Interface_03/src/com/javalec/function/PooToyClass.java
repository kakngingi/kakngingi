package com.javalec.function;

public class PooToyClass implements MoveArmLeg {
	
	
	public PooToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("곰돌이 입니다.");
		canMoveArmLeg();
		System.out.println("=============");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔, 다리를 움직일 수 있습니다.");
	}
	

}

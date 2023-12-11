package com.javalec.function;

public class XMan implements PoliceMan, FireFighter, Cooker{

	@Override
	public void makePizza() {
		// TODO Auto-generated method stub
		System.err.println("피자 요리");
	}

	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.err.println("스파게티 요리");
		
	}

	@Override
	public void catchFire() {
		// TODO Auto-generated method stub
		System.err.println("화재 진압");
		
	}

	@Override
	public void saveMen() {
		// TODO Auto-generated method stub
		System.err.println("생명 보호");
	}
	


	@Override
	public void catchThief() {
		// TODO Auto-generated method stub
		System.err.println("범인 검거");
		
	}

	@Override
	public void findThing() {
		// TODO Auto-generated method stub
		System.err.println("분실물건 보관");
		
	
	}
}

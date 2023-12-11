package com.javalec.function;

public class Shop1 extends HQ {
	// Field
	
	// Constructor
	public Shop1() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	@Override
	public void makeKimchi() {
		System.out.println("김치찌개 : 4,500원");
	}
	@Override
	public void makeBudea() {
		System.out.println("부대찌개 : 5,000원");
	}
	@Override
	public void makeSundea() {
		System.out.println("순대국 : 판매하지 않습니다.");
	}
	

}

package com.javalec.function;

public class SecondSun {

	
	public SecondSun() {
		// TODO Auto-generated constructor stub
	}

	public void takeChoco() {
		Mamabag.choco = Mamabag.choco -1;
	
		if(Mamabag.choco < 0) {
			System.out.println("둘째는 초고파이 먹고 싶어요");
		}else {
			System.out.println("둘쨰는 맛있게 먹었어요");
		}
				
			
	}
}



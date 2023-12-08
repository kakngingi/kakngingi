package com.javalec.function;

public class FirstSun {

	
	public FirstSun() {
		// TODO Auto-generated constructor stub
	}

	public void takeChoco() {
		
		Mamabag.choco = Mamabag.choco -1; // 마마백 클라스에서 스택틱으로 공유해줬기때문에 new로 적어줄필요없다
		
		
		if(Mamabag.choco < 0) {
			System.out.println("첫째는 초고파이 먹고 싶어요");
		}else {
			System.out.println("첫째는 맛있게 먹었어요");
		}
				
			
	}
}

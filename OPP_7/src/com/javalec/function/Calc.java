package com.javalec.function;

public class Calc {

	int dan;
	int startNum;
	int endNum;

	public Calc() {}
	
	public Calc(int dan, int startNum, int endNum) { 
		super();
		this.dan = dan;
		this.startNum = startNum;
		this.endNum = endNum;
	}

	public void gugu() {
		for (int i = startNum; i <= endNum; i++) {

			System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");

		}
	}
}

/*
 * 	입력한 단 숫자부터 9단까지 출력 public Calc(int dan) {
 * 
 * 	this.dan = dan; } 
 * 
 * 	public void gugu() { 
 * 	for(int i = 1; i <= 9; i++) { 
 * 	for(int j = dan; j <= 9; j++) { 
 * 		System.out.print(j + " X " + i + " = " + (j*i) + "\t"); if(j == 9) {
 * 
 * 	}
 * 
 * 
 * 	} System.out.println(); } }
 */
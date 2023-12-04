package com.javalec.base;

import java.util.Random;

public class Random_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		// int i = random.nextInt(10);
//		for(int loop=1; loop<=10; loop++) {
//			int i =random.nextInt(10);
//			System.out.println(i);
//		}

		// Lotto 번호 생성기
		int[] useNum = new int[6];
		int i = 0;
		for (int loop = 1; loop < 7; loop++) {
			for (int j = 1; j <= 6; j++) {
				 j = random.nextInt(45) + 1;

				useNum[i] = j;
		//	for (i = 0; )	
				
			

			System.out.print(j + "\t");
			break;
//
			}
		}

	}

}
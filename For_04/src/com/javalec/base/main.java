package com.javalec.base;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
/*		// 구구단 2단 출력
		int dan = 5;
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}

	}

}
*/
/*		Scanner scanner = new Scanner(System.in);
		
		
		
		for(int dan = 2; dan <=9; dan++) {
			System.out.println(" -----" + dan + "단 -----");
			for(int i=1; i<=9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		 }		
	  }
*/	
/*		// 스캐너 생성	
		Scanner scanner = new Scanner(System.in);
		
		
		// 컴퓨터는 옆으로 출력을 먼저 수행하기 때문에 i 가 먼저 선행되고 그다음에 dan 수행
		for(int i=1; i<=9; i++) {
			
			for(int dan = 2; dan <=9; dan++) {
			System.out.print(dan + " X " + i + " = " + (dan*i)+ "\t");
			}
			System.out.println("");	
		}
		*/
/*		for(int i=1; i<=9; i++) {
			System.out.println();
			if(i % 2 == 0)
				for(int dan = 2; dan <=9; dan++) {
					System.out.print(dan + " X " + i + " = " + (dan*i)+ "\t");
*/		
		for(int i=1; i<=9; i++) {
				for(int dan = 2; dan <=9; dan++) {
					if(dan*i % 2 == 0 )
						System.out.print(dan + " X " + i + " = " + (dan*i) + "\t");
						else if(dan*i % 2 == 1) {
							System.out.print("\t\t");
					}
					
			}
				System.out.println();
		}
	}		
}	

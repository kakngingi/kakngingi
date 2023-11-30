package com.javalec.base;

import java.util.Scanner;

public class Mainarray {

	public static void main(String[] args) {
		// 신장이 가장 크거나 작은 학생의 이름과 신장을 출력하기
		Scanner scanner = new Scanner(System.in);	//	스캐너 생성
		String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"}; //	사람들의 이름값 배열
		double[] tall = new double[5];	//	신장 입력값을 받기위해 만든 배열
	/*	
		James의 신장을 입력하세요 : 
		Cathy의 신장을 입력하세요 : 
		Kenny의 신장을 입력하세요 : 
		Martin의 신장을 입력하세요 : 
		Crystal의 신장을 입력하세요 : 
		
		평균 신장은 :
		가장 큰 학생은  이고 그 학생의 키는
		가장 작은 학생은 이고 그 학생의 키는
//	*/
		double avg = 0;	//	키 평균
		double total = 0;	//	키 합계
		double maxTall = Integer.MIN_VALUE;	// 최대값 변수 맥스값=민값 비교 
		double minTall = Integer.MAX_VALUE;	// 최소값 변수	민값=맥스값 비
		int maxNum = 0; // 최대값 순번 
		int minNum = 0;	// 최소값 순번
		String maxTallName = "";	//	키가 가장큰사람 이름
		String minTallName = "";	// 키가 가장작은사람 이름
		
		
		
	for(int i=0; i<name.length;i++) {

		System.out.print(name[i]+"의 신장을 입력하세요 : ");	
		tall[i] = scanner.nextInt();
		
		total += tall[i];	// 다섯사람의 키를 총 더한값
		
		if (tall[i] > maxTall) {
			maxTall = tall[i];	//	담겨진 키의 값을 찾아주는것
		//	maxNum = i+1; //	몇번째인지 번째수를 찾아주는것
			maxTallName = name[i]; // 배열에 담겨진 사람 이름을 찾아주는것
			}
		if (tall[i] < minTall) {
			minTall = tall[i];
		//	minNum = i+1;
			minTallName = name[i];
		
		
		}
		
	
	}
	
	
		avg = total/name.length;	//	평균값 계산
		
		
		System.out.println("평균 신장은 : " + avg);
		System.out.println("가장 큰 학생은 " + maxTallName + " 그 학생의 키는 " + maxTall );
		System.out.println("가장 작은 학생은 " + minTallName + " 그 학생의 키는 " + minTall );
	
	
	}
}

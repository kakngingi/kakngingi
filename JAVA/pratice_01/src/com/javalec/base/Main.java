					package com.javalec.base;

					import java.util.*;

					public class Main {

						public static void main(String[] args) {
							// 반복문 사용

							Scanner sc = new Scanner(System.in);

							// 입력 받을 숫자들의 변수 생성 및 초기화
							int startNum = 0; // 시작수 변수
							int endNum = 0; // 종료수 변수
							int sum = 0; // 총 합계
							int oddSum = 0;// 홀수 합계
							int evenSum = 0;// 짝수 합계
							double avg = 0.0;// 총 평균
							double oddAvg = 0.0;// 홀수 평균
							double evenAvg = 0.0;// 짝수 평균
							double cnt = 0;// 총 카운트
							double oddCnt = 0.0;// 홀수 카운트
							double evenCnt = 0.0;// 짝수 카운트

							// 입력 받기
							System.out.print("덧셈 시작 수를 입력하세요 : ");
							startNum = sc.nextInt();
							System.out.print("덧셈끝 수를 입력하세요 : ");
							endNum = sc.nextInt();

							// 시작 수와 끝 수 비교
							if (startNum < endNum) { // 시작 숫자가 끝수보다 작을 떄

								// 시작 수 부터 끝 수까지 반복문
								for (int i = startNum; i <= endNum; i++) {

									// 총합 구하기
									sum += i; // 55
									cnt++; // 10

									if (i % 2 == 0) { // 짝수의 합 구하기
										evenSum += i; //30
										evenCnt++; //5
									}

									else if (i % 2 == 1) { // 홀수의 합 구하기
										oddSum += i; //25
										oddCnt++; //5
									}
								}
							}

							else if (startNum > endNum) {// 시작 수가 끝수보다 클 때

								for (int i = startNum; i >= endNum; i--) {// 큰거부터 작은걸로 감소

									sum += i;
									cnt++;

									if (i % 2 == 0) { // 짝수의 합 구하기
										evenSum += i;
										evenCnt++;
									}

									else if (i % 2 == 1) { // 홀수의 합 구하기
										oddSum += i;
										oddCnt++;
									}
								}
							}

							else {
								System.out.println("두 수의 값이 같습니다.");
							}

							// 평균 계산
							avg = sum / cnt;
							oddAvg = oddSum / oddCnt;
							evenAvg = evenSum / evenCnt;

							// 출력
							System.out.println("1) 숫자의 총 합은 " + sum + "이며 평균은 " + avg + "입니다.");
							System.out.println("2) 홀수의 총 합은 " + oddSum + "이며 평균은 " + oddAvg + "입니다.");
							System.out.println("3) 짝수의 총 합은 " + evenSum + "이며 평균은 " + evenAvg + "입니다.");

						}

		
		
		
	}


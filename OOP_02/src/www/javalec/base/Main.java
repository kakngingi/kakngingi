package www.javalec.base;

import java.util.Scanner;

import www.javalec.fucntion.EvenOdd;
import www.javalec.fucntion.SumClac;

public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			SumClac sumClac = new SumClac();
			EvenOdd evenOdd = new EvenOdd();
			
			System.out.print("첫번째 정수를 입력하세요 : ");
			int firstNum = scanner.nextInt();
			System.out.print("두번째 정수를 입력하세요 : ");
			int secondNum = scanner.nextInt();
			int sum = sumClac.sumClac(firstNum,secondNum);
			System.out.println(firstNum+" ~ "+secondNum +"까지의 합은 " + sum +"입니다.");
			String result = evenOdd.evenOdd(sum);
			System.out.println(result);
		}

	}

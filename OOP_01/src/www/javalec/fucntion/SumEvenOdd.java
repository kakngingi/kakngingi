package www.javalec.fucntion;

public class SumEvenOdd {

	// Field

		// Constructor
		public SumEvenOdd() {
			// TODO Auto-generated constructor stub
		}

		// Method
		// 1. 합계 구한다.
		public int sumCalc(int num1, int num2) { // 이름은 달라도 상관없다 순서가 중요하다	Method의 변수는 파라미터라고 부른다
			int sum = 0;
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
//			System.out.println("sumCalc >>");
			return sum;
		}

		// 2. 합계의 짝수인지 홀수인지 판단하자.
		public String evenOdd(int sum) {
			String result = "";
			if (sum % 2 == 0) {
				result = "짝수 입니다.";
			} else {
				result = "홀수 입니다.";
			}
			return result;
		}

	}

package www.javalec.fucntion;

public class EvenOdd {
	public String evenOdd(int sum) {
		String result = "";
		if(sum % 2 == 0) {
			result = "짝수입니다.";
		}else {
			result = "홀수입니다.";
		}
		return result;
	}
}
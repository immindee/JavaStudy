package ch03;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = num1++ < 0 && num2++ > 0;
		// num2 는 애초에 실행되지 않음 &&에서 앞 num1이 조건충족X이므로
		// 이는 앞의 식이 거짓이기 때문에 위의 num2++은 실행하지 않음
		System.out.println("result :" + result); // 1
		System.out.println("num1 :" + num1 + ",num2 :" + num2); //0
	}
}

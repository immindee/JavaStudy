package ch03;

import java.util.Scanner;

public class Operation3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// nextInt 메소드는 입력을 한 값을 기준에 비교해 판단해주는 함수
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = s.nextInt();
		// 따라서 이렇게 아무 숫자나 입력해보라는 주의문구를 넣어준것!
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = s.nextInt();
		
		
		// 결과값의 덧셈이 아닌 문자열의 합을 위해 ""을 넣은것!
		System.out.println(num1 + "" + num2);
		
		boolean result = (num1 * num2) % 3 == 0;
		System.out.println(result);
		s.close();
	}

}

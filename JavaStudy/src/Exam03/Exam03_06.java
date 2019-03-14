package Exam03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		// 입력해야 답이 나오는 메소드기 때문에 import로 라이브러리를 불러와야함!
		Scanner s = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)>>");
		int n = s.nextInt();

		int ten = 0; // 10의 자리 수를 저장할 변수
		ten = n / 10;
		int one = 0; // 1의 자리 수를 저장할 변수
		one = n % 10;

		boolean isMatch = false; // 두 자리 수 비교 값을 저장할 변수
		isMatch = ten == one;

		System.out.println(isMatch);
	}
}

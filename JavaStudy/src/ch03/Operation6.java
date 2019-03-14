package ch03;

import java.util.Scanner;

public class Operation6 {
	public static void main(String[] args) {
		// 한 글자(영어) 입력
		// 입력을 받기위해선 Scanner를 해야함!
		Scanner s = new Scanner(System.in);
		// 숫자가 아닌 문자기 때문에 nextInt 대신 String을 써야함!
		System.out.println("영문자를 입력해주세요.");
		String txt = s.next();
		System.out.println(txt);
		
		// 문장의 첫번째 글짜를 Char로 꺼내오기!
		char txt2 = txt.charAt(0);
		
		// 입력된 글자가 영어가 맞는지 검사
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z'
				|| txt2 >= 'A' && txt2 <= 'Z' ;
		
		// 출력
		System.out.println(isCorrect);
		
	}

}

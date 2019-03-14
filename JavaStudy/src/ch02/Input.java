package ch02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		// 라이브러리는 항상 '외부'에서 가져와야 하는데?
		// 그런 메소드를 가져오는 것을 import라고 함!
		// Scanner가 빨간줄(틀린표시)가 나오면 Scanner에 마우스가져다대
		// 그러면 import가 뜨고 클릭하면 위에 import로 끌어옴
		int age = 100;
		Scanner s = new Scanner(System.in);
		// 위의 Scanner는 기본자료형 8가지가 아니므로, 참조자료형
		// int age = 100; 과 같이 참조자료형은 초기화 필요X
		int num = s.nextInt();
		System.out.println(num);
		// 출력창에 X버튼 왼쪽 빨간버튼이 출력창에 숫자 출력후 비활성화됨
		s.close();
	}
}
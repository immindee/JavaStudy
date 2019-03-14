package ch03;

import java.util.Scanner;

public class Operation2 {
	// 한줄 삭제 : Ctrl + D 이며 한줄 복사는 Ctrl + Alt + V임
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // 키보드로 숫자 입력 받음!
		boolean 배수 = num % 3 == 0;
		System.out.println(배수);
		// Scanner s 쪽 왼쪽에 전구표시가 떴었는데 그걸 종료해주는내용!
		s.close();
	}
}
package ch03;

import java.util.Scanner;

public class Operation2 {
	// ���� ���� : Ctrl + D �̸� ���� ����� Ctrl + Alt + V��
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt(); // Ű����� ���� �Է� ����!
		boolean ��� = num % 3 == 0;
		System.out.println(���);
		// Scanner s �� ���ʿ� ����ǥ�ð� �����µ� �װ� �������ִ³���!
		s.close();
	}
}
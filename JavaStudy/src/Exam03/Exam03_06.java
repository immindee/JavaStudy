package Exam03;

import java.util.Scanner;

public class Exam03_06 {
	public static void main(String[] args) {
		// �Է��ؾ� ���� ������ �޼ҵ�� ������ import�� ���̺귯���� �ҷ��;���!
		Scanner s = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		int n = s.nextInt();

		int ten = 0; // 10�� �ڸ� ���� ������ ����
		ten = n / 10;
		int one = 0; // 1�� �ڸ� ���� ������ ����
		one = n % 10;

		boolean isMatch = false; // �� �ڸ� �� �� ���� ������ ����
		isMatch = ten == one;

		System.out.println(isMatch);
	}
}

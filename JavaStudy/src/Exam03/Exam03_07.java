package Exam03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// ���� ����� �ݺ��ɶ��� ctrl + alt + ��(ȭ��ǥ �Ʒ���ư)
		int n1 = num % 10; // 5�� ���ð�
		num = num / 10;
		int n2 = num % 10; // 4�� ���ð�
		num = num / 10;
		int n3 = num % 10; // 3�� ���ð�
		num = num / 10;
		int n4 = num % 10; // 2�� ���ð�
		num = num / 10;
		int n5 = num % 10; // 1�� ���ð�
		System.out.println(n1 + n2 + n3 + n4 + n5);
	}
}
package Exam03;

public class Exam03_04 {
	public static void main(String[] args) {
		int num = 456;
		// Int �� ���� ���� ���� �������� �� ������ ���̹Ƿ�, �� ��!
		// �������� ó������ �������� / 100 * 100�� ������ Ȱ����!
		num = (int) (num / 100) * 100;
		// ������ Ǯ��
		// int reamin = num % 100;
		// num = num - remain;
		System.out.println(num);
	}
}
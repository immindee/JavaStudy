package ch04;

public class Exan4_2_2 {
	public static void main(String[] args) {
		int year = 2019; // ����
		// ������ Ǯ�̿� ���غ���!
		if (year%400 == 0 && year%100 == 0 && year%4 == 0) {
			System.out.println("��� and ����");
		}
		else if (year%100 == 0 && year%4 == 0) {
			System.out.println("��� and ����");
		}
		else if (year%400 == 0) {
			System.out.println("����");
		}
		else if (year%100 == 0) {
			System.out.println("���");
		}
		else if (year%4 == 0) {
			System.out.println("����");
		}
	}
}
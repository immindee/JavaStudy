package ch03;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = num1++ < 0 && num2++ > 0;
		// num2 �� ���ʿ� ������� ���� &&���� �� num1�� ��������X�̹Ƿ�
		// �̴� ���� ���� �����̱� ������ ���� num2++�� �������� ����
		System.out.println("result :" + result); // 1
		System.out.println("num1 :" + num1 + ",num2 :" + num2); //0
	}
}

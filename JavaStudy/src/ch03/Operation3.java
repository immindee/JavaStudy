package ch03;

import java.util.Scanner;

public class Operation3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// nextInt �޼ҵ�� �Է��� �� ���� ���ؿ� ���� �Ǵ����ִ� �Լ�
		System.out.println("ù��° ���ڸ� �Է����ּ���.");
		int num1 = s.nextInt();
		// ���� �̷��� �ƹ� ���ڳ� �Է��غ���� ���ǹ����� �־��ذ�!
		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
		int num2 = s.nextInt();
		
		
		// ������� ������ �ƴ� ���ڿ��� ���� ���� ""�� ������!
		System.out.println(num1 + "" + num2);
		
		boolean result = (num1 * num2) % 3 == 0;
		System.out.println(result);
		s.close();
	}

}

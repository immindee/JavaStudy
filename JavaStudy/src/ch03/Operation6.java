package ch03;

import java.util.Scanner;

public class Operation6 {
	public static void main(String[] args) {
		// �� ����(����) �Է�
		// �Է��� �ޱ����ؼ� Scanner�� �ؾ���!
		Scanner s = new Scanner(System.in);
		// ���ڰ� �ƴ� ���ڱ� ������ nextInt ��� String�� �����!
		System.out.println("�����ڸ� �Է����ּ���.");
		String txt = s.next();
		System.out.println(txt);
		
		// ������ ù��° ��¥�� Char�� ��������!
		char txt2 = txt.charAt(0);
		
		// �Էµ� ���ڰ� ��� �´��� �˻�
		boolean isCorrect = false;
		isCorrect = txt2 >= 'a' && txt2 <= 'z'
				|| txt2 >= 'A' && txt2 <= 'Z' ;
		
		// ���
		System.out.println(isCorrect);
		
	}

}

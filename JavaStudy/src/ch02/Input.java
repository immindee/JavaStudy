package ch02;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		// ���̺귯���� �׻� '�ܺ�'���� �����;� �ϴµ�?
		// �׷� �޼ҵ带 �������� ���� import��� ��!
		// Scanner�� ������(Ʋ��ǥ��)�� ������ Scanner�� ���콺�����ٴ�
		// �׷��� import�� �߰� Ŭ���ϸ� ���� import�� �����
		int age = 100;
		Scanner s = new Scanner(System.in);
		// ���� Scanner�� �⺻�ڷ��� 8������ �ƴϹǷ�, �����ڷ���
		// int age = 100; �� ���� �����ڷ����� �ʱ�ȭ �ʿ�X
		int num = s.nextInt();
		System.out.println(num);
		// ���â�� X��ư ���� ������ư�� ���â�� ���� ����� ��Ȱ��ȭ��
		s.close();
	}
}
package ch03;

public class Operation1 {
	public static void main(String[] args) {
		int a = 10;
		a = -a;
		System.out.println(a);
		// �� �� �������� �Ѿ�� �Ǹ� a = -9 �� ��!
		System.out.println(a++);
		// ���� a�� �ٽ� Ȯ�������� -9�� ��!
		System.out.println(a);
		// ���⼭�� �ٷ� ������ ���� ����Ǽ� ������ ����!
		System.out.println(++a);
		// �̰��� ���� �ٷ� 1�� ���ҽ�Ű�Ƿ� -10���� ���ٿ��� �������� ��!
		System.out.println(--a);
	}
}
package ch01;

public class UnixTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		// 0.0 <= N < 1.0 �̶�� �ǹ��� �Լ�
		// �ֻ��� ���ڸ� ����� ������? ���ϱ� 6 �ϰ�, 0~5 ���̷� �����Ƿ� +1�� ���ָ� ��! �߰��� �Ҽ������ϸ� ������ �ִٸ� �Ϻ�!
		System.out.println(Math.random()*6+1);
		// �Ҽ��� ���ϸ� ���� ���ڴ� '�Ǽ�'�̹Ƿ�, �̸� '������ �ٲ����!
		System.out.println(
				(int) (Math.random()*6+1)
		);
		// 1�� �ֻ��� : 3
		// 2�� �ֻ��� : 2
		// �ΰ��� �ֻ��� ���� 5
		// �̷��� ǥ���ϰ� �ʹٸ�?
		int num1 = (int) (Math.random()*6+1);
		System.out.println(
				"1��" + num1
				);
		int num2 = (int) (Math.random()*6+1);
		System.out.println(
				"2��" + num2
				);
		System.out.println(
				"�ΰ��� ����" + ( num1 + num2)
				);
		System.out.println(
			"1��" +	(int) (Math.random()*6+1)
		);
		System.out.println(
			"2��" +	(int) (Math.random()*6+1)
		);
		System.out.println(
			"�ΰ���  ����" +	( (int) (Math.random()*6+1)
			+ (int) (Math.random()*6+1) )
		);
	}
}
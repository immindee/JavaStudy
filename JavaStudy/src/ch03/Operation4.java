package ch03;

public class Operation4 {
	public static void main(String[] args) {
		int num = 25654624;
		
		while(num > 0) {  //�ݺ��� �̿��ϱ�!
			int n = num % 10; //������ �ڸ� ���� ����
			System.out.println(n);
			num = num / 10;
		}
		
		
		
		
		
		
//		
//		// ù��° �ڸ����� ����!
//		int n1 = num % 10; // 4�� ���ð�
//		num = num / 10; // 232
//		int n2 = num % 10; // 2�� ���ð�
//		num = num / 10; // 23
//		int n3 = num % 10; // 3�� ���ð�
//		num = num / 10; // 2
//		int n4 = num % 10; // 2�� ���ð�
//		System.out.println(n1+n2+n3+n4);
	}
}

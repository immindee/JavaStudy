package ch04;

public class If {
	public static void main(String[] args) {
		// ��ü �ּ�ó���� ctrl + /
		// �̰� �´� ����!
		// int score = 87; // ���� ������ 87��
		// if(score >= 90) {
		//System.out.println("A");
		//} else if(score >= 80) {
		//System.out.println("B");
		//} else if(score >= 70) {
		//System.out.println("C");
		//} else if(score >= 60) {
		//System.out.println("D");
		//} else {
		//System.out.println("F");
		//}
		
		// �Ʒ��� Ʋ�� ����! �ֳ�? ������ �Ʒ� ������ ��� �����ع����� ������!
		// ���� ù��°���� �̹� �����ع����� ������ D�� �����°�!
		
		// �̷����Ҽ��� ������, ���߿� ������ ��������� �ڵ�����! ���⵵ ����!
		int score = 87;
		if(score >= 60) {
			if(score>= 70) {
				if(score>=80) {
					if(score>=90) {
						System.out.println("A");
					}
					System.out.println("B");
				}
				System.out.println("C");
			}
			System.out.println("D");
			
		System.out.println("D");
		} else if(score >= 70) {
		System.out.println("C");
		} else if(score >= 80) {
		System.out.println("B");
		} else if(score >= 90) {
		System.out.println("A");
		} else {
		System.out.println("F");
		}
	}
}

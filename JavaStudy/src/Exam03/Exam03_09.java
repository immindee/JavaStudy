package Exam03;

public class Exam03_09 {
	public static void main(String[] args) {
		// char a = 'c';
		// a = a + (char)1; (X)
		// a = (char)(a+1);
			// char + char ==> int + int
			// char + int ==> int + int
			//				(char) (int + int)
		
		char ch = 'T';
		// ( /* A���� ũ�� Z���� ���� ��� */ )
		// ( /* ch + 32 */ )
		// �빮�ڿ� 32�� ���ϸ� �ҹ��ڷ� ������ ������!
		// ������ �� �ٸ� ���콺�� ������ �뺸�� �ش��� ���α׷��� �˷��ִ� ��찡 �����Ƿ� �����ϱ�!
		// �ǿ����� �� ǥ�������� ū Ÿ������ ����ȯ�� �ϴ� ��Ģ�� ���� = �̴� ���� / �Ǽ��� �켱�÷� ��!
		char lowerCase = ((ch>'A'&&ch<'Z')?(char)(ch+32):ch);
		System.out.println("ch :"+ch);
		System.out.println("ch to lowerCase :" + lowerCase);
	}
}

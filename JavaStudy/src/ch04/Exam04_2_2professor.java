package ch04;

public class Exam04_2_2professor {
	public static void main(String[] args) {
		int year = 2500;
		
		// ������ ������ ���� �߿��ϹǷ�, �� �˰��ֱ�!
		if (year % 400 == 0) {
			System.out.println("����");
		} else if(year % 100 == 0) {
			System.out.println("���");
		} else if (year % 4 == 0) {
			System.out.println("����");
		} else {
			System.out.println("���");
		}
	}
}

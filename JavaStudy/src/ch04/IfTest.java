package ch04;

public class IfTest {
	public static void main(String[] args) {
		int score = 87;
		if(score >= 90) {
		// else �� ���Ʒ� ������ �����ؼ� score < 90 && score >= 80 �ǹ̸� �����ϰ� ����!
		System.out.println("A");
		} else if(score >= 80) {
		System.out.println("B");
		} else if(score >= 70) {
		System.out.println("C");
		} else if(score >= 60) {
		System.out.println("D");
		} else {
		System.out.println("F");
		}
	}
}
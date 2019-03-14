package ch04;

public class IfTest {
	public static void main(String[] args) {
		int score = 87;
		if(score >= 90) {
		// else 는 위아래 조건을 고려해서 score < 90 && score >= 80 의미를 내포하고 있음!
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
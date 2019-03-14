package Exam03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// 같은 방식이 반복될때는 ctrl + alt + ∇(화살표 아래버튼)
		int n1 = num % 10; // 5가 나올것
		num = num / 10;
		int n2 = num % 10; // 4가 나올것
		num = num / 10;
		int n3 = num % 10; // 3이 나올것
		num = num / 10;
		int n4 = num % 10; // 2가 나올것
		num = num / 10;
		int n5 = num % 10; // 1가 나올것
		System.out.println(n1 + n2 + n3 + n4 + n5);
	}
}
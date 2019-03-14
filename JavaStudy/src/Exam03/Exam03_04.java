package Exam03;

public class Exam03_04 {
	public static void main(String[] args) {
		int num = 456;
		// Int 를 쓰면 몫을 빼고 나머지를 다 버리는 것이므로, 잘 됨!
		// 페이지를 처음으로 돌릴때도 / 100 * 100의 연산을 활용함!
		num = (int) (num / 100) * 100;
		// 교수님 풀이
		// int reamin = num % 100;
		// num = num - remain;
		System.out.println(num);
	}
}
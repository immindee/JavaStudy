package ch04;

public class Exan4_2_2 {
	public static void main(String[] args) {
		int year = 2019; // 연도
		// 교수님 풀이와 비교해보기!
		if (year%400 == 0 && year%100 == 0 && year%4 == 0) {
			System.out.println("평년 and 윤년");
		}
		else if (year%100 == 0 && year%4 == 0) {
			System.out.println("평년 and 윤년");
		}
		else if (year%400 == 0) {
			System.out.println("윤년");
		}
		else if (year%100 == 0) {
			System.out.println("평년");
		}
		else if (year%4 == 0) {
			System.out.println("윤년");
		}
	}
}
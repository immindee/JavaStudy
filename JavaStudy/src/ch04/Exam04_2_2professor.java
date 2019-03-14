package ch04;

public class Exam04_2_2professor {
	public static void main(String[] args) {
		int year = 2500;
		
		// 순서의 조정이 가장 중요하므로, 꼭 알고있기!
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if(year % 100 == 0) {
			System.out.println("평년");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}
}

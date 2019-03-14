package ch03;

public class Operation4 {
	public static void main(String[] args) {
		int num = 25654624;
		
		while(num > 0) {  //반복문 이용하기!
			int n = num % 10; //마지막 자리 숫자 뜯어내기
			System.out.println(n);
			num = num / 10;
		}
		
		
		
		
		
		
//		
//		// 첫번째 자리수를 뜯어내기!
//		int n1 = num % 10; // 4가 나올것
//		num = num / 10; // 232
//		int n2 = num % 10; // 2가 나올것
//		num = num / 10; // 23
//		int n3 = num % 10; // 3이 나올것
//		num = num / 10; // 2
//		int n4 = num % 10; // 2가 나올것
//		System.out.println(n1+n2+n3+n4);
	}
}

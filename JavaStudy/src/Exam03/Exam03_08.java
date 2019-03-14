package Exam03;

public class Exam03_08 {
	public static void main(String[] args) {
		int num = 10;
		// 삼항연산자 = ( 조건식 ) ? 참 : 거짓
		// 그렇지만 num = 0이라면 음수가 나와서 곤란!
		// 따라서 num > 0 ? "양수" : ( num == 0 ? "0" : "음수 )
		System.out.println(num > 0 ? "양" : "음");
	}
}

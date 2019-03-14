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
		// ( /* A보다 크고 Z보다 적은 경우 */ )
		// ( /* ch + 32 */ )
		// 대문자에 32를 더하면 소문자로 변경이 가능함!
		// 오류가 뜬 다면 마우스를 가져다 대보면 해답을 프로그램이 알려주는 경우가 있으므로 참고하기!
		// 피연산자 중 표현범위가 큰 타입으로 형변환을 하는 규칙이 있음 = 이는 정수 / 실수를 우선시로 함!
		char lowerCase = ((ch>'A'&&ch<'Z')?(char)(ch+32):ch);
		System.out.println("ch :"+ch);
		System.out.println("ch to lowerCase :" + lowerCase);
	}
}

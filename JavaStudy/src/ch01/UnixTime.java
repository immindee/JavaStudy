package ch01;

public class UnixTime {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		// 0.0 <= N < 1.0 이라는 의미의 함수
		// 주사위 숫자를 만들고 싶으면? 곱하기 6 하고, 0~5 사이로 나오므로 +1을 해주면 됨! 추가로 소수점이하를 버릴수 있다면 완벽!
		System.out.println(Math.random()*6+1);
		// 소수점 이하를 담은 숫자는 '실수'이므로, 이를 '정수로 바꿔야함!
		System.out.println(
				(int) (Math.random()*6+1)
		);
		// 1번 주사위 : 3
		// 2번 주사위 : 2
		// 두개의 주사위 합은 5
		// 이렇게 표현하고 싶다면?
		int num1 = (int) (Math.random()*6+1);
		System.out.println(
				"1번" + num1
				);
		int num2 = (int) (Math.random()*6+1);
		System.out.println(
				"2번" + num2
				);
		System.out.println(
				"두개의 합은" + ( num1 + num2)
				);
		System.out.println(
			"1번" +	(int) (Math.random()*6+1)
		);
		System.out.println(
			"2번" +	(int) (Math.random()*6+1)
		);
		System.out.println(
			"두개의  합은" +	( (int) (Math.random()*6+1)
			+ (int) (Math.random()*6+1) )
		);
	}
}
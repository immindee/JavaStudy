package ch03;

public class Oper {
	public static void main(String[] args) {
		int count = 0;
		// 잘못된 표현방식 count = 1;
		count += 1; // 왼쪽오른쪽 같은 식임 count = count + 1;
		// 연산자는 오른쪽에서 왼쪽으로 동작함
		// 즉, 오른쪽에서 계산이 끝난후에 왼쪽으로 넘어가는 순서임!
		count++; // 왼쪽오른쪽 같은 식임 count = count + 1;
		// 2번 count 식을 넣었으니 답이 2!
		System.out.println(count);
	}
}

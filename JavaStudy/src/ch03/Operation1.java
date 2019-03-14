package ch03;

public class Operation1 {
	public static void main(String[] args) {
		int a = 10;
		a = -a;
		System.out.println(a);
		// 이 줄 다음으로 넘어가게 되면 a = -9 가 됨!
		System.out.println(a++);
		// 따라서 a를 다시 확인했을때 -9가 됨!
		System.out.println(a);
		// 여기서는 바로 연산결과 값이 연산되서 나오는 것임!
		System.out.println(++a);
		// 이것은 지금 바로 1을 감소시키므로 -10으로 이줄에서 연산결과가 뜸!
		System.out.println(--a);
	}
}
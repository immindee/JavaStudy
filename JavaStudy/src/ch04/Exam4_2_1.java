package ch04;

public class Exam4_2_1 {
	public static void main(String[] args) {
		int score = 22;
		// =이 아닌 ==과 같은 비교연산자를 쓰는 걸 잊지말기!
		if (score%2 == 0 && score%3 == 0) {
			System.out.println("쿵짝");
		}
		else if(score%2 == 0) {
			System.out.println("짝");
		}
		else if (score%3 == 0) {
				System.out.println("쿵"); 
		}
	}
}
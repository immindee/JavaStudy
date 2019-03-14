package ch04;

public class If {
	public static void main(String[] args) {
		// 전체 주석처리는 ctrl + /
		// 이게 맞는 조건!
		// int score = 87; // 현재 점수는 87점
		// if(score >= 90) {
		//System.out.println("A");
		//} else if(score >= 80) {
		//System.out.println("B");
		//} else if(score >= 70) {
		//System.out.println("C");
		//} else if(score >= 60) {
		//System.out.println("D");
		//} else {
		//System.out.println("F");
		//}
		
		// 아래는 틀린 식임! 왜냐? 위부터 아래 조건을 모두 만족해버리기 때문에!
		// 따라서 첫번째에서 이미 성립해버리기 때문에 D가 나오는것!
		
		// 이렇게할수도 있지만, 나중에 수정이 어려워지는 코드방식임! 보기도 힘듬!
		int score = 87;
		if(score >= 60) {
			if(score>= 70) {
				if(score>=80) {
					if(score>=90) {
						System.out.println("A");
					}
					System.out.println("B");
				}
				System.out.println("C");
			}
			System.out.println("D");
			
		System.out.println("D");
		} else if(score >= 70) {
		System.out.println("C");
		} else if(score >= 80) {
		System.out.println("B");
		} else if(score >= 90) {
		System.out.println("A");
		} else {
		System.out.println("F");
		}
	}
}

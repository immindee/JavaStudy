package ch04;

public class condition {
	public static void main(String[] args) {
		// 주사위를 굴릴 것임!
		int dice1 = 0;
		int dice2 = 0;
		dice1 = (int)(Math.random()*6)+1; // 1~6
		dice2 = (int)(Math.random()*6)+1; // 1~6
		System.out.println(dice1 + "," + dice2);

		
		if(dice1==dice2) {
			System.out.println("한번 더 던지세요.");
			
			// 한번 더 넣은 이유는 반복을 하기 위한 것임!
			dice1 = (int)Math.random()*6+1; // 1~6
			dice2 = (int)Math.random()*6+1; // 1~6
			System.out.println(dice1 + "," + dice2);
		}
		
		// 0.0 <= X < 1.0
		// 곱하기 6 +1 해줘야 주사위에 맞는 랜덤 숫자가 나옴!
		// Int를 써서 소수점 날려버리기!
		// (int)Math.random()*6+1; // 1~6
		
		
		// 조건식은 항상 true 또는 false로
		char gender = 'M';
		// if 한개짜리는 폴더 1개 생성된다는 개념으로 생각하면 됨!
		if(gender == 'M') {
			System.out.println("남자");
			System.out.println("여자아님");
		} else {
		System.out.println("여자");
		}
		
		if(true) {
			
		}
		boolean a = false;
		if (a) {
			
		}
	}
}
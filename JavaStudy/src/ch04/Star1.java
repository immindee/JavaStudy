package ch04;

public class Star1 { //중첩 반복문
	public static void main(String[] args) {
		
		for(int a = 5; a >= 1; a--) {  // 뒤집어서 출력한거
			for(int b=1; b<=a; b++) {
				//옆으로 출력. ln 쓰면 안되고 프린트만!
				System.out.print("◆");
			}
			System.out.println();
		}
		
//		for(int a = 1; a <= 5; a++) {
//			for(int b=1; b<=a; b++) {
//				//옆으로 출력. ln 쓰면 안되고 프린트만!
//				System.out.print("◆");
//			}
//			System.out.println();
//		}
}
}

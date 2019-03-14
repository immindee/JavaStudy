package ch04;

public class For1 {
		public static void main(String[] args) {
			//1.시작값   2.끝값(조건)   3.증감식
			for(int start = 1; start <=10; start++) {
				System.out.println("출력" + start);
			}
			for(int end = 10; end >=1; end--) {
				System.out.println("감소출력" + end);
				
				
			//1+(1+2)+(1+2+3)+...	
				int total = 0;
				int realTotal =0;
				for(int start = 1; start <=10; start++)
					//System.out.println("출력"+start);
					total = total + start;
					realTotal = realTotal + total;
				System.out.println(total);
			}
			// 주석 - 범위 지정하고 컨트롤/
//			System.out.println("출력");
//			System.out.print("한줄출력");
//			System.out.print("또 한줄출력");
//			System.out.println()
//			System.err.println("빨간색출력");;
//			
//			 주의! 1 2 3 조건이 제대로 맞지 않는 경우에도 for 쓸 수는 있음 근데 이상하쥬
//			for(int idx= 1; idx <= 10;) {
//				System.out.println(idx);}
}
}

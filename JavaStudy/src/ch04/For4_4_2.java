package ch04;

public class For4_4_2 {
	public static void main(String[] args) {
		 // 코드 작성
		int total =0;
		for(int i =1; i<=1000; i++) {
			if(i % 2==0 && i % 7==0) {
			System.out.println(i);
				total += i;
			}
		 }
			System.out.println("합: "+ total);
}
}
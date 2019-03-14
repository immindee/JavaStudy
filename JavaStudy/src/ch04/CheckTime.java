package ch04;

import java.util.Calendar;

public class CheckTime {
	public static void main(String[] args) {
		// 시간을 알아내는 라이브러리 = Calendar , Date 두가지!

		// Calendar.getInstance 는 현재 지금 시간을 알아내는것인듯?
		Calendar cal = Calendar.getInstance();
		// 기본자료형 8가지가 아닌 참조자료형은 명령어.로 점을 찍으면 추가기능이 나옴!
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour);
		
		if(hour>=12) {
			System.out.println("오후");
		}	else {
			System.out.println("오전");
		}
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		
	}
}

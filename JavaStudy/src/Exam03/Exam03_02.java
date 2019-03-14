package Exam03;

public class Exam03_02 {
	public static void main(String[] args) {
		// /를 하는 순간 이미 정수로 인식해버려서 소수점을 붙일필요있음
		
		// float 를 쓸수도 있음! 하지만? 오류?
		// double 이 더 큰 자료인데 flaot는 작은곳이라서 안들어가는것
		double div = 5.0/2;
		
		float diva = (float) 5.0/2;
		System.out.println("나누기 결과" + div);
	}
}

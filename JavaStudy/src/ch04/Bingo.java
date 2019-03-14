package ch04;

public class Bingo { //근데 아직 잘 못해서 걍 달력st임ㅎㅎ
	public static void main(String[] args) {
		for(int i=1; i<=25; i++) {
			System.out.print(i +"\t");
			if(i % 5==0) {
				System.out.println();
			}
		}
	}

}

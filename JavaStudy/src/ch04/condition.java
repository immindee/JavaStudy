package ch04;

public class condition {
	public static void main(String[] args) {
		// �ֻ����� ���� ����!
		int dice1 = 0;
		int dice2 = 0;
		dice1 = (int)(Math.random()*6)+1; // 1~6
		dice2 = (int)(Math.random()*6)+1; // 1~6
		System.out.println(dice1 + "," + dice2);

		
		if(dice1==dice2) {
			System.out.println("�ѹ� �� ��������.");
			
			// �ѹ� �� ���� ������ �ݺ��� �ϱ� ���� ����!
			dice1 = (int)Math.random()*6+1; // 1~6
			dice2 = (int)Math.random()*6+1; // 1~6
			System.out.println(dice1 + "," + dice2);
		}
		
		// 0.0 <= X < 1.0
		// ���ϱ� 6 +1 ����� �ֻ����� �´� ���� ���ڰ� ����!
		// Int�� �Ἥ �Ҽ��� ����������!
		// (int)Math.random()*6+1; // 1~6
		
		
		// ���ǽ��� �׻� true �Ǵ� false��
		char gender = 'M';
		// if �Ѱ�¥���� ���� 1�� �����ȴٴ� �������� �����ϸ� ��!
		if(gender == 'M') {
			System.out.println("����");
			System.out.println("���ھƴ�");
		} else {
		System.out.println("����");
		}
		
		if(true) {
			
		}
		boolean a = false;
		if (a) {
			
		}
	}
}
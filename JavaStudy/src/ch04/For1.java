package ch04;

public class For1 {
		public static void main(String[] args) {
			//1.���۰�   2.����(����)   3.������
			for(int start = 1; start <=10; start++) {
				System.out.println("���" + start);
			}
			for(int end = 10; end >=1; end--) {
				System.out.println("�������" + end);
				
				
			//1+(1+2)+(1+2+3)+...	
				int total = 0;
				int realTotal =0;
				for(int start = 1; start <=10; start++)
					//System.out.println("���"+start);
					total = total + start;
					realTotal = realTotal + total;
				System.out.println(total);
			}
			// �ּ� - ���� �����ϰ� ��Ʈ��/
//			System.out.println("���");
//			System.out.print("�������");
//			System.out.print("�� �������");
//			System.out.println()
//			System.err.println("���������");;
//			
//			 ����! 1 2 3 ������ ����� ���� �ʴ� ��쿡�� for �� ���� ���� �ٵ� �̻�����
//			for(int idx= 1; idx <= 10;) {
//				System.out.println(idx);}
}
}

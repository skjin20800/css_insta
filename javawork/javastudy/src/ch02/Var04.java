package ch02;

public class Var04 {

	public static void main(String[] args) {
		// ���� ������ 1, 2, 3
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		// ���� ������ 1,2,3
		int[] n = {1, 2, 3}; // ����� �迭�� �����ּҸ� ����Ѵ�.
		                              // �迭 ����  : �����͸� �о�ö� ������ ���ϴ� 
		                             // �迭 ���� : ������ ����� ����ã�� �����
									//                   ũ�⸦ �ѹ����ϸ� �ø� �� ����.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		// ���� ������
		char[] c1 = {'��','��','��'};
		
		System.out.println(c1[0]);
		
	} 
}

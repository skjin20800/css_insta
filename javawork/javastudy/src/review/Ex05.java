package review;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �迭 : ���ӵ� �����Ͱ����� Ȯ�����ֱ� ������ �׼����� ������ ����.
		// ���� : �迭�� ������ �߰�, ������ �ȵ�
		// Ư¡ :���� Ÿ���� �����͸� �����ϴ� �ڷ���
		// Object Ÿ������ ����� ��� Ÿ���� ����.
		// ����� ���ؼ� �θ�Ÿ������ ������ ��� Ÿ���� �� ����
		
		//�迭�� ũ�Ⱑ ������ �־�� ��.
		//�÷����� ����� ���� (ArryList) - ���׸��� �˾ƾ� ����� �� ����
		
		int[] n1 = new int[3];
		n1[0] = 1;
		n1[1] = 2;
		n1[2] = 3;
				System.out.println(n1[2]);
		
		Object[] n2 = new Object[3];
		//Wrapper Ŭ����
		n2[0] = '��'; //String
		n2[1] = 10; //Integer
		n2[2] = 10.5; //Double
	}

}
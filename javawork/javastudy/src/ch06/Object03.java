package ch06;

public class Object03 {
	public static void main(String[] args) {
		String str1 = "ȫ�浿"; //str1�� �ּҸ� ����������
		String str2 = "ȫ�浿";
		
		int num = 10;  //num�� ���� �������
		
		// ==�� ���� �׼����� �޸� ������ ������ ��
		// String�� �ּҰ��� ��, num�� ���� ��

		System.out.println(str1 == str2);

		// String str3�� String Constant Pool�� ����ȴ�
		// String str4�� heap�� ����ȴ�
		// heap ������ Constant pool�� �����Ѵ�.
		String str3 ="�Ӳ���";
		String str4 = new String("�Ӳ���");
		
		// String�� Hash�Լ��� �������̵��Ǽ�
		// ���� ���ڿ��̸� ���� �ؽ��� �̾Ƴ���.
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		//������ ���� ������ str3�� str4�� �ּҰ��� �޶� false�̴�
		System.out.println(str3 == str4);
		
		// equals
		// - ==���� ���� �� ������ true
		// - ==���� ���ߴµ� false�� ������ ������������ ���� ��
		System.out.println(str3.equals(str4));
}
	
}

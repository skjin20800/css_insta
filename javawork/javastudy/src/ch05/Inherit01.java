package ch05;

//1. ����� ���� �޴� �ǹ� (�̷����� ����� ���������� �����ʴ´�[���������� �ؾ���, ])

class Father {
	int money = 10000;
}

class Son extends Father {
	int money = 20000;
}

public class Inherit01 {
	public static void main(String[] args) {
//		Father s = new Son(); // s�� ����Ű�°��� Type�� Father�̰� new�� heap�� Fater�� Son�Ѵ� ���� Son();�� Son();�� �����ڸ� ȣ���Ѵ�
		Son s = new Son();
		// 1�� - ������ ã���� ������ ������ �� ������ ���
		// ������ ������ �θ� ã�� �ö� ����.
		System.out.println(s.money); // Son�� ������ money�� ã�ƺ��� ������ ���������� Father�� money�� ã�´�
		
		//2�� new���ϸ� Father�� Son�� heap�� ���. Father�� �� Son�� �Ʒ��� ���
		//�����ڴ� Son()�� ȣ���� �ȴ�.
		// ����Ű�� �޸� �ּҴ�  Ÿ��(Father)�� ���󰣴�
		// ������ ó�� Son(); �� �м��ؼ� new�����µ� ������־ Son�� Father�Ѵ� ���� �״��� �º��� Father �� �����͸� ���Ѵ�
		Father f = new Son();
		System.out.println(f.money);// �º��� Father f �� ������ Father�� ����Ų��
	}
}

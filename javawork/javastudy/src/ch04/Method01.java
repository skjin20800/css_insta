package ch04;

//�ڹ� Ư¡ =��� �ڵ�� class ���ο� �־� �Ѵ�
public class Method01 {
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	
	void sound() {
		System.out.println("sound�Լ� ȣ���");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Method01.add();
			
			Method01 m = new Method01();
			m.sound();
			//���� new Method01();�� �ϸ� Method01Ŭ������ ��� ���� ȣ����
			//Method01 m �� �Ŭ������ ����Ұ�����, �������� ���������� �����
	}

}

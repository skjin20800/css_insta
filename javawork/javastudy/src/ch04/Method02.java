package ch04;

class Dog {
	int ����� = 100; //���� //���´� ������ ���ؼ��� ����
	
	void eat() { //����  
		����� = 10;
	}
}


public class Method02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();

		//d1.����� = 10; //������ ���������� �ٲٴ� ���� ���� [����]
		d1.eat();
		
		System.out.println("�������ǹ���� : " + d1.�����);
	}
}

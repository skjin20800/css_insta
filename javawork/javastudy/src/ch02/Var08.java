package ch02;

//heap
class Zealot{
	String name = "����";
	int attack = 10;
	static int armor = 5;
	static int hp =100;
}

//static�� �Ⱥ��� ��� class���� �������  new�� �̿��Ͽ� ȣ��
//
public class Var08 {
	public static void main(String[] args) {
		
	Zealot z = new Zealot(); //ȣ��� heap ���� [�޸𸮿� heap�� ���� ���]
												//Zealot = type, z ������, new heapȣ��, Zealot(); = heap ����
												//15�����ο��� ���� ������
	System.out.println(z.name);
	System.out.println(z.attack);
	System.out.println(z.armor); 

	Zealot z2 = new Zealot();
	
	//Zealot.armor = 2;
	
	System.out.println(z2.name);
	System.out.println(z2.attack);
	System.out.println(z2.armor);
	
	z2.attack = 50;
	
	System.out.println("��ȭ ����");
	System.out.println(z.attack);
	System.out.println(z2.attack);
	
	Zealot.hp = 50; //Zealot.hp�� ����
	
	System.out.println(Zealot.hp);
	System.out.println(Zealot.hp);
	
	//����
	
	z.attack = 11;
	
	System.out.println(z.attack);
	System.out.println(z2.attack);
	
	}
}

package strar1;

//�����ε� : �Լ��� �̸��� ���Ƶ� �Ű������� ����, Ÿ���� �ٸ���
// �ٸ� �Լ��� �ν��Ѵ� (������)
// �����ε��� ����Ǽ��� �������϶� ���
public class Star1App {

	//���� -> ���
	static void attack(Zealot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + "����");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" ü��" + u2.hp);
	}
	// ��� - > ����
	static void attack(Dragoon u2, Zealot u1) {
		System.out.println(u1.name + " -> " + u2.name + "����");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" ü��" + u2.hp);
	}
	
	static void attack(Dragoon u2, Dragoon u1) {
		System.out.println(u1.name + " -> " + u2.name + "����");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" ü��" + u2.hp);
	}
	
	static void attack(Darktempler u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + "����");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" ü��" + u2.hp);
	}
	
	static void attack(Darktempler u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + "����");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" ü��" + u2.hp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z1 = new Zealot("����1", 100, 10);
		Dragoon d1 = new Dragoon ("���1", 100, 20);
		Dragoon d2 = new Dragoon ("���2", 100, 20);
		Darktempler t1 = new Darktempler("��ũ���÷�1", 100, 50);
		Darktempler t2 = new Darktempler("��ũ���÷�2", 100, 50);
		
		//1. ���� -> ��� ����
		attack(z1, d1);
		System.out.println("");
		//2. ��� -> ���� ����
		attack(d1, z1);
		System.out.println("");
		//3. ��� -> ��� ����
		attack(d2, d1);
		System.out.println("");
		
		//4. ��ũ���÷� -> ����1 ���� (��ũ���÷�1, 100, 50)
		attack(t1, z1);
		System.out.println("");
		// 5. ��ũ���÷�2 -> ���1 ����
		attack(t1, d1);
		System.out.println("");
		
		
		
	}
}

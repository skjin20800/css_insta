package strar1;
// 1. Zealot, Drgoon, Tank, SCV, DarkTempler => StarUnit���� ���´� Ÿ�� ��ġ [��� or �������̽�]
// 2.



public class Star3App {
	
	public static void attack(StarUnit u1, StarUnit u2) {
		// ������ �ʿ��Ѱ�
		// 1. ��ü���� ���� ���� �߻�Ŭ���� �ʿ� (StarUnit Ŭ����)
		// 2. StarUnitŬ�������� ���ݿ� ����� attack(){} �߻� �޼ҵ� ����
		// 3. �ڽ� Ŭ�������� ���  attack(){} �޼ҵ� ���� �� �� ���� getter, setter ����
		// 4. �ڽ� Ŭ������ ���¸� ������ ������ ��ȯ��Ű�����ؼ� StarUnitŬ�������� getter�� setter����
		// 4-1. �̷��� ������ �������̵��� ������ �޼ҵ常 �����ϱ� ������
		// 4-2. getter�� setter�� ������� attack�Լ� ���غκ� ����
		// 5. ���������� �����ų ����Ŭ�������� 
		
		u1.attack(u1,u2);
	}
	public static void main(String[] args) {
		Zealot z1 = new Zealot("����1", 100, 10);
		Zealot z2 = new Zealot("����2", 100, 10);
		Tank t1 = new Tank("��ũ1", 200, 20);
		SCV SC1 = new SCV("SCV1", 50, 5);
			
		Star3App.attack(z1,z2);
		Star3App.attack(SC1, t1);
		Star3App.attack(t1, SC1);
		Star3App.attack(t1, z2);
		Star3App.attack(t1, z2);
	}
}

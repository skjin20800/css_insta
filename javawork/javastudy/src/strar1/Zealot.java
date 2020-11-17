package strar1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//������ �ʿ��Ѱ�
		//1 .name, hp, attack, sysout -> �׷��ٸ� �Լ��� �̿��ؼ� ���������� �ؾ���
		//2 .StarUnit�� ��ư�� ���������� attack�Լ� �ϳ������
		//3. Zealot���� name, hp, attack�� �����ϴ� �Լ� (StarUnit u1, StarUnit u2) �����
@NoArgsConstructor
@AllArgsConstructor
@Data

class Zealot extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "����");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" ü�� = " + b.getHp());	
	}
	
}

package strar1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Reiver extends StarUnit {
//����
	private String name;
	private int hp;
	private int attack;
	
	
//�ʱ�ȭ�� ���� ������ (����x)

// 3. ����Ʈ �����ڸ� ���� ������ش�. (����: �����Ϸ��� �ȸ�����ִϱ�)



//4.  ������ ���� �����ϰų� Ȯ���ϴ� ������ �ʿ�!!
	
	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "����");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" ü�� = " + b.getHp());	
	}
	
}

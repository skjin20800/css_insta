package Zerg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Zergling implements ZergUnit {
String name;
int hp;
int attack;
int armor;
@Override
public void attack(ZergUnit a, ZergUnit b) {
	System.out.println(a.getName()+"�� "+b.getName()+"�� "+a.getAttack()+"�� �������� �����մϴ�." );
	System.out.println(b.getName()+"�� ü���� " + b.getHp()+" �Դϴ�.");
	System.out.println(a.getName()+"�� ���ݷ���"+a.getAttack()+"������");
	System.out.println(b.getName()+"�� ������"+b.getArmor()+"�̱� ������");
	b.setHp(b.getHp()-(a.getAttack()-b.getArmor()));
	System.out.println(b.getName()+"�� ü���� "+b.getHp()+" �Դϴ�.");
}


}

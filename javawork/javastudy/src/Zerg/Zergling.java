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
	System.out.println(a.getName()+"은 "+b.getName()+"을 "+a.getAttack()+"의 데미지로 공격합니다." );
	System.out.println(b.getName()+"의 체력은 " + b.getHp()+" 입니다.");
	System.out.println(a.getName()+"의 공격력은"+a.getAttack()+"이지만");
	System.out.println(b.getName()+"의 방어력은"+b.getArmor()+"이기 때문에");
	b.setHp(b.getHp()-(a.getAttack()-b.getArmor()));
	System.out.println(b.getName()+"의 체력은 "+b.getHp()+" 입니다.");
}


}

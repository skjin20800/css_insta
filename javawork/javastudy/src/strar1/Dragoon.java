package strar1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

class Dragoon extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	

	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "공격");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" 체력 = " + b.getHp());	
	}
	
}

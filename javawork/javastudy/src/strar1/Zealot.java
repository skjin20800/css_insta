package strar1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//구동에 필요한것
		//1 .name, hp, attack, sysout -> 그렇다면 함수를 이용해서 변수참조를 해야함
		//2 .StarUnit에 버튼을 만들어줘야함 attack함수 하나만들기
		//3. Zealot에서 name, hp, attack를 참조하는 함수 (StarUnit u1, StarUnit u2) 만들기
@NoArgsConstructor
@AllArgsConstructor
@Data

class Zealot extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "공격");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" 체력 = " + b.getHp());	
	}
	
}

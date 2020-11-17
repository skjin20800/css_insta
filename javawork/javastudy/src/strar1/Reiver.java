package strar1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
 class Reiver extends StarUnit {
//상태
	private String name;
	private int hp;
	private int attack;
	
	
//초기화를 위한 생성자 (마법x)

// 3. 디폴트 생성자를 직접 만들어준다. (이유: 컴파일러가 안만들어주니까)



//4.  변수의 값을 변경하거나 확인하는 행위가 필요!!
	
	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "공격");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" 체력 = " + b.getHp());	
	}
	
}

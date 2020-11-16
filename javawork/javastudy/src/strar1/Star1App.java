package strar1;

//오버로딩 : 함수의 이름이 같아도 매개변수의 개수, 타입이 다르면
// 다른 함수로 인식한다 (과적재)
// 오버로딩은 경우의수가 제한적일때 사용
public class Star1App {

	//질럿 -> 드라군
	static void attack(Zealot u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + "공격");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" 체력" + u2.hp);
	}
	// 드라군 - > 질럿
	static void attack(Dragoon u2, Zealot u1) {
		System.out.println(u1.name + " -> " + u2.name + "공격");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" 체력" + u2.hp);
	}
	
	static void attack(Dragoon u2, Dragoon u1) {
		System.out.println(u1.name + " -> " + u2.name + "공격");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" 체력" + u2.hp);
	}
	
	static void attack(Darktempler u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + "공격");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" 체력" + u2.hp);
	}
	
	static void attack(Darktempler u1, Dragoon u2) {
		System.out.println(u1.name + " -> " + u2.name + "공격");
		u2.hp = u2.hp - u1.attack; // 90	
		System.out.println( u2.name +" 체력" + u2.hp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z1 = new Zealot("질럿1", 100, 10);
		Dragoon d1 = new Dragoon ("드라군1", 100, 20);
		Dragoon d2 = new Dragoon ("드라군2", 100, 20);
		Darktempler t1 = new Darktempler("다크템플러1", 100, 50);
		Darktempler t2 = new Darktempler("다크템플러2", 100, 50);
		
		//1. 질럿 -> 드라군 공격
		attack(z1, d1);
		System.out.println("");
		//2. 드라군 -> 질럿 공격
		attack(d1, z1);
		System.out.println("");
		//3. 드라군 -> 드라군 공격
		attack(d2, d1);
		System.out.println("");
		
		//4. 다크템플러 -> 질럿1 공격 (다크템플러1, 100, 50)
		attack(t1, z1);
		System.out.println("");
		// 5. 다크템플러2 -> 드라군1 공격
		attack(t1, d1);
		System.out.println("");
		
		
		
	}
}

package ch02;

//heap
class Zealot{
	String name = "질럿";
	int attack = 10;
	static int armor = 5;
	static int hp =100;
}

//static이 안붙은 모든 class안의 내용들은  new를 이용하여 호출
//
public class Var08 {
	public static void main(String[] args) {
		
	Zealot z = new Zealot(); //호출시 heap 생성 [메모리에 heap의 내용 등록]
												//Zealot = type, z 변수명, new heap호출, Zealot(); = heap 내용
												//15번라인에서 질럿 생성됨
	System.out.println(z.name);
	System.out.println(z.attack);
	System.out.println(z.armor); 

	Zealot z2 = new Zealot();
	
	//Zealot.armor = 2;
	
	System.out.println(z2.name);
	System.out.println(z2.attack);
	System.out.println(z2.armor);
	
	z2.attack = 50;
	
	System.out.println("변화 관찰");
	System.out.println(z.attack);
	System.out.println(z2.attack);
	
	Zealot.hp = 50; //Zealot.hp로 만듬
	
	System.out.println(Zealot.hp);
	System.out.println(Zealot.hp);
	
	//포지
	
	z.attack = 11;
	
	System.out.println(z.attack);
	System.out.println(z2.attack);
	
	}
}

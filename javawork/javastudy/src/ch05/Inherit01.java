package ch05;

//1. 재산을 물려 받는 의미 (이런식의 상속은 가능하지만 쓰지않는다[컴포지션을 해야함, ])

class Father {
	int money = 10000;
}

class Son extends Father {
	int money = 20000;
}

public class Inherit01 {
	public static void main(String[] args) {
//		Father s = new Son(); // s가 가르키는것은 Type인 Father이고 new는 heap에 Fater과 Son둘다 띄우고 Son();는 Son();의 생성자를 호출한다
		Son s = new Son();
		// 1번 - 변수를 찾을때 변수가 있으면 그 변수를 사용
		// 변수가 없으면 부모를 찾아 올라 간다.
		System.out.println(s.money); // Son에 변수인 money를 찾아보고 없으면 상위개념은 Father에 money를 찾는다
		
		//2번 new를하면 Father과 Son이 heap에 뜬다. Father이 위 Son이 아래에 뜬다
		//생성자는 Son()만 호출이 된다.
		// 가르키는 메모리 주소는  타입(Father)을 따라간다
		// 내생각 처음 Son(); 를 분석해서 new를띄우는데 상속이있어서 Son과 Father둘다 띄운다 그다음 좌변의 Father 로 포인터를 정한다
		Father f = new Son();
		System.out.println(f.money);// 좌변의 Father f 는 위쪽의 Father을 가르킨다
	}
}

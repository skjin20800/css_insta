package strar1;

 class Marine extends StarUnit {
	//field, property 는 private로 만든다. 마법x
	//멤버변수 : 필드 : heap 변수 : 전역변수 : 속성 : 프로퍼티라고 부르기도 한다.
	
	//this = 힙변수 , new될때 그 공간을 가르켜줌, java 실행시에 공간이 할당됨
	//1. this = 힙변수
	//2. this = new가 된 heap공간을 Binding 한다
	// this는 heap을 가르킨다
	
		private String name;
		private int hp;
		private int attack;
		
	
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	} 	
	
	public Marine() {
	
	}
	void attack(StarUnit a, StarUnit b) {		
		System.out.println(a.getName() + " -> " + b.getName() + "공격");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" 체력 = " + b.getHp());	
	}
}

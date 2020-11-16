package strar1;

 class Tank {
	final String name; //메모리공간을 읽기 전용으로 변경
	int hp;
	int attack;
	
	public Tank(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
	
	public Tank() {
		this.name = "asdf";
	}

	
	
}

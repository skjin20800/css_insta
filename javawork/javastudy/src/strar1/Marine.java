package strar1;

 class Marine extends StarUnit {
	//field, property �� private�� �����. ����x
	//������� : �ʵ� : heap ���� : �������� : �Ӽ� : ������Ƽ��� �θ��⵵ �Ѵ�.
	
	//this = ������ , new�ɶ� �� ������ ��������, java ����ÿ� ������ �Ҵ��
	//1. this = ������
	//2. this = new�� �� heap������ Binding �Ѵ�
	// this�� heap�� ����Ų��
	
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
		System.out.println(a.getName() + " -> " + b.getName() + "����");
		b.setHp(b.getHp()-a.getAttack());
		System.out.println( b.getName() +" ü�� = " + b.getHp());	
	}
}

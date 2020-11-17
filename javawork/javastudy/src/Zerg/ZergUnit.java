package Zerg;

public interface ZergUnit {

	void attack(ZergUnit a, ZergUnit b);

	String getName();
	int getHp();
	void setHp(int a);
	int getAttack();
	int getArmor();
	

}

package Zerg;

public class ZergApp {
	public static void attack(ZergUnit a, ZergUnit b) {
		a.attack(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zergling z1 = new Zergling("저글1", 45, 5, 1);
		Zergling z2 = new Zergling("저글2", 45, 5, 1);

		z1.attack(z1, z2);

	}
}

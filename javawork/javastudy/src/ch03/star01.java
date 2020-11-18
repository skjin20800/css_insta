package ch03;


public class star01 {
	static void starPrint(int num) {
		for (int i = 0; i <num; i++) {
			System.out.print("*");
	}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 5; i > 0; i--) {
			starPrint(i);
		}
		
	}

}

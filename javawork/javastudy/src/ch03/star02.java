package ch03;


public class star02 {
	static void starPrint(int num) {
		for (int i = 0; i <num; i++) {
			System.out.print("*");
	}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			starPrint(i);
		if(i==3) {
			for (int j = 2; j > 0; j--) {
				starPrint(j);	
		}
		}
	}
	}
}



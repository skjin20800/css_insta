package ch03;

public class star03 {
	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
			}
			starPrint(i);
			for (int j = 3; j > i; j--) {
				System.out.print(" ");
				
			}
			System.out.println();
//////////////////
			if(i==3) {
				for (int a = 0; a < 2; a++) {
					if (a % 2 == 0) {
						continue;
					}
					for (int j = 3; j > a; j--) {
						System.out.print(" ");
					}
					starPrint(a);
					System.out.println();
				}
			}
		}
		}
}

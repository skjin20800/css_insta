package ch03;

public class star4 {
	static void starPrint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1= 7;
		
		for (int i = 0; i < n1; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = n1/2; j > i; j--) {
				System.out.print(" ");
			}
			starPrint(i);
			for (int j = n1/2; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("a");
		System.out.println("a");
//////////////////
			
				for (int a = 0; a < (n1/2)+1; a++) {
					if (a % 2 == 0) {
						continue;
					}
					for (int j = n1/2; j > a; j--) {
						System.out.print(" ");
					}
					starPrint(a);
					for (int j = n1/2; j > a; j--) {
						System.out.print(" ");
					}
					System.out.println();
				}
			
		
		}
	//간단하게만드는법 모르겠다리
}

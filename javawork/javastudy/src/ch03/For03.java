package ch03;

//1번 별 거꾸로

public class For03 {

	static void starPrint(int num) {
		for (int i = 0; i <num; i++) {
			System.out.print("*");
	}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int i = 0; i < 6; i++) {
		starPrint(i);
	}
		
		
	}
}

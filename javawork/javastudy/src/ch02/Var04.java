package ch02;

public class Var04 {

	public static void main(String[] args) {
		// 숫자 여러개 1, 2, 3
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		
		// 숫자 여러개 1,2,3
		int[] n = {1, 2, 3}; // 저장시 배열의 시작주소만 기억한다.
		                              // 배열 장점  : 데이터를 읽어올때 빠르고 편하다 
		                             // 배열 단점 : 데이터 저장시 공간찾기 힘들다
									//                   크기를 한번정하면 늘릴 수 없다.
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n);
		
		// 문자 여러개
		char[] c1 = {'가','나','다'};
		
		System.out.println(c1[0]);
		
	} 
}

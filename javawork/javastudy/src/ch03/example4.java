package ch03;

import java.util.Scanner;

public class example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~99 사이의 정수를 입력하시오");
//		int 입력 = sc.nextInt();
		int 입력2;
		int 입력2_1;
		int 입력3;
		int 입력3_1;

		for (int 입력 = 1; 입력 < 100; 입력++) {
System.out.println("숫자" + 입력);

			입력2 = 입력 / 10; // 십의자리수
			입력3 = 입력 % 10; // 일의자리수
			if(입력3%3 ==0 && 입력2%3 ==0 && 입력3 != 0 && 입력 >10) {
				System.out.println("박수짝짝");
				//일의자리수가 3의배수이며, 십의자리수가 3의배수이다,
				// 일의자리수는 0이아니며, 입력받은 숫자는 10이상이다
			}
			else if(입력3%3 ==0 && 입력3 !=0) {
				System.out.println("박수짝a");
				//일의자리수 /3의 나머지가 0이고, 일의자리수가 0이아닐때
				// = 일의자리수가 3의 배수
			}
			else if(입력2/3 > 0  && 입력2%3 ==0) {
				System.out.println("박수짝b");
				// 십의자리수 /3이 존재하고, 십의자리수 /3의 나머지가 0일때 
				// = 십의자리수가 3의 배수
			}
			
			
			
//			if (입력3 % 3 == 0 && 입력2 % 3 != 0&&입력 <10) {
//				System.out.println("박수짝a");
//			}
//			else if (입력2 % 3 == 0 && 입력3 % 3 != 0) {
//				System.out.println("박수짝b");}
//			 else if (입력3 % 3 == 0 && 입력2 % 3 == 0) {
//				if (입력 < 10) {
//					System.out.println("박수짝");
//				} else {
//					System.out.println("박수짝짝");
//				}
//			}
		}
	}
}
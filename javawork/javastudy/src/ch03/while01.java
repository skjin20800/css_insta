package ch03;

import java.util.Scanner;

public class while01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int check=0;
		//데몬 (Deamon Process) - 웹 서버
		while(check>=0) {
			int num = sc.nextInt();
			System.out.println("받은 값 :" + num);
check =num;
			//			if(num <0) {
//				break;
//			}
		}
	}
}

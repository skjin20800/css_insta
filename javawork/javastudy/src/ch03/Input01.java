package ch03;

import java.util.Scanner;

public class Input01 {
	public static void main(String[] args) {
		// Scanner를 이용하연 I/O장치에 접근 가능!!
		Scanner sc = new Scanner(System.in); // I/O장치에 접근할수있는 장치
		int num = sc.nextInt(); //키보드로부터 입력받는값을 num에넣는다. // 블락킹
		
		System.out.println("입력받은 값 : "+num);
		
			
		
	}
}

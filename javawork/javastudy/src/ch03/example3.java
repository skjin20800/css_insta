package ch03;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int []num = new int[3];
		System.out.print("정수 3개 입력");
		int tmp;
		num[0] = sc1.nextInt();
		num[1] = sc1.nextInt();
		num[2]= sc1.nextInt();
		

	for(int j = 0; j <3; j++) {
		
		for(int i = 0;i<2 ; i++) {
			if(num[i]<num[i+1]) {
				
				tmp = num[i+1];
				num[i+1] = num[i];
				num[i] = tmp;
				
			}
		}
	}
		System.out.println("중간 값은"+ num[1]);
	}

}

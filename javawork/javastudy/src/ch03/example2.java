package ch03;

import java.util.Scanner;

public class example2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int result;
	int result2;
	System.out.print("�ݾ��� �Է��Ͻÿ�");
	int money = sc.nextInt();
	
	while(true) {
	if(money > 50000) {
		result = money/50000;
		money = money%50000;
		System.out.println("��������" + result+" ��");
	}
	else if(money > 10000) {
		result = money/10000;
		money = money%10000;
		System.out.println("������" + result+" ��");
	}
	else if(money > 1000) {
		result = money/1000;
		money = money%1000;
		System.out.println("õ����" + result+" ��");
	}
	else if(money > 100) {
		result = money/100;
		money = money%100;
		System.out.println("���" + result+" ��");
	}
	else if(money > 50) {
		result = money/50;
		money = money%50;
		System.out.println("���ʿ�" + result+" ��");
	}
	else if(money > 10) {
		result = money/10;
		money = money%10;
		System.out.println("�ʿ�" + result+" ��");
	}
	else if(money > 1) {
		result = money/1;
		money = money%1;
		System.out.println("�Ͽ�" + result+" ��");
	}
	else {
		break;
	}
	
	}
	}
}

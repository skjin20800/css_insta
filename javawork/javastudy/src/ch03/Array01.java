package ch03;

import java.util.concurrent.LinkedBlockingDeque;

public class Array01 {
public static void main(String[] args) {
	//���� ������ �����͵��� ���������� ����ȴ�.
	// ���� : �׼����� ����.
	// ���� : �迭�� ũ�⸦ �ø��ų� ���� �� ����//? ������ �ٿ�ĳ���� ��������
	
	int[] num = new int[3];
	num[0] = 1;
	num[1] = 2;
	num[2] = 3;
	
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);	
	}
	
	num[0] = 50;
	System.out.println(num[0]);
//	ArrayIndexOutOfBoundsException //�迭�� ���̸� �Ѿ �迭�������Ҷ����¿���
//	num[3] = 10;
	//
}
}

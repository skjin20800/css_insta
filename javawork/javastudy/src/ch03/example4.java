package ch03;

import java.util.Scanner;

public class example4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1~99 ������ ������ �Է��Ͻÿ�");
//		int �Է� = sc.nextInt();
		int �Է�2;
		int �Է�2_1;
		int �Է�3;
		int �Է�3_1;

		for (int �Է� = 1; �Է� < 100; �Է�++) {
System.out.println("����" + �Է�);

			�Է�2 = �Է� / 10; // �����ڸ���
			�Է�3 = �Է� % 10; // �����ڸ���
			if(�Է�3%3 ==0 && �Է�2%3 ==0 && �Է�3 != 0 && �Է� >10) {
				System.out.println("�ڼ�¦¦");
				//�����ڸ����� 3�ǹ���̸�, �����ڸ����� 3�ǹ���̴�,
				// �����ڸ����� 0�̾ƴϸ�, �Է¹��� ���ڴ� 10�̻��̴�
			}
			else if(�Է�3%3 ==0 && �Է�3 !=0) {
				System.out.println("�ڼ�¦a");
				//�����ڸ��� /3�� �������� 0�̰�, �����ڸ����� 0�̾ƴҶ�
				// = �����ڸ����� 3�� ���
			}
			else if(�Է�2/3 > 0  && �Է�2%3 ==0) {
				System.out.println("�ڼ�¦b");
				// �����ڸ��� /3�� �����ϰ�, �����ڸ��� /3�� �������� 0�϶� 
				// = �����ڸ����� 3�� ���
			}
			
			
			
//			if (�Է�3 % 3 == 0 && �Է�2 % 3 != 0&&�Է� <10) {
//				System.out.println("�ڼ�¦a");
//			}
//			else if (�Է�2 % 3 == 0 && �Է�3 % 3 != 0) {
//				System.out.println("�ڼ�¦b");}
//			 else if (�Է�3 % 3 == 0 && �Է�2 % 3 == 0) {
//				if (�Է� < 10) {
//					System.out.println("�ڼ�¦");
//				} else {
//					System.out.println("�ڼ�¦¦");
//				}
//			}
		}
	}
}
package ch03;

import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		String str[] = { "����", "����", "��" };
		Scanner input = new Scanner(System.in);
		String user;
		int n = (int) (Math.random() * 3);

		while (true) {
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��! >>");
			user = input.next();
			

			if (str[n].equals(user)) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�");
			} else if (str[n].equals("����") && user.equals("��")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �̰���ϴ�");
			} else if (str[n].equals("����") && user.equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�");
			} else if (str[n].equals("��") && user.equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�");
			} else if (str[n].equals("��") && user.equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �̰���ϴ�");
			} else if (str[n].equals("����") && user.equals("����")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �̰���ϴ�");
			} else if (str[n].equals("����") && user.equals("��")) {
				System.out.print("����� = " + user + ", ��ǻ�� = " + str[n] + ", �����ϴ�");
			} else if (user.equals("�׸�")) {
				System.out.print("������ �����մϴ�...");
				break;
			}

		}
	}
}

package ch03;

import java.util.Scanner;

public class example {
	public static void main(String[] args) {
		String str[] = { "가위", "바위", "보" };
		Scanner input = new Scanner(System.in);
		String user;
		int n = (int) (Math.random() * 3);

		while (true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보! >>");
			user = input.next();
			

			if (str[n].equals(user)) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 비겼습니다");
			} else if (str[n].equals("바위") && user.equals("보")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 이겼습니다");
			} else if (str[n].equals("바위") && user.equals("가위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 졌습니다");
			} else if (str[n].equals("보") && user.equals("바위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 졌습니다");
			} else if (str[n].equals("보") && user.equals("가위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 이겼습니다");
			} else if (str[n].equals("가위") && user.equals("바위")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 이겼습니다");
			} else if (str[n].equals("가위") && user.equals("보")) {
				System.out.print("사용자 = " + user + ", 컴퓨터 = " + str[n] + ", 졌습니다");
			} else if (user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}

		}
	}
}

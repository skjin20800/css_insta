package test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class pixtest {
	private int playerX, playerY, playerY2, playerX3, playerY3, playerX4, playerY4, playerX5, playerY5;
	private int red1, green1, blue1, alpha1;// RGB,투명도 변수 //투명도는 안씀 참고로 넣어놓는거

	private BufferedImage image; // 이미지

	private int x, y; // 필요 좌표

	public pixtest() {
		// 파일경로
//			int x = image.getWidth(null); // 이미지 가로 전체 
//			int y = image.getHeight(null); // 이미지 세로 전체
		try {
			image = ImageIO.read(new File("D:/lightshot/Screenshot_4.png")); //경로
		} catch (IOException e) {
			e.printStackTrace();
		}

		Color color = new Color(image.getRGB(100, 200));// 해당좌표 컬러담기
		alpha1 = color.getAlpha(); // 투명도 저장
		red1 = color.getRed(); // 빨강색 저장
		green1 = color.getGreen();// 초록색 저장
		blue1 = color.getBlue(); // 파랑색 저장
		System.out.println("red : " + red1);
		System.out.println("green1 : " + green1);
		System.out.println("blue1 : " + blue1);
		System.out.println("alpha1 : " + alpha1);
	}

	public static void main(String[] args) {
		new pixtest();
		

	}
}

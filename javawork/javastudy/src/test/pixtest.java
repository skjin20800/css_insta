package test;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class pixtest {
	private int playerX, playerY, playerY2, playerX3, playerY3, playerX4, playerY4, playerX5, playerY5;
	private int red1, green1, blue1, alpha1;// RGB,���� ���� //������ �Ⱦ� ����� �־���°�

	private BufferedImage image; // �̹���

	private int x, y; // �ʿ� ��ǥ

	public pixtest() {
		// ���ϰ��
//			int x = image.getWidth(null); // �̹��� ���� ��ü 
//			int y = image.getHeight(null); // �̹��� ���� ��ü
		try {
			image = ImageIO.read(new File("D:/lightshot/Screenshot_4.png")); //���
		} catch (IOException e) {
			e.printStackTrace();
		}

		Color color = new Color(image.getRGB(100, 200));// �ش���ǥ �÷����
		alpha1 = color.getAlpha(); // ���� ����
		red1 = color.getRed(); // ������ ����
		green1 = color.getGreen();// �ʷϻ� ����
		blue1 = color.getBlue(); // �Ķ��� ����
		System.out.println("red : " + red1);
		System.out.println("green1 : " + green1);
		System.out.println("blue1 : " + blue1);
		System.out.println("alpha1 : " + alpha1);
	}

	public static void main(String[] args) {
		new pixtest();
		

	}
}

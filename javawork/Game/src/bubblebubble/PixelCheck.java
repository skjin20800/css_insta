package bubblebubble;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PixelCheck implements Runnable {
	private int playerX, playerY, playerY2, playerX3, playerY3, playerX4, playerY4, playerY5;
	private int red1, green1, blue1, alpha1;// RGB,���� ����
	private int red2, green2, blue2, alpha2;// RGB,���� ����
	private int red3, green3, blue3, alpha3;// RGB,���� ����
	private int red4, green4, blue4, alpha4;// RGB,���� ����
	

	private BufferedImage image; // �̹���
	private Player player; // �÷��̾� ���ؽ�Ʈ ���
	private BubbleApp bubbleApp; // �÷��̾� ���ؽ�Ʈ ���

	public PixelCheck(Player player, BubbleApp bubbleApp) {
		this.player = player;
		this.bubbleApp = bubbleApp;
		try {
			this.image = ImageIO.read(new File("images/map2428cut.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		while (true) {

			try {
				// ���ϰ��
//				int x = image.getWidth(null); // �̹��� ���� ��ü 
//				int y = image.getHeight(null); // �̹��� ���� ��ü

				playerX = player.getX() + 13;
				playerY = player.getY() + 40;

				playerY2 = player.getY() + 35;

				playerX3 = player.getX();
				playerY3 = player.getY() + 20;

				playerX4 = player.getX() + 26;
				playerY4 = player.getY() + 20;
				;
				

				Color color1 = new Color(image.getRGB(playerX, playerY));// �ش���ǥ �÷����
				Color color2 = new Color(image.getRGB(playerX, playerY2)); // ���� ���� �÷���ǥ //������ �Ǻ�
				Color color3 = new Color(image.getRGB(playerX3, playerY3));// ���� ���� ���� // �Ķ��� �Ǻ�
				Color color4 = new Color(image.getRGB(playerX4, playerY4));// ���� ���� ���� // �Ķ��� �Ǻ�
				

				// alpha = color.getAlpha(); // ���� ����

				red1 = color1.getRed(); // ������ ����
				green1 = color1.getGreen();// �ʷϻ� ����
				blue1 = color1.getBlue(); // �Ķ��� ����

				red2 = color2.getRed(); // ������ ����
				green2 = color2.getGreen();// �ʷϻ� ����
				blue2 = color2.getBlue(); // �Ķ��� ����

				red3 = color3.getRed(); // ������ ����
				green3 = color3.getGreen();// �ʷϻ� ����
				blue3 = color3.getBlue(); // �Ķ��� ����

				red4 = color4.getRed(); // ������ ����
				green4 = color4.getGreen();// �ʷϻ� ����
				blue4 = color4.getBlue(); // �Ķ��� ����


//				System.out.println(" X ��ǥ : " +playerX + " Y ��ǥ : " + playerY); //���� �÷��̾��� ��ġ ���

//				System.out.println("���� : "+red+" ���� : "+ green + "�Ķ� : " + blue); // �������
				if (red1 == 255 && green1 == 255 && blue1 == 255) {
					player.setMoveLockLeft(false);
					player.setMoveLockRight(false);
					player.Gravity = true;
//					System.out.println("���");

				} else if (red1 == 0 && green1 == 0 && blue1 == 0) {
					if (red2 == 0 && green2 == 0 && blue2 == 0) {
						player.setPlayerY(player.getY() - 1);
//						System.out.println("�����̴�");	
					} else {
						player.Gravity = false;
//						System.out.println("������");	
						player.setMoveLockLeft(false);
						player.setMoveLockRight(false);
					}
				} else if (red3 == 0 && green3 == 0 && blue3 == 254) {
					System.out.println("�۷��̴�");
					player.setMoveLockLeft(true);
				} else if (red4 == 0 && green4 == 0 && blue4 == 254) {
					System.out.println("�۷��̴�");
					player.setMoveLockRight(true);
				} else if (red4 == 0 && green4 == 255 && blue4 == 1) {
					System.out.println("�ʷ��̴�");
					player.setMoveLockRight(true);
				}
				else if (red3 == 0 && green3 == 255 && blue3 == 1) {
					System.out.println("�ʷ��̴�");
					player.setMoveLockLeft(true);
				} 

				if (player.getY() < 10) {
					if (player.getStageCount() == 1) {
						player.setPlayerY(600);
						player.setStageCount(2);
						bubbleApp.setImgCount(2);
						bubbleApp.setSize(1440, 692);
						this.image = ImageIO.read(new File("images/map1619cut.jpg"));
					} else if (player.getStageCount() == 2) {
						player.setPlayerY(600);
						player.setStageCount(3);
						bubbleApp.setImgCount(3);
						bubbleApp.setSize(1440, 810);
						this.image = ImageIO.read(new File("images/map810cut.jpg"));
					}
				} else if (player.getY() > 600) {
//					
					if (player.getStageCount() == 2) {
						
						player.setPlayerY(10);
						player.setStageCount(1);
						bubbleApp.setImgCount(1);
						bubbleApp.setSize(1440, 809);
						this.image = ImageIO.read(new File("images/map2428cut.jpg"));
					} else if (player.getStageCount() == 3) {
						player.setPlayerY(50);
						player.setStageCount(2);
						bubbleApp.setImgCount(2);
						bubbleApp.setSize(1440, 692);
						this.image = ImageIO.read(new File("images/map1619cut.jpg"));
					}
				}
				Thread.sleep(1);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

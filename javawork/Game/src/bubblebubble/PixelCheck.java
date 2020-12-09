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
	private int red1, green1, blue1, alpha1;// RGB,투명도 변수
	private int red2, green2, blue2, alpha2;// RGB,투명도 변수
	private int red3, green3, blue3, alpha3;// RGB,투명도 변수
	private int red4, green4, blue4, alpha4;// RGB,투명도 변수
	

	private BufferedImage image; // 이미지
	private Player player; // 플레이어 콘텍스트 담기
	private BubbleApp bubbleApp; // 플레이어 콘텍스트 담기

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
				// 파일경로
//				int x = image.getWidth(null); // 이미지 가로 전체 
//				int y = image.getHeight(null); // 이미지 세로 전체

				playerX = player.getX() + 13;
				playerY = player.getY() + 40;

				playerY2 = player.getY() + 35;

				playerX3 = player.getX();
				playerY3 = player.getY() + 20;

				playerX4 = player.getX() + 26;
				playerY4 = player.getY() + 20;
				;
				

				Color color1 = new Color(image.getRGB(playerX, playerY));// 해당좌표 컬러담기
				Color color2 = new Color(image.getRGB(playerX, playerY2)); // 벽뚫 방지 컬러좌표 //검은색 판별
				Color color3 = new Color(image.getRGB(playerX3, playerY3));// 벽뚫 방지 좌측 // 파란색 판별
				Color color4 = new Color(image.getRGB(playerX4, playerY4));// 벽뚫 방지 우측 // 파란색 판별
				

				// alpha = color.getAlpha(); // 투명도 저장

				red1 = color1.getRed(); // 빨강색 저장
				green1 = color1.getGreen();// 초록색 저장
				blue1 = color1.getBlue(); // 파랑색 저장

				red2 = color2.getRed(); // 빨강색 저장
				green2 = color2.getGreen();// 초록색 저장
				blue2 = color2.getBlue(); // 파랑색 저장

				red3 = color3.getRed(); // 빨강색 저장
				green3 = color3.getGreen();// 초록색 저장
				blue3 = color3.getBlue(); // 파랑색 저장

				red4 = color4.getRed(); // 빨강색 저장
				green4 = color4.getGreen();// 초록색 저장
				blue4 = color4.getBlue(); // 파랑색 저장


//				System.out.println(" X 좌표 : " +playerX + " Y 좌표 : " + playerY); //현재 플레이어의 위치 출력

//				System.out.println("빨강 : "+red+" 연두 : "+ green + "파랑 : " + blue); // 색깔출력
				if (red1 == 255 && green1 == 255 && blue1 == 255) {
					player.setMoveLockLeft(false);
					player.setMoveLockRight(false);
					player.Gravity = true;
//					System.out.println("흰색");

				} else if (red1 == 0 && green1 == 0 && blue1 == 0) {
					if (red2 == 0 && green2 == 0 && blue2 == 0) {
						player.setPlayerY(player.getY() - 1);
//						System.out.println("깜장이당");	
					} else {
						player.Gravity = false;
//						System.out.println("검은색");	
						player.setMoveLockLeft(false);
						player.setMoveLockRight(false);
					}
				} else if (red3 == 0 && green3 == 0 && blue3 == 254) {
					System.out.println("퍼랭이다");
					player.setMoveLockLeft(true);
				} else if (red4 == 0 && green4 == 0 && blue4 == 254) {
					System.out.println("퍼랭이다");
					player.setMoveLockRight(true);
				} else if (red4 == 0 && green4 == 255 && blue4 == 1) {
					System.out.println("초랭이다");
					player.setMoveLockRight(true);
				}
				else if (red3 == 0 && green3 == 255 && blue3 == 1) {
					System.out.println("초랭이다");
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

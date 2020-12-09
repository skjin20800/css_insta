package bubblebubble;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import lombok.Data;

public class BubbleApp extends JFrame implements Initable {

	// 컨텍스트 저장
	private BubbleApp bubbleApp = this; // 버블 컨텍스트 남기기
	// 태그
	private static final String TAG = "JumpKing : ";

	public Player player; // 플레이어
	private Thread thPixel; // 픽셀검사
	private BgJumpKing bgPanel; // 백그라운드
	private String bgImageURL;
	
	private ImageIcon[] icon = {null, new ImageIcon("images/map2428cut.jpg"), new ImageIcon("images/map1619cut.jpg"), new ImageIcon("images/map810cut.jpg")};
	private int imgCount = 1;
	private Image img = icon[imgCount].getImage(); // 이미지 객체
	
	

	public BubbleApp() {
		init(); // 생성 객체모음
		setting(); // 셋팅 모음
		batch(); // 배치 모음
		listener(); // 리스너 모음
		setVisible(true);
		
	}

	class BgJumpKing extends JLabel implements Runnable{
		

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0, 0, this);
			
		}
		
		public BgJumpKing() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
									
					img = icon[imgCount].getImage();
					repaint();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		}).start();
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		

		
	}

	@Override
	public void init() {
		
		player = new Player();
		bgPanel = new BgJumpKing();
		thPixel = new Thread(new PixelCheck(player,bubbleApp)); // 색깔 연산 스레드
		thPixel.start();

	}

	@Override
	public void setting() {
		setTitle("버블버블");
		setSize(1800, 3036);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(bgPanel); // 기본 컨텐트페인 = 라벨 백그라운드
	}

	@Override
	public void batch() {
		add(player);
	}

	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {

				if (player.isMoveLock() == true) { // Move락이 걸려있으면 메서드실행안됨
					return;
				}

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // 오른쪽 이동
					player.setJumpUpDirectionStay(true); // 제자리 점프시 우측 방향 설정 (우측 이미지 때문에 사용)
					player.moveRight();
//					System.out.println(player.getPlayerX() +" a "+ player.getPlayerY());
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT ) { // 왼쪽이동
					player.setJumpUpDirectionStay(false); // 제자리 점프시 좌측 방향 설정 (좌측 이미지 때문에 사용)
					player.moveLeft();
				} else if (e.getKeyCode() == KeyEvent.VK_UP && player.isLeft() == true) { // 좌측 위 점프
					player.setJumpUpDirection(-1);// 좌측 방향값 설정
					player.jumpUp();
				} else if (e.getKeyCode() == KeyEvent.VK_UP && player.isRight() == true) { // 우측 위 점프
					player.setJumpUpDirection(1); // 우측 방향값 설정
					player.jumpUp();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {// 제자리 점프
					player.jumpUp();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) { // 버튼땔때 멈추는 함수
				if (e.getKeyCode() == KeyEvent.VK_UP) // UP버튼 연속입력 방지
					player.setUp(false);
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) // 좌,우이동 매끄러운 변환 조건문
					player.setRight(false);
				else if (e.getKeyCode() == KeyEvent.VK_LEFT)
					player.setLeft(false);
			}
		});
		
	}

	
	




	public int getImgCount() {
		return imgCount;
	}

	public void setImgCount(int imgCount) {
		this.imgCount = imgCount;
	}

	public static void main(String[] args) {
		new BubbleApp();

	}

}

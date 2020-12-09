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

	// ���ؽ�Ʈ ����
	private BubbleApp bubbleApp = this; // ���� ���ؽ�Ʈ �����
	// �±�
	private static final String TAG = "JumpKing : ";

	public Player player; // �÷��̾�
	private Thread thPixel; // �ȼ��˻�
	private BgJumpKing bgPanel; // ��׶���
	private String bgImageURL;
	
	private ImageIcon[] icon = {null, new ImageIcon("images/map2428cut.jpg"), new ImageIcon("images/map1619cut.jpg"), new ImageIcon("images/map810cut.jpg")};
	private int imgCount = 1;
	private Image img = icon[imgCount].getImage(); // �̹��� ��ü
	
	

	public BubbleApp() {
		init(); // ���� ��ü����
		setting(); // ���� ����
		batch(); // ��ġ ����
		listener(); // ������ ����
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
		thPixel = new Thread(new PixelCheck(player,bubbleApp)); // ���� ���� ������
		thPixel.start();

	}

	@Override
	public void setting() {
		setTitle("�������");
		setSize(1800, 3036);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(bgPanel); // �⺻ ����Ʈ���� = �� ��׶���
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

				if (player.isMoveLock() == true) { // Move���� �ɷ������� �޼������ȵ�
					return;
				}

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) { // ������ �̵�
					player.setJumpUpDirectionStay(true); // ���ڸ� ������ ���� ���� ���� (���� �̹��� ������ ���)
					player.moveRight();
//					System.out.println(player.getPlayerX() +" a "+ player.getPlayerY());
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT ) { // �����̵�
					player.setJumpUpDirectionStay(false); // ���ڸ� ������ ���� ���� ���� (���� �̹��� ������ ���)
					player.moveLeft();
				} else if (e.getKeyCode() == KeyEvent.VK_UP && player.isLeft() == true) { // ���� �� ����
					player.setJumpUpDirection(-1);// ���� ���Ⱚ ����
					player.jumpUp();
				} else if (e.getKeyCode() == KeyEvent.VK_UP && player.isRight() == true) { // ���� �� ����
					player.setJumpUpDirection(1); // ���� ���Ⱚ ����
					player.jumpUp();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {// ���ڸ� ����
					player.jumpUp();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) { // ��ư���� ���ߴ� �Լ�
				if (e.getKeyCode() == KeyEvent.VK_UP) // UP��ư �����Է� ����
					player.setUp(false);
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) // ��,���̵� �Ų����� ��ȯ ���ǹ�
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

package bubblebubble;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleApp extends JFrame implements Initable {

	// 컨텍스트 저장
	private BubbleApp bubbleApp = this; // 버블 컨텍스트 남기기
	// 태그
	private static final String TAG = "BubbleApp : ";
	private JLabel laBackground;
	private Player player;
	private boolean test = true;

	public BubbleApp() {
		init();
		setting();
		batch();
		listener();

		System.out.println(TAG + "이 부분 실행되나?");

		setVisible(true);
	}

	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("images/bg.png"));
		player = new Player();
	}

	@Override
	public void setting() {
		setTitle("버블버블");
		setSize(1000, 639);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(laBackground); // 기본 컨텐트페인 = 라벨 백그라운드
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
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					player.moveRight();
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					player.moveLeft();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					player.moveUp();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					player.moveDown();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				player.isRight = false;
				player.isLeft = false;				
			}
		});
	}

	public static void main(String[] args) {
		new BubbleApp();

	}

}

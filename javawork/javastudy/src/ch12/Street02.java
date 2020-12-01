package ch12;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Street02 extends JFrame {
	Street02 street = this; // ³»ºÎ ÄÁÅØ½ºÆ®
	int x = 320;
	int y = 20;
	Thread Ja = new Thread(new JangPong());
	Container c;
	boolean isRunning = true;
	boolean isRunningMain = true;

	public Street02() {
		setTitle("ÀïÇ³");
		setSize(1000, 300);
		setLocationRelativeTo(null);// ¸ð´ÏÅÍ Á¤Áß¾Ó¿¡ Frame ¹èÄ¡
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();

		c.add(new GamePanel());

		setVisible(true);

	}

	// JPanelÀº ±âº»À¸ Flowlayout
	class GamePanel extends JPanel {

		ImageIcon imgIconPlayer, imgIconJang;
		Image imgPlayer, imgJang;
		JButton btn_1, btn_2;

		public GamePanel() {
			imgIconPlayer = new ImageIcon("images/player.png");
			imgIconJang = new ImageIcon("images/jang.png");
			imgPlayer = imgIconPlayer.getImage();
			imgJang = imgIconJang.getImage();
			btn_1 = new JButton("¸ØÃã,ÀüÁø");
			btn_2 = new JButton("´Ù½Ã ½î±â"); 
			add(btn_1);
			add(btn_2);

			btn_1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					isRunning = !isRunning;

				}
			});

			btn_2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					x = 320;
					Ja.start();
					repaint();
				}
			});
			setFocusable(true);

			addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("xÁÂÇ¥ :" + x + "y ÁÂÇ¥" + y);
					if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_RIGHT) {
						isRunning = true;
						Ja.start();
					}
					repaint();
				}
			});
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(imgPlayer, 0, 0, null);
			g.drawImage(imgJang, x, y, null);
		}
	}

	class JangPong implements Runnable {
		@Override
		public void run() {
			while (isRunningMain == true) {
				System.out.println(isRunning);
				if(x > 800)
					isRunningMain = false;
				while (isRunning == true) {

					try {
						x = x + 10;
						repaint();
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}

	}

	public static void main(String[] args) {
		new Street02();

	}
}

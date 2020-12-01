package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	public Player player = this;
	public final static String TAG = "Player";
	public ImageIcon icPlayerR, icPlayerL;
	public int x = 55;
	public int y = 535;
	public boolean isRight = false;
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int floor = 1; //535 415, 295, 177 1층,2층,3층,4층
	
	public Player() {
		icPlayerR = new ImageIcon("images/playerR.png");
		icPlayerL = new ImageIcon("images/playerL.png");
		setIcon(icPlayerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void moveRight() {
		System.out.println(TAG + "moveRight()");
		if(isRight == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isRight = true;
					setIcon(icPlayerR);
						while (isRight == true) {
							try {
							x = x+10;
							setLocation(x, y); // 내부에 repaint() 존재
								Thread.sleep(10);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}									
				}
			}).start();
		}	
	}
	public void moveLeft() {
		System.out.println(TAG + "moveRight()");
		if(isLeft == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isLeft = true;
					setIcon(icPlayerL);
						while (isLeft == true) {
							try {
							x = x-10;
							setLocation(x, y); // 내부에 repaint() 존재
								Thread.sleep(10);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}									
				}
			}).start();
		}	
	}
	public void moveUp() {
		System.out.println(TAG + "moveUp()");
		if(isUp == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isUp = true;
					int jumpLimit = 0;
						while (isUp == true) {
							try {
							y = y-10;
							setLocation(x, y); // 내부에 repaint() 존재
								Thread.sleep(10);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							jumpLimit++;
							if (jumpLimit > 20) {
								jumpLimit = 0;
								break;
							}
						}									
						moveDown();
				}
			}).start();
		}	
		}	
	public void moveDown() {
		System.out.println(TAG + "moveDown()");
		if(isDown == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isDown = true;
						while (isDown) {
							y = y+10;
							setLocation(x, y); // 내부에 repaint() 존재
								if(floor == 1 && /**/ y > 535) {
									isDown = false;
									isUp = false;
									break;
								}
								try {
									Thread.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}									
				}
			}).start();
		}	
	}

	// 구현안함
	public void attack() {

	}

}

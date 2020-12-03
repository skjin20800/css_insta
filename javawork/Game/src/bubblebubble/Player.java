package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	public Player player = this;
	public final static String TAG = "Player";
	public ImageIcon icPlayerR, icPlayerL, icJumpR1, icJumpR2, icJumpR3, icJumpR4;
	public int x = 55;
	public int y = 535;
	public boolean isRight = false;
	public boolean isLeft = false;
	public boolean isUp = false;
	public boolean isDown = false;
	public int jumpGauge = 0;
	public int jumpGauge_Down = 0;

	public int floor = 1; // 535 415, 295, 177 1층,2층,3층,4층

	public Player() {
		icPlayerR = new ImageIcon("images/playerR.png");
		icJumpR1 = new ImageIcon("images/icJumpR1.png");
		icJumpR2 = new ImageIcon("images/icJumpR2.png");
		icJumpR3 = new ImageIcon("images/icJumpR3.png");
		icJumpR4 = new ImageIcon("images/icJumpR4.png");
		icPlayerL = new ImageIcon("images/playerL.png");

		setIcon(icPlayerR);
		setSize(50, 50);
		setLocation(x, y);

	}

	public void moveRight() {
//		System.out.println(TAG + "moveRight()");
		System.out.println(isRight);
		Thread rightTh = new Thread(new RightMove());
		if (isRight == false) {
			rightTh.start();
		}
	}

	public void moveLeft() {
		System.out.println(TAG + "moveLeft()");
		System.out.println(isLeft);
		Thread leftTh = new Thread(new LeftMove());
		if (isLeft == false) {
			leftTh.start();
		}
	}

	public void moveUp() {
		Thread upTh = new Thread(new UpMove());
		if (isUp == false) {
			upTh.start();
		}
	}

	public void moveUpLeft() {

	}

	public void moveUpRight() {
		if (isUp == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("moveUpRight@@@@@@@");
					isUp = true;
					isRight = false;
					isLeft = false;
					setIcon(icJumpR1);
					while (isUp == true) {
						try {
							if (jumpGauge > -300) {
								jumpGauge = jumpGauge - 5;
							}
							Thread.sleep(10);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					setIcon(icJumpR2);
					jumpGauge = jumpGauge + y;
					while (true) {
						try {
							y = y - 5;
							x = x + 3;
							setLocation(x, y); // 내부에 repaint() 존재
							if (jumpGauge + 150 < y) {
								// jumpGauge = 235
								// y = 535
								// y가 435보다 크면
								System.out.println("A1");
								Thread.sleep(2);
							} else if (jumpGauge + 100 < y && jumpGauge + 150 >= y) {
								System.out.println("A2");
								Thread.sleep(7);
							} else if (jumpGauge < y && jumpGauge + 100 >= y) {
								System.out.println("A3");
								Thread.sleep(10);
							}

						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if (jumpGauge > y) {
							jumpGauge_Down = jumpGauge;
							jumpGauge = 0;
							break;
						}
					}
					moveDownRight();
				}
			}).start();
		}
	}

	public void moveDownRight() {
		System.out.println(TAG + "moveDown()");
		if (isDown == false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isDown = true;
					setIcon(icJumpR3);
					while (isDown) {
						y = y + 5;
						x = x + 3;
						setLocation(x, y); // 내부에 repaint() 존재
						if (floor == 1 && /**/ y > 535) {
							isDown = false;
							isUp = false;
							break;
						}
						try {
							if (jumpGauge_Down + 150 < y) {
								// jumpGauge = 235
								// y = 535
								// y가 435보다 크면
								System.out.println("B1");
								Thread.sleep(3);
							} else if (jumpGauge_Down + 100 < y && jumpGauge_Down + 150 >= y) {
								System.out.println("B2");
								Thread.sleep(7);
							} else if (jumpGauge_Down < y && jumpGauge_Down + 100 >= y) {
								System.out.println("B3");
								Thread.sleep(10);
							}

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					setIcon(icJumpR4);
				}
			}).start();
		}
	}

	public void moveDown() {
		System.out.println(TAG + "moveDown()");
		
			Thread downTh = new Thread(new DownMove());
			if (isDown == false) {
				downTh.start();
			}
		}
	

	class RightMove implements Runnable {

		@Override
		public void run() {
			isLeft = false;
			isRight = true;
			setIcon(icPlayerR);
			while (isRight == true) {
				try {
					x = ++x;
					setLocation(x, y); // 내부에 repaint() 존재
					Thread.sleep(2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class LeftMove implements Runnable {
		@Override
		public void run() {
			isLeft = true;
			isRight = false;
			setIcon(icPlayerL);
			while (isLeft == true) {
				try {
					x = --x;
					setLocation(x, y); // 내부에 repaint() 존재
					Thread.sleep(2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class UpMove implements Runnable {
		@Override
		public void run() {
			isUp = true;
			isRight = false;
			isLeft = false;
			setIcon(icJumpR1);
			while (isUp == true) {
				try {
					if (jumpGauge > -300) {
						jumpGauge = jumpGauge - 5;
					}
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			jumpGauge = jumpGauge + y;
			System.out.println("testY2 :" + jumpGauge);
			while (true) {
				try {
					y = y - 5;
					setLocation(x, y); // 내부에 repaint() 존재
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (jumpGauge > y) {
					jumpGauge = 0;
					break;
				}
			}
			moveDown();
		}
	}

	class DownMove implements Runnable {
		@Override
		public void run() {
			isDown = true;
			while (isDown) {
				y = y + 10;
				setLocation(x, y); // 내부에 repaint() 존재
				if (floor == 1 && /**/ y > 535) {
					isDown = false;
					isUp = false;
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}
	}

}

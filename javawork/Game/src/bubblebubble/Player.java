package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	public Player player = this; //�÷��̾� ���ؽ�Ʈ
	public final static String TAG = "Player"; //�±�
	public ImageIcon icPlayerLS, icPlayerRS, icPlayerLR, icPlayerRR; //��,�� �̵� �̹���
	public ImageIcon icJumpR1, icJumpR2, icJumpR3, icJumpR4; //�� ���� �̹���
	public ImageIcon icJumpL1, icJumpL2, icJumpL3, icJumpL4; //�� ���� �̹���
	public int playerX = 100; //ĳ���� �⺻ ���� X��
	public int playerY = 100; // ĳƽ�� �⺻ ���� Y��
	
	//true�϶��� �̵�����
	public boolean isRight = false; // �����̵�
	public boolean isLeft = false; // �����̵�
	public boolean isUp = false; // ���� -�� �̵�
	public boolean isDown = false; //���� - �Ʒ� �̵�
	
	public int jumpGauge = 0; // �Ŀ� ���� (����� ��) (���� ������ ���)
	public int jumpGauge_Down = 0; //(�Ʒ��� ������ ���)
	public int jumpUpDirection = 0;  //(��,�� ������ �������� ����)
	public int jumpUpDirectionStay = 0; //(���ڸ� ������ ��,�� �̹�������� ����)
	public int moveLock = 0; //������ �������̰� Lock�Ŵ� ����
	public int moveDown = 1; //���� 1�̸� �������� 0�̸� �ȶ�������
	public int floor = 1; // 535 415, 295, 177 1��,2��,3��,4��

	public Player() {
		//���� �̹���
		icPlayerRS = new ImageIcon("images/icPlayerRS.png"); //�̵�-������
		icPlayerRR = new ImageIcon("images/icPlayerRR.png"); //�̵�-��
		icJumpR1 = new ImageIcon("images/icJumpR1.png"); // ����1 ���ڸ�
		icJumpR2 = new ImageIcon("images/icJumpR2.png");// ����2 ����
		icJumpR3 = new ImageIcon("images/icJumpR3.png");// ����3 ����
		icJumpR4 = new ImageIcon("images/icJumpR4.png");// ����4 ����
		
		//���� �̹���
		icPlayerLS = new ImageIcon("images/icPlayerLS.png");//�̵�- ������
		icPlayerLR = new ImageIcon("images/icPlayerLR.png");//�̵�- ��
		icJumpL1 = new ImageIcon("images/icJumpL1.png");// ����1 ���ڸ�
		icJumpL2 = new ImageIcon("images/icJumpL2.png");// ����2 ����
		icJumpL3 = new ImageIcon("images/icJumpL3.png");// ����3 ����
		icJumpL4 = new ImageIcon("images/icJumpL4.png");// ����4 ����

		Thread thDown = new Thread(new DownMove());
		thDown.start();
		setIcon(icPlayerRS);
		setSize(50, 50); //������� ũ��
		setLocation(playerX, playerY); //�⺻ ������ġ

	}

	public void moveRight() {
		Thread rightTh = new Thread(new RightMove()); //������ �̵� ������
		if (isRight == false) { //moveRight() �ѹ��� �����ϴ� ���ǹ� // moveLeft(),JumpUp(),JumpDown() ����
			System.out.println(TAG + "moveRight()");
			rightTh.start();
		}
		setIcon(icPlayerRS);
	}

	public void moveLeft() {
		Thread leftTh = new Thread(new LeftMove()); //�����̵� ������
		if (isLeft == false) {
			System.out.println(TAG + "moveLeft()");
			leftTh.start();
		}
		setIcon(icPlayerLS);
	}

	public void JumpUp() {
		Thread thJumpUp = new Thread(new ThJumpUp());
		if (isUp == false) {
			System.out.println(TAG + "JumpUp()");
			thJumpUp.start();
		}
	}
	public void JumpDown() {
			Thread thJumpDown = new Thread(new ThJumpDown());
			if (isDown == false) {
				System.out.println(TAG + "JumpDown()");
				thJumpDown.start();
			}
		}
	

	class RightMove implements Runnable { // Leftmove()�� ���Ǻ��

		@Override
		public void run() {
			// ��, �� �̵������ �ε巴�� �ϱ����� �ٽ��ѹ� ����
			isLeft = false; //�����̵� false
			isRight = true; //�������̵� true
			
			while (isRight == true) {
				try {
					playerX = playerX+10; //�����̵��� �ѹ��� x�� 10������
					setLocation(playerX, playerY); // ���ο� repaint() ����
					
					//�����ð����� �̹��� ���� ��,��,������,�����ٿ� ��� ����
					Thread.sleep(5); 
					setIcon(icPlayerRR); 
					Thread.sleep(5);
					setIcon(icPlayerRS);
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
			
			while (isLeft == true) {
				try {
					playerX = playerX -10;
					setLocation(playerX, playerY); // ���ο� repaint() ����
					Thread.sleep(5);
					setIcon(icPlayerLR);
					Thread.sleep(5);
					setIcon(icPlayerLS);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	
	class DownMove implements Runnable {
		@Override
		public void run() {
			while (true) {
				try {
					if(moveLock  !=1) {
						if(((playerY > 530 && playerY < 550) ||
								((playerY > 410 && playerY < 420)|| //295, 177
										(playerY > 295 && playerY < 315)||
										(playerY > 175 && playerY < 200))&&( playerX  < 100 || playerX >200)) 	
								) {
							isDown = false; //�ٿ� ����
							isUp = false; // �� ����
							moveDown=0;
												
								if(jumpUpDirection >= 1) { // �� ���� ���� �̹���
									setIcon(icJumpR4);
								}else if(jumpUpDirection <= -1) { //�� ���� ���� �̹��� 
									setIcon(icJumpL4);
								}else if(jumpUpDirectionStay == 1) { //�� ���ڸ� ���� ���� �̹���
									setIcon(icJumpR4);
								}else if(jumpUpDirectionStay == -1) {//�� ���ڸ� ���� ���� �̹���
									setIcon(icJumpL4);
								}	
								jumpUpDirection = 0; //���� �ʱ�ȭ
							
						}else {
							moveDown =1;
						}
					}
					
					if(moveDown == 1) {
						isRight = false; //�� �̵��Ұ���
						isLeft = false;// �� �̵� �Ұ���
						if(jumpUpDirection == 1) { //���� ������ �������ΰ��� ���ǹ�
							playerY = playerY + 4;
							setIcon(icJumpR2);
						}else if(jumpUpDirection == -1) { //���� ������ �������ΰ��� ���ǹ�
							playerY = playerY +4;
							setIcon(icJumpL2);
						}else if(jumpUpDirectionStay == 1) { //���������� ���ڸ������� ������ icJumpR2�����ܻ��
							playerY = playerY +4;
							setIcon(icJumpR2);
						}else if(jumpUpDirectionStay == -1) { //���������� ���ڸ������� ������ icJumpR2�����ܻ��
							playerY = playerY +4;
							setIcon(icJumpL2);
						}
					}
			
					setLocation(playerX, playerY); // ���ο� repaint() ����
	
					Thread.sleep(5);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}

			
		}
	}
	
	
	class ThJumpUp implements Runnable {
		@Override
		public void run() {
			moveLock = 1; //������ ��,���̵�  �Ұ���
			isUp = true; // ���� ����
			isRight = false; // �������̵� �Ұ���
			isLeft = false; // ���� �̵� �Ұ���
			
			while (isUp == true) {
				setIcon(icJumpR1); 
				try {
					if (jumpGauge > -300) { //��(�Ŀ�)�� 300�̻��̸� ���̻� �����
						jumpGauge = jumpGauge - 5; // �ѹ��� 5�� ����������
					}
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			jumpGauge = jumpGauge + playerY;
			
			
			while (true) {
				try {
					isRight = false; //�� �̵��Ұ���
					isLeft = false;// �� �̵� �Ұ���
					if(jumpUpDirection == 1) { //���� ������ �������ΰ��� ���ǹ�
						playerX = playerX + 4;	
						setIcon(icJumpR2);
					}else if(jumpUpDirection == -1) { //���� ������ �������ΰ��� ���ǹ�
						playerX = playerX - 4;
						setIcon(icJumpL2);
					}else if(jumpUpDirectionStay == 1) { //���������� ���ڸ������� ������ icJumpR2�����ܻ��
						setIcon(icJumpR2);
					}else if(jumpUpDirectionStay == -1) { //���������� ���ڸ������� ������ icJumpR2�����ܻ��
						setIcon(icJumpL2);
					}
					setLocation(playerX, playerY); // ���ο� repaint() ����
					if (jumpGauge + 100 < playerY) {//������ó�� �̵��ϴ� ���ǹ�
						playerY = playerY - 5;
						// jumpGauge �ִ� = 235
						// playerY = 535
						//���� �б�1 ���� �� �κ�
					} else if (jumpGauge + 30 < playerY && jumpGauge + 100 >= playerY) {
						playerY = playerY - 3;
						//���� �б�2 �߾� �κ�
					} else if (jumpGauge < playerY && jumpGauge + 30 >= playerY) {
						playerY = playerY - 1;
						//���� �б�3 ���� �� �κ�
					}
					Thread.sleep(5);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (jumpGauge >= playerY) {//�ִ� ���� ���޽� �Լ�����
					jumpGauge_Down = jumpGauge; // Down���� ������ �Ѱ���
					jumpGauge = 0; // ���������� 0���� �ʱ�ȭ
					break;
				}
			}
			JumpDown(); //�ٿ� �޼��� ȣ��
		}
	}

	class ThJumpDown implements Runnable {
		@Override
		public void run() {
			isDown = true; //�ٿ� ���
			while (isDown) {
				setLocation(playerX, playerY); // ���ο� repaint() ����
				try {
					isRight = false;
					isLeft = false;
					if(jumpUpDirection == 1) { //�����ٿ�� x������
						setIcon(icJumpR3);
						playerX = playerX + 4;	
					}else if(jumpUpDirection == -1) { //�������ٿ�� x�� ����
						setIcon(icJumpL3);
						playerX = playerX - 4;
					}else if(jumpUpDirectionStay == 1) { //�������� ���ڸ��ٱ�� �̹���
						setIcon(icJumpR3);
					}else if(jumpUpDirectionStay == -1) {//�������� ���ڸ��ٱ�� �̹���
						setIcon(icJumpL3);
					}	
					if (jumpGauge_Down + 100 < playerY) {
						playerY = playerY + 5;
						//���� �б�6 ���� �� �κ�
					} else if (jumpGauge_Down + 30 < playerY && jumpGauge_Down + 100 >= playerY) {
						playerY = playerY + 3;			
						//���� �б�5 �߰�
					} else if (jumpGauge_Down + 30 >= playerY) {
						playerY = playerY + 1;						
						//���� �б�4 ���� �� �κ�
					}
					
					
					if(((playerY > 530 && playerY < 550) ||
							((playerY > 410 && playerY < 420)|| //295, 177
									(playerY > 295 && playerY < 315)||
									(playerY > 175 && playerY < 200))&&( playerX  < 100 || playerX >200)) 	
							){ // Ư������ ���޽� ����
							isDown = false; //�ٿ� ����
							isUp = false; // �� ����
							if(jumpUpDirection >= 1) { // �� ���� ���� �̹���
								setIcon(icJumpR4);
							}else if(jumpUpDirection <= -1) { //�� ���� ���� �̹��� 
								setIcon(icJumpL4);
							}else if(jumpUpDirectionStay == 1) { //�� ���ڸ� ���� ���� �̹���
								setIcon(icJumpR4);
							}else if(jumpUpDirectionStay == -1) {//�� ���ڸ� ���� ���� �̹���
								setIcon(icJumpL4);
							}	
							jumpUpDirection = 0; //���� �ʱ�ȭ
							moveLock =0; // ������ ������ �ٽ� �̵��Ҽ��ְ� Lock����
							break;
						}
					
					
					Thread.sleep(5);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	
	
	
//	void line(int x1, int y1, int x2, int y2) {
//		
//	}
}

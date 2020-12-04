package bubblebubble;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	public Player player = this; //플레이어 콘텍스트
	public final static String TAG = "Player"; //태그
	public ImageIcon icPlayerLS, icPlayerRS, icPlayerLR, icPlayerRR; //좌,우 이동 이미지
	public ImageIcon icJumpR1, icJumpR2, icJumpR3, icJumpR4; //우 점프 이미지
	public ImageIcon icJumpL1, icJumpL2, icJumpL3, icJumpL4; //좌 점프 이미지
	public int playerX = 100; //캐릭터 기본 시작 X축
	public int playerY = 100; // 캐틱터 기본 시작 Y축
	
	//true일때만 이동가능
	public boolean isRight = false; // 우측이동
	public boolean isLeft = false; // 좌측이동
	public boolean isUp = false; // 점프 -위 이동
	public boolean isDown = false; //점프 - 아래 이동
	
	public int jumpGauge = 0; // 파워 변수 (기모우는 것) (위로 점프시 사용)
	public int jumpGauge_Down = 0; //(아래로 점프시 사용)
	public int jumpUpDirection = 0;  //(좌,우 점프시 방향지정 변수)
	public int jumpUpDirectionStay = 0; //(제자리 점프시 좌,우 이미지저장용 변수)
	public int moveLock = 0; //점프시 못움직이게 Lock거는 변수
	public int moveDown = 1; //값이 1이면 떨어지고 0이면 안떨어진다
	public int floor = 1; // 535 415, 295, 177 1층,2층,3층,4층

	public Player() {
		//우측 이미지
		icPlayerRS = new ImageIcon("images/icPlayerRS.png"); //이동-가만히
		icPlayerRR = new ImageIcon("images/icPlayerRR.png"); //이동-뜀
		icJumpR1 = new ImageIcon("images/icJumpR1.png"); // 점프1 제자리
		icJumpR2 = new ImageIcon("images/icJumpR2.png");// 점프2 점프
		icJumpR3 = new ImageIcon("images/icJumpR3.png");// 점프3 낙하
		icJumpR4 = new ImageIcon("images/icJumpR4.png");// 점프4 착지
		
		//좌측 이미지
		icPlayerLS = new ImageIcon("images/icPlayerLS.png");//이동- 가만히
		icPlayerLR = new ImageIcon("images/icPlayerLR.png");//이동- 뜀
		icJumpL1 = new ImageIcon("images/icJumpL1.png");// 점프1 제자리
		icJumpL2 = new ImageIcon("images/icJumpL2.png");// 점프2 점프
		icJumpL3 = new ImageIcon("images/icJumpL3.png");// 점프3 낙하
		icJumpL4 = new ImageIcon("images/icJumpL4.png");// 점프4 착지

		Thread thDown = new Thread(new DownMove());
		thDown.start();
		setIcon(icPlayerRS);
		setSize(50, 50); //버블버블 크기
		setLocation(playerX, playerY); //기본 시작위치

	}

	public void moveRight() {
		Thread rightTh = new Thread(new RightMove()); //오른쪽 이동 스레드
		if (isRight == false) { //moveRight() 한번만 실행하는 조건문 // moveLeft(),JumpUp(),JumpDown() 동일
			System.out.println(TAG + "moveRight()");
			rightTh.start();
		}
		setIcon(icPlayerRS);
	}

	public void moveLeft() {
		Thread leftTh = new Thread(new LeftMove()); //왼쪽이동 스레드
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
	

	class RightMove implements Runnable { // Leftmove()랑 거의비슷

		@Override
		public void run() {
			// 좌, 우 이동변경시 부드럽게 하기위해 다시한번 설정
			isLeft = false; //왼쪽이동 false
			isRight = true; //오른쪽이동 true
			
			while (isRight == true) {
				try {
					playerX = playerX+10; //우츨이동시 한번에 x값 10씩증가
					setLocation(playerX, playerY); // 내부에 repaint() 존재
					
					//일정시간마다 이미지 변경 좌,우,점프업,점프다운 모두 동일
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
					setLocation(playerX, playerY); // 내부에 repaint() 존재
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
							isDown = false; //다운 금지
							isUp = false; // 업 금지
							moveDown=0;
												
								if(jumpUpDirection >= 1) { // 우 점프 착지 이미지
									setIcon(icJumpR4);
								}else if(jumpUpDirection <= -1) { //좌 점프 착지 이미지 
									setIcon(icJumpL4);
								}else if(jumpUpDirectionStay == 1) { //우 제자리 점프 착지 이미지
									setIcon(icJumpR4);
								}else if(jumpUpDirectionStay == -1) {//좌 제자리 점프 착지 이미지
									setIcon(icJumpL4);
								}	
								jumpUpDirection = 0; //방향 초기화
							
						}else {
							moveDown =1;
						}
					}
					
					if(moveDown == 1) {
						isRight = false; //우 이동불가능
						isLeft = false;// 좌 이동 불가능
						if(jumpUpDirection == 1) { //우측 점프시 우측으로가는 조건문
							playerY = playerY + 4;
							setIcon(icJumpR2);
						}else if(jumpUpDirection == -1) { //좌측 점프시 좌측으로가는 조건문
							playerY = playerY +4;
							setIcon(icJumpL2);
						}else if(jumpUpDirectionStay == 1) { //우측을보며 제자리점프시 아이콘 icJumpR2아이콘사용
							playerY = playerY +4;
							setIcon(icJumpR2);
						}else if(jumpUpDirectionStay == -1) { //좌측을보며 제자리점프시 아이콘 icJumpR2아이콘사용
							playerY = playerY +4;
							setIcon(icJumpL2);
						}
					}
			
					setLocation(playerX, playerY); // 내부에 repaint() 존재
	
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
			moveLock = 1; //점프시 좌,우이동  불가능
			isUp = true; // 업만 가능
			isRight = false; // 오른쪽이동 불가능
			isLeft = false; // 왼쪽 이동 불가능
			
			while (isUp == true) {
				setIcon(icJumpR1); 
				try {
					if (jumpGauge > -300) { //기(파워)가 300이상이면 더이상 못모움
						jumpGauge = jumpGauge - 5; // 한번에 5씩 모을수있음
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
					isRight = false; //우 이동불가능
					isLeft = false;// 좌 이동 불가능
					if(jumpUpDirection == 1) { //우측 점프시 우측으로가는 조건문
						playerX = playerX + 4;	
						setIcon(icJumpR2);
					}else if(jumpUpDirection == -1) { //좌측 점프시 좌측으로가는 조건문
						playerX = playerX - 4;
						setIcon(icJumpL2);
					}else if(jumpUpDirectionStay == 1) { //우측을보며 제자리점프시 아이콘 icJumpR2아이콘사용
						setIcon(icJumpR2);
					}else if(jumpUpDirectionStay == -1) { //좌측을보며 제자리점프시 아이콘 icJumpR2아이콘사용
						setIcon(icJumpL2);
					}
					setLocation(playerX, playerY); // 내부에 repaint() 존재
					if (jumpGauge + 100 < playerY) {//포물선처럼 이동하는 조건문
						playerY = playerY - 5;
						// jumpGauge 최댓값 = 235
						// playerY = 535
						//점프 분기1 제일 밑 부분
					} else if (jumpGauge + 30 < playerY && jumpGauge + 100 >= playerY) {
						playerY = playerY - 3;
						//점프 분기2 중앙 부분
					} else if (jumpGauge < playerY && jumpGauge + 30 >= playerY) {
						playerY = playerY - 1;
						//점프 분기3 제일 윗 부분
					}
					Thread.sleep(5);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (jumpGauge >= playerY) {//최대 높이 도달시 함수종료
					jumpGauge_Down = jumpGauge; // Down에쓸 게이지 넘겨줌
					jumpGauge = 0; // 점프게이지 0으로 초기화
					break;
				}
			}
			JumpDown(); //다운 메서드 호출
		}
	}

	class ThJumpDown implements Runnable {
		@Override
		public void run() {
			isDown = true; //다운 사용
			while (isDown) {
				setLocation(playerX, playerY); // 내부에 repaint() 존재
				try {
					isRight = false;
					isLeft = false;
					if(jumpUpDirection == 1) { //우측다운시 x값증가
						setIcon(icJumpR3);
						playerX = playerX + 4;	
					}else if(jumpUpDirection == -1) { //좌측측다운시 x값 감소
						setIcon(icJumpL3);
						playerX = playerX - 4;
					}else if(jumpUpDirectionStay == 1) { //우측보며 제자리뛰기시 이미지
						setIcon(icJumpR3);
					}else if(jumpUpDirectionStay == -1) {//좌측보며 제자리뛰기시 이미지
						setIcon(icJumpL3);
					}	
					if (jumpGauge_Down + 100 < playerY) {
						playerY = playerY + 5;
						//점프 분기6 제일 밑 부분
					} else if (jumpGauge_Down + 30 < playerY && jumpGauge_Down + 100 >= playerY) {
						playerY = playerY + 3;			
						//점프 분기5 중간
					} else if (jumpGauge_Down + 30 >= playerY) {
						playerY = playerY + 1;						
						//점프 분기4 제일 윗 부분
					}
					
					
					if(((playerY > 530 && playerY < 550) ||
							((playerY > 410 && playerY < 420)|| //295, 177
									(playerY > 295 && playerY < 315)||
									(playerY > 175 && playerY < 200))&&( playerX  < 100 || playerX >200)) 	
							){ // 특정높이 도달시 멈춤
							isDown = false; //다운 금지
							isUp = false; // 업 금지
							if(jumpUpDirection >= 1) { // 우 점프 착지 이미지
								setIcon(icJumpR4);
							}else if(jumpUpDirection <= -1) { //좌 점프 착지 이미지 
								setIcon(icJumpL4);
							}else if(jumpUpDirectionStay == 1) { //우 제자리 점프 착지 이미지
								setIcon(icJumpR4);
							}else if(jumpUpDirectionStay == -1) {//좌 제자리 점프 착지 이미지
								setIcon(icJumpL4);
							}	
							jumpUpDirection = 0; //방향 초기화
							moveLock =0; // 점프가 끝나면 다시 이동할수있게 Lock해제
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

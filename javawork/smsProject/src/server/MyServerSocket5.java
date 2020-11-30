package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import protocol.Chat;

public class MyServerSocket5 {

	private ServerSocket serverSocket;
	Vector<SocketThread> vc;//대기열
	
	public MyServerSocket5() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();
			
			while(true) {
				System.out.println("요청 대기중 ...");
				Socket socket = serverSocket.accept();
				//1. 새로운 소켓 생성 socket
				//2. 새로운 스레드 생성
				//3. 새로운 스레드안에 socket 변수 넘기기
				//4. 새로운 스레드 자체를 vc에 담기
				System.out.println("요청 받음");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
		} catch (Exception e) {
			System.out.println("서버 연결 오류");
			e.printStackTrace(); //오류를 빨간색으로 바꿔줌
		}
	}
	
	
	
	
	class SocketThread extends Thread{
		private Socket socket;
		private String id;
		private PrintWriter writer;
		private BufferedReader reader;
		
		public SocketThread(Socket socket) {
			this.socket = socket;
		}
	


		@Override
		public void run() {
			try {
				reader =
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(),true);
				String input = null;
				while((input = reader.readLine())!=null) {
				routing(input);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		private void routing(String input) {
			String gubun[] = input.split(":");
			
	
			if(this.id == null)  {
				if(gubun[0].equals(Chat.ID)) {
					//변수에 ID저장
					String tempId = gubun[1];
					this.id = tempId;
				}

				for (int i = 0; i < vc.size(); i++) {
					 writer.println("아이디를 입력하세요");
				}
			}
			else {
				writer.println("아이디를 먼저 입력하세요!");
				return ;
			}
			
				if(gubun[0].equals(Chat.ALL)) {
					for (int i = 0; i < vc.size(); i++) {
						if(vc.get(i).getId() != this.getId()) { //자기자신한테는 안보내기
							vc.get(i).writer.println(id+"-->"+gubun[1]);
						}
					}
				} 
				else if(this.id ==null && gubun[0].equals(Chat.MSG)) { // MSG:ssar1:안녕
					String tempId = gubun[1];
					String tempMsg = gubun[2];
					
					for (int i = 0; i < vc.size(); i++) {
						if(vc.get(i).id.equals(tempId)) {
							vc.get(i).writer.println(id+"-->"+tempMsg);
						}
					}
				}
				 else if(gubun[1] == null){
					 writer.println("유효하지 않은 ID입니다.");
							}
						}
				 }
			
	public static void main(String[] args) {
		new MyServerSocket5();
	}
}

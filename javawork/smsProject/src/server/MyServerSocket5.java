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
	Vector<SocketThread> vc;//��⿭
	
	public MyServerSocket5() {
		try {
			serverSocket = new ServerSocket(10000);
			vc = new Vector<>();
			
			while(true) {
				System.out.println("��û ����� ...");
				Socket socket = serverSocket.accept();
				//1. ���ο� ���� ���� socket
				//2. ���ο� ������ ����
				//3. ���ο� ������ȿ� socket ���� �ѱ��
				//4. ���ο� ������ ��ü�� vc�� ���
				System.out.println("��û ����");
				SocketThread st = new SocketThread(socket);
				st.start();
				vc.add(st);
			}
		} catch (Exception e) {
			System.out.println("���� ���� ����");
			e.printStackTrace(); //������ ���������� �ٲ���
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
					//������ ID����
					String tempId = gubun[1];
					this.id = tempId;
				}

				for (int i = 0; i < vc.size(); i++) {
					 writer.println("���̵� �Է��ϼ���");
				}
			}
			else {
				writer.println("���̵� ���� �Է��ϼ���!");
				return ;
			}
			
				if(gubun[0].equals(Chat.ALL)) {
					for (int i = 0; i < vc.size(); i++) {
						if(vc.get(i).getId() != this.getId()) { //�ڱ��ڽ����״� �Ⱥ�����
							vc.get(i).writer.println(id+"-->"+gubun[1]);
						}
					}
				} 
				else if(this.id ==null && gubun[0].equals(Chat.MSG)) { // MSG:ssar1:�ȳ�
					String tempId = gubun[1];
					String tempMsg = gubun[2];
					
					for (int i = 0; i < vc.size(); i++) {
						if(vc.get(i).id.equals(tempId)) {
							vc.get(i).writer.println(id+"-->"+tempMsg);
						}
					}
				}
				 else if(gubun[1] == null){
					 writer.println("��ȿ���� ���� ID�Դϴ�.");
							}
						}
				 }
			
	public static void main(String[] args) {
		new MyServerSocket5();
	}
}

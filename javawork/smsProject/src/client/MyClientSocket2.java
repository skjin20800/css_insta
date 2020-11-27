package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket2 {
private Socket socket;
private Scanner sc;
private BufferedWriter writer;
private BufferedReader reader;

	public MyClientSocket2() {
		try {
			socket = new Socket("127.0.0.1",10000);
			// Ű����� ���� �Է� �޾Ƽ�
			 sc = new Scanner(System.in);
			// ���Ͽ� ���۴ޱ�(����)
			
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					String input = null;
					try {
						while((input = reader.readLine()) != null) {
							System.out.println("�����κ��Ϳ� �޽��� : " + input );
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();
			
			//���ξ������ Ű����κ��� �Է��� ������ Ŭ���̾�Ʈ ���Ͽ� ����
			while(true) {
				String input = sc.nextLine();
				// ������ ����
				writer.write(input+"\n");
				writer.flush();
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		socket.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	
public static void main(String[] args) {
	new MyClientSocket2();
}
}

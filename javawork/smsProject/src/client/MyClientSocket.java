package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {
private Socket socket;
	public MyClientSocket() {
		try {
			socket = new Socket("127.0.0.1",10000);
		
			// Ű����� ���� �Է� �޾Ƽ�
			Scanner sc = new Scanner(System.in);
			// ���Ͽ� ���۴ޱ�(����)
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String input = sc.nextLine();
				// ������ ����
				bw.write(input+"\n");
				bw.flush();
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
	new MyClientSocket();
}
}

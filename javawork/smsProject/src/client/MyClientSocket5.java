package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket5 {
	private Socket socket;
	private BufferedReader reader;
	private Scanner sc;
	private PrintWriter writer;
	
	public MyClientSocket5() {
		try {
			socket = new Socket("localhost",10000);
			SocketThread st = new SocketThread();
			st.start();			
			sc = new Scanner(System.in);
			writer = new PrintWriter(socket.getOutputStream(),true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while(true) {
			//ALL:¾È³ç , MSG:ssar1:¾È³ç
			String keyboard = sc.nextLine();
			writer.println(keyboard);
		}
				
		// TODO Auto-generated constructor stub
	}
	
	class SocketThread extends Thread{
		@Override
		public void run() {
		try {
			reader =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String input = null;
			while((input = reader.readLine())!=null) {
				System.out.println(input);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
public static void main(String[] args) {
	new MyClientSocket5();
}
}

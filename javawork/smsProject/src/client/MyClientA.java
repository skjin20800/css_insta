package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyClientA {
private ServerSocket svSocket;
private Socket socket;
private BufferedReader bfRead;
private BufferedWriter bfwrite;
private Scanner sc;
	public MyClientA() {
		try {
			
			
			socket = new Socket("127.0.0.1",(20000));
			bfRead = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bfwrite = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			sc = new Scanner(System.in);
			
			Thread t1 = new Thread(new read());
			Thread t2 = new Thread(new write());
			
			
			t1.start();
			t2.start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	class read implements Runnable{
		@Override
		public void run() {
			try {
				
				String input = null;
				while((input=bfRead.readLine()) !=null) {
					System.out.println("서버로부터의 메세지"+ input);
				}
			} catch (IOException e) {	e.printStackTrace();
			}	
		}
	}
	
	class write implements Runnable{
		@Override
		public void run() {
			try {
				
				
				while(true) {
					String a  = sc.nextLine();
					bfwrite.write(a + "\n");
					bfwrite.flush();
				}
			} catch (IOException e) {e.printStackTrace();}
		
		
		}
		
	}
	
	
	public static void main(String[] args) {
		new MyClientA();
	}
	
}

package chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame {

	private final static String TAG = "ChatClient :";
	private ChatClient chatClinet = this;

	private static final int PORT = 10000;

	private JButton btnConnect, btnSend; // �տ� btn �������� ������Ʈ �̸������� ���߿� ���� ����
	private JTextField tfHost, tfChat;
	private JTextArea taChatList;
	private ScrollPane scrollPane;

	private JPanel topPanel, bottomPanel;

	private Socket socket;
	private PrintWriter writer;
	private BufferedReader reader;

	public ChatClient() {
		init();
		setting();
		batch();
		listener();
		setVisible(true);
	}

	private void init() {
		btnConnect = new JButton();
		btnSend = new JButton("send");
		tfHost = new JTextField("127.0.0.1", 20);
		tfChat = new JTextField(20);
		taChatList = new JTextArea(10, 30); // row,column
		scrollPane = new ScrollPane();
		topPanel = new JPanel();
		bottomPanel = new JPanel();
	}

	private void setting() {
		setTitle("ä�� �ٴ�� Ŭ���̾�Ʈ");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		taChatList.setBackground(Color.ORANGE);
		taChatList.setForeground(Color.BLUE);
	}

	private void batch() {
		topPanel.add(tfHost);
		topPanel.add(btnConnect);
		bottomPanel.add(tfChat);
		bottomPanel.add(btnSend);
		scrollPane.add(taChatList);

		add(topPanel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
	}

	private void listener() {
		btnConnect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				connet();
			}
		});
		
		btnSend.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				send();
			}
		});
	}
	
	class ReaderThread extends Thread{
		
		//while�� ���鼭 ������ ���� �޽����� �޾Ƽ� taChatList�� �Ѹ���
		@Override
		public void run() {
			
		}
	}

	private void connet() {

		try {
			String host = tfHost.getText();
			socket = new Socket(host, PORT);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream(),true);
			ReaderThread rt = new ReaderThread();
			rt.start();
		} catch (Exception e1) {
			System.out.println(TAG + "���� ���� ����" + e1.getMessage());
			e1.printStackTrace();
		}
	}
	
	private void send() {

		String chat = tfChat.getText();
		//1�� taChatList�Ѹ���
		taChatList.append("[�� �޽���] " + chat + "\n");
		//2�� ������ ����
		
		//3�� tfChat����
		tfChat.setText("");
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}
}
package ch10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GuiTest extends JFrame {
	private JTextField txt_Name, txt_Id, txt_Pass, txt_Email;
	private JPanel Title_panel,  List_panel, Main_panel;
	private JButton btn_Send, btn_Reset;
	private JLabel Title, la_Name, la_Id, la_Pass, la_Email;
	
	
	public GuiTest() {
		getContentPane().setLayout(null);
		
		initObject();
		
		Title_panel.setBounds(0, 0, 434, 83);
		getContentPane().add(Title_panel);
		Title_panel.setLayout(null);
		
		
		Title.setBounds(188, 30, 57, 15);
		Title_panel.add(Title);
		
		
		List_panel.setBounds(0, 81, 106, 374);
		getContentPane().add(List_panel);
		List_panel.setLayout(null);
		
		btn_Send.setBounds(4, 303, 97, 23);
		List_panel.add(btn_Send);
		
		
		btn_Reset.setBounds(4, 331, 97, 23);
		List_panel.add(btn_Reset);
		
		
		Main_panel.setBounds(105, 81, 329, 374);
		getContentPane().add(Main_panel);
		Main_panel.setLayout(null);
		
		txt_Name = new JTextField();
		txt_Name.setBounds(101, 21, 161, 21);
		Main_panel.add(txt_Name);
		txt_Name.setColumns(10);
		
		txt_Id = new JTextField();
		txt_Id.setColumns(10);
		txt_Id.setBounds(101, 73, 161, 21);
		Main_panel.add(txt_Id);
		
		txt_Pass = new JTextField();
		txt_Pass.setColumns(10);
		txt_Pass.setBounds(101, 123, 161, 21);
		Main_panel.add(txt_Pass);
		
		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(101, 177, 161, 21);
		Main_panel.add(txt_Email);
		
		
		la_Name.setBounds(32, 21, 57, 15);
		Main_panel.add(la_Name);
		
		
		la_Id.setBounds(32, 73, 57, 15);
		Main_panel.add(la_Id);
		
		
		
		la_Pass.setBounds(32, 126, 57, 15);
		Main_panel.add(la_Pass);
		
		
		
		la_Email.setBounds(32, 177, 57, 15);
		Main_panel.add(la_Email);

		setSize(500,500);
		setVisible(true);
		
	}
	
	void initObject() {
		Title_panel = new JPanel();
		List_panel = new JPanel();
		Main_panel = new JPanel();
				
		btn_Send = new JButton("전 송");
		btn_Reset = new JButton("초기화");
		
		Title = new JLabel("Gui 연습");
		la_Name = new JLabel("이름");
		la_Id = new JLabel("아이디");
		la_Pass = new JLabel("비밀번호");
		la_Email = new JLabel("이메일");
		
	}
	
	public static void main(String[] args) {
		new GuiTest();
	}
}

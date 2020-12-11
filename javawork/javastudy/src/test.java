import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JTextPane;

public class test extends JFrame {
private Container c;
private JPanel panel;
private JLabel laName;
private JTextPane tpContent;
	public test() {		
		init(); 
		setting();
		batch();		
		setVisible(true);
		
	}
	public void init() {
		 panel = new JPanel();
		 laName = new JLabel("----------2Stage----------");
		 tpContent = new JTextPane();
		 c = new Container();
	}
	
	void setting() {
		panel.setBackground(Color.GRAY);
		panel.setBounds(12, 68, 360, 175);
		panel.setLayout(null);
		laName.setOpaque(true);
		laName.setBackground(Color.WHITE);
		laName.setBounds(12, 10, 336, 29);
		
		tpContent.setBackground(Color.WHITE);
		tpContent.setBounds(12, 49, 336, 116);
		setContentPane(c);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void batch() {
		
		c.add(panel);
	panel.add(tpContent);
	panel.add(laName);
	}
	
	public static void main(String[] args) {
		new test();
	}
}

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame {
private Container c;
	
	/**
	 * Create the panel.
	 */
	public test() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("----------2Stage----------");
		lblNewLabel.setBounds(262, 257, 171, 27);
		
		 c = new Container();
		 c.add(lblNewLabel);
		setContentPane(c);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new test();
	}
}

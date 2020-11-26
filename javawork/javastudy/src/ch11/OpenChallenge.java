package ch11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OpenChallenge extends JFrame {
	private Container c;
	private JPanel a1, a2;
	private ImageIcon[] images = { new ImageIcon("D:/image/apple.jpg"), new ImageIcon("D:/image/banana.jpg"),
			new ImageIcon("D:/image/kiwi.jpg"), new ImageIcon("D:/image/mango.jpg") };
	private JLabel la1;
	private JButton btn_L, btn_R;
	private int img = 0;

	public OpenChallenge() {

		initObject();
		initSetting();
		initActionLis();
		initAdd();

	}

	void initObject() {
		c = getContentPane();
		a1 = new JPanel();
		a2 = new JPanel();
		la1 = new JLabel();
		btn_L = new JButton("<");
		btn_R = new JButton(">");
	}

	void initSetting() {
		la1.setIcon(images[img]);
		a2.setLayout(new FlowLayout());
		btn_L.setPreferredSize(new Dimension(100, 100));
		btn_R.setPreferredSize(new Dimension(100, 100));

		setTitle("Ã§¸°Áö");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);

	}

	void initAdd() {
		c.add(a1, BorderLayout.CENTER);
		c.add(a2, BorderLayout.SOUTH);
		a1.add(la1);
		a2.add(btn_L);
		a2.add(btn_R);

	}

	void initActionLis() {
		btn_L.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (img > 0) {
					img = img - 1;
					la1.setIcon(images[img]);

				}
			}
		});
		btn_R.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (img < 3) {
					img = img + 1;
					la1.setIcon(images[img]);

				}
			}
		});
	}

	public static void main(String[] args) {
		new OpenChallenge();

	}

}

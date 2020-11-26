package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListEx extends JFrame{
	private String [] fruits = {"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	private ImageIcon [] images = {new ImageIcon("D:/image/icon1.png"),new ImageIcon("D:/image/icon2.png"),
															new ImageIcon("D:/image/icon3.png"),new ImageIcon("D:/image/icon4.png")
	};

	public ListEx() {
	setTitle("����Ʈ ����� ����");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new FlowLayout());
	
	JList<String> strList = new JList<String>(fruits); //���ڿ� ����Ʈ����
	c.add(strList);
	
	JList<ImageIcon> imageList = new JList<>();
	imageList.setListData(images);
	c.add(imageList);
	
	JList<String> scrollList = new JList<String>(fruits);//���ڿ� ����Ʈ ����
	c.add(new JScrollPane(scrollList));
	
	setSize(300,300);
	setVisible(true);
	}	
	public static void main(String[] args) {
	new ListEx();

	}

}

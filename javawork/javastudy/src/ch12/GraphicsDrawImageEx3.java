package ch12;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawImageEx3( ) {
		setTitle("이미지 일부분을 크기 조절하여 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("D:/image/image11.jpg");
		private Image img = icon.getImage(); //이미지 객체
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			// 이미지 20,20위치에서, 원본이미지 100,50에서 200,200까지 잘라내여 250,100크기만큼그린다
			//(좌표,좌표,크기,크기,잘라낼좌표A,잘라낼좌표A,잘라낼좌표B,잘라낼좌표B)
			g.drawImage(img,20,20,250,100,100,50,200,200,this);
		}
	}
	
public static void main(String[] args) {
	new GraphicsDrawImageEx3();
}
}

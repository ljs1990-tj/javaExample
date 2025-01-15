package day14;

import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ReviewEx1 extends JFrame{

	public ReviewEx1(){
		setTitle("랜덤 버튼 배치");
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();
		
		for(int i=1; i<=10; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			int x = ran.nextInt(700);
			int y = ran.nextInt(700);
			btn.setLocation(x,y);
			c.add(btn);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewEx1 myFrame = new ReviewEx1();
	}

}

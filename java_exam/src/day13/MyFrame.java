package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		
		JButton btn1 = new JButton("1번버튼");
		JButton btn2 = new JButton("2번버튼");
		JButton btn3 = new JButton("3번버튼");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		for(int i=0; i<10; i++) {
			c.add(new JButton("test" + i));
		}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame gui = new MyFrame();
	}

}

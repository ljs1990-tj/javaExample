package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame{
	
	public MyFrame4() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		
		// 배치관리자 => null
		c.setLayout(null);
		for(int i=1; i<=9; i++) {
			JButton btn = new JButton(i+"");
			btn.setSize(50,20);
			btn.setLocation(i*15, i*15);
			c.add(btn);
		}
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame4 gui = new MyFrame4();
	}

}

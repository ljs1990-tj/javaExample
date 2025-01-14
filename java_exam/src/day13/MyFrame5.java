package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame5 extends JFrame{
	
	public MyFrame5() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		
		// 배치관리자 => null
		c.setLayout(null);
		JButton btn1 = new JButton("test");
		btn1.setSize(60,60);
		btn1.setLocation(100, 150);
		c.add(btn1);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame5 gui = new MyFrame5();
	}

}

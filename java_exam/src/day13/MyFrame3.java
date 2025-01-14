package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame{
	
	public MyFrame3() {
		setTitle("첫번째 GUI");
		
		Container c = getContentPane();
		c.setBackground(Color.cyan);
		// GridLayout
		GridLayout grid = new GridLayout(4,3);
		grid.setVgap(5);
		grid.setHgap(5);
		c.setLayout(grid);
		
		for(int i=1; i<=9; i++) {
			c.add(new JButton(i+""));
		}
		c.add(new JButton("+"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame3 gui = new MyFrame3();
	}

}

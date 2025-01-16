package day14;

import java.awt.Container;

import javax.swing.JFrame;

public class Sample extends JFrame{

	public Sample() {
		// TODO Auto-generated constructor stub
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Sample();
	}

}

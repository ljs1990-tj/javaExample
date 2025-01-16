package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	public MouseListenerAllEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 이벤트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel label = new JLabel("마우스 이벤트 전");
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("클릭되었음 " + e.getX() + "," + e.getY());
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("클릭해제되었음 " + e.getX() + "," + e.getY());
				c.setBackground(Color.cyan);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(new Color(0,255,0));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				c.setBackground(Color.gray);
			}
			
		});
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("드래그하는중 " + e.getX() + "," + e.getY());
				c.setBackground(Color.orange);
			}
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				label.setText("마우스 움직이는 중 " + e.getX() + "," + e.getY());
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();
	}

}

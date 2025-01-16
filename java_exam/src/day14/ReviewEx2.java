package day14;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ReviewEx2 extends JFrame {
	private int checkNum = 1;
	
	// 시간 체크
	private double startTime;
	private double endTime;
	private JLabel label;

	public ReviewEx2() {
		setTitle("랜덤 버튼 배치");
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();

		label = new JLabel("", SwingConstants.CENTER);
		label.setFont(new Font("", Font.BOLD, 30));
		label.setBounds(250, 350, 300, 50);
		c.add(label);

		for(int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "");
			btn.setSize(50, 50);
			int x = ran.nextInt(500);
			int y = ran.nextInt(500);
			btn.setLocation(x, y);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource();
					// "1" => 1
					int btnNum = Integer.parseInt(btn.getText());
					if(btnNum == checkNum) {
						btn.setVisible(false);
						checkNum++;
						if(checkNum == 2) {
							startTime = System.currentTimeMillis();
						}
						if(checkNum > 10) {
							endTime = System.currentTimeMillis();
							double time = (endTime - startTime) / 1000;
							System.out.println(time + "초");
						}
						
					}
				}
			});
			
			c.add(btn);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewEx2 myFrame = new ReviewEx2();
	}

}

package day15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEvent extends JFrame {
	private JLabel result;
	private int sum = 0;
	
	public CheckBoxEvent() {
		setTitle("체크박스 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel label = new JLabel("사과 100원, 배 500원, 체리 20000원");
		c.add(label);

		String names[] = { "사과", "배", "체리" };
		for (int i = 0; i < names.length; i++) {
			JCheckBox fruit = new JCheckBox(names[i]);
			fruit.setBorderPainted(true);
			fruit.addItemListener(new ItemListener() {
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					JCheckBox fruit = (JCheckBox) e.getItem();
					if (e.getStateChange() == ItemEvent.SELECTED) {
						if (fruit.getText().equals("사과")) {
							sum += 100;
						} else if (fruit.getText().equals("배")) {
							sum += 500;
						} else {
							sum += 20000;
						}
						System.out.println(fruit.getText() + "가 선택되었음");
					} else {
						if (fruit.getText().equals("사과")) {
							sum -= 100;
						} else if (fruit.getText().equals("배")) {
							sum -= 500;
						} else {
							sum -= 20000;
						}
						System.out.println(fruit.getText() + "가 해제되었음");
					}
					result.setText("현재 " + sum + "원 입니다.");
				}
			});
			c.add(fruit);
		}

		result = new JLabel("현재 0원 입니다.");
		c.add(result);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEvent();
	}

}

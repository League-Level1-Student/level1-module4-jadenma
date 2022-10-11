package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton multiply = new JButton();
	JButton divide = new JButton();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	
	public void run() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(subtract);
		panel.add(multiply);
		panel.add(divide);
		panel.add(label);
		frame.pack();
		add.addActionListener(this);
		subtract.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		add.setText("add");
		subtract.setText("sub");
		multiply.setText("mul");
		divide.setText("div");
		frame.setTitle("Simple Calculator");
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String string1 = field1.getText();
		String string2 = field2.getText();
		int num1 = Integer.parseInt(string1);
		int num2 = Integer.parseInt(string2);
		if (buttonPressed == add) {
			add(num1, num2);
		}
		if (buttonPressed == subtract) {
			subtract(num1, num2);
		}
		if (buttonPressed == multiply) {
			multiply(num1, num2);
		}
		if (buttonPressed == divide) {
			divide(num1, num2);
		}
	}
	
	public void add(int num1, int num2) {
		label.setText("" + (num1 + num2));
	}
	
	public void subtract(int num1, int num2) {
		label.setText("" + (num1 - num2));
	}
	
	public void multiply(int num1, int num2) {
		label.setText("" + (num1 * num2));
	}
	
	public void divide(int num1, int num2) {
		label.setText("" + (num1 / num2));
	}
}

package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ChuckleClicker {

	public static void main(String[] args) {
		makeButtons();
	}
	
	static void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button1.setSize(50, 50);
		button2.setText("punchline");
		button2.setSize(50, 50);
	}
	
}

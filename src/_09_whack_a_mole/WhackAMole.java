package _09_whack_a_mole;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole {

	public void run() {
		
	}
	
	void drawButtons(int randNum) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		frame.setPreferredSize(new Dimension(500, 500));
		frame.pack();
		
	}
	
}

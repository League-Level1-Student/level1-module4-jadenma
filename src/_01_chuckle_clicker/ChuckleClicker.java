package _01_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
public class ChuckleClicker implements ActionListener {
	public ChuckleClicker() {
		makeButtons();
	}
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("joke");
		button1.setSize(50, 50);
		button2.setText("punchline");
		button2.setSize(50, 50);
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			JOptionPane.showMessageDialog(null, "Why does Waldo wear stripes?");
		}
		if (buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, "Because he doesn't want to be spotted.");
		}
	}
}
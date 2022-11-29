package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	Random ran = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spinButton = new JButton();
	Icon icon1 = new ImageIcon("slot machine 7.jpg");
	Icon icon2 = new ImageIcon("slot machine cherry.jpg");
	Icon icon3 = new ImageIcon("slot machine diamond.jpg");
	JLabel imageLabel1 = new JLabel();
	JLabel imageLabel2 = new JLabel();
	JLabel imageLabel3 = new JLabel();
	
	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setTitle("Slot Machine");
		panel.add(spinButton);
		spinButton.addActionListener(this);
		spinButton.setText("SPIN!");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

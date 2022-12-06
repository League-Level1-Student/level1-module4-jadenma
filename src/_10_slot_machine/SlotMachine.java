package _10_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
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
	int randnum1 = ran.nextInt(3);
	int randnum2 = ran.nextInt(3);
	int randnum3 = ran.nextInt(3);
	
	public void run() {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setTitle("Slot Machine");
		panel.add(spinButton);
		if (randnum1 == 0) {
			panel.add(createLabelImage("slot machine 7.png"));
		}
		else if (randnum1 == 1) {
			panel.add(createLabelImage("slot machine cherry.jpg"));
		}
		else {
		panel.add(createLabelImage("slot machine diamond.jpg"));
		}
		
		if (randnum2 == 0) {
			panel.add(createLabelImage("slot machine 7.png"));
		}
		else if (randnum2 == 1) {
			panel.add(createLabelImage("slot machine cherry.jpg"));
		}
		else {
		panel.add(createLabelImage("slot machine diamond.jpg"));
		}
		
		if (randnum3 == 0) {
			panel.add(createLabelImage("slot machine 7.png"));
		}
		else if (randnum3 == 1) {
			panel.add(createLabelImage("slot machine cherry.jpg"));
		}
		else {
		panel.add(createLabelImage("slot machine diamond.jpg"));
		}
		
		frame.pack();
		spinButton.addActionListener(this);
		spinButton.setText("SPIN!");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		if (spinButton == buttonPressed) {
			frame.getContentPane().removeAll();
			panel = new JPanel();
			frame.add(panel);
			panel.removeAll();
			panel.add(spinButton);
			randnum1 = ran.nextInt(3);
			randnum2 = ran.nextInt(3);
			randnum3 = ran.nextInt(3);
			if (randnum1 == 0) {
				panel.add(createLabelImage("slot machine 7.png"));
			}
			else if (randnum1 == 1) {
				panel.add(createLabelImage("slot machine cherry.jpg"));
			}
			else {
			panel.add(createLabelImage("slot machine diamond.jpg"));
			}
			
			if (randnum2 == 0) {
				panel.add(createLabelImage("slot machine 7.png"));
			}
			else if (randnum2 == 1) {
				panel.add(createLabelImage("slot machine cherry.jpg"));
			}
			else {
			panel.add(createLabelImage("slot machine diamond.jpg"));
			}
			
			if (randnum3 == 0) {
				panel.add(createLabelImage("slot machine 7.png"));
			}
			else if (randnum3 == 1) {
				panel.add(createLabelImage("slot machine cherry.jpg"));
			}
			else {
			panel.add(createLabelImage("slot machine diamond.jpg"));
			}
			frame.repaint();
			panel.repaint();
			panel.revalidate();
		}
		
	}
	
	private JLabel createLabelImage(String fileName) {
        URL imageURL = getClass().getResource(fileName);
		if (imageURL == null){
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
}
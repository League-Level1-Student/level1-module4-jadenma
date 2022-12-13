package _11_lights_out;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * Lights Out is a puzzle game with a grid of lights that are either on (light
 * gray) or off (white). Pressing any light will toggle it and its adjacent
 * lights. The goal of the game is to switch all the lights off.
 * 
 * Follow the instructions below to create your own version of Lights Out
 * 
 * 
 */
public class LightsOut implements MouseListener {

	JPanel gamePanel = new JPanel();

	public LightsOut() {

		/** PART 1. CREATE YOUR LIGHT BOARD **/
		//1. Make your gamePanel a 5x5 grid with setLayout(new GridLayout(5, 5));
		setLayout(new GridLayout(5,5));
		
			//2. Add 25 JLabels to your gamePanel (these are your lights)
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();
		JLabel label8 = new JLabel();
		JLabel label9 = new JLabel();
		JLabel label10 = new JLabel();
		JLabel label11 = new JLabel();
		JLabel label12 = new JLabel();
		JLabel label13 = new JLabel();
		JLabel label14 = new JLabel();
		JLabel label15 = new JLabel();
		JLabel label16 = new JLabel();
		JLabel label17 = new JLabel();
		JLabel label18 = new JLabel();
		JLabel label19 = new JLabel();
		JLabel label20 = new JLabel();
		JLabel label21 = new JLabel();
		JLabel label22 = new JLabel();
		JLabel label23 = new JLabel();
		JLabel label24 = new JLabel();
		JLabel label25 = new JLabel();
		gamePanel.add(label1);
		gamePanel.add(label2);
		gamePanel.add(label3);
		gamePanel.add(label4);
		gamePanel.add(label5);
		gamePanel.add(label6);
		gamePanel.add(label7);
		gamePanel.add(label8);
		gamePanel.add(label9);
		gamePanel.add(label10);
		gamePanel.add(label11);
		gamePanel.add(label12);
		gamePanel.add(label13);
		gamePanel.add(label14);
		gamePanel.add(label15);
		gamePanel.add(label16);
		gamePanel.add(label17);
		gamePanel.add(label18);
		gamePanel.add(label19);
		gamePanel.add(label20);
		gamePanel.add(label21);
		gamePanel.add(label22);
		gamePanel.add(label23);
		gamePanel.add(label24);
		gamePanel.add(label25);
		
			//3. Use setText() to add a position number to each light (0-24).
		label1.setText("0");
			//4. Set the background of each light to LIGHT_GRAY
			// - you will also have to set the background to opaque.
			// - Use light.setOpaque(true);

			//5. Add a mouseListener to each light
		
		
		//6. Add your panel to a frame

		//7. Set the size of the frame

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		/** PART 2: TOGGLE NEIGHBORING LIGHTS **/
		// 1. Get the light that was clicked on `(JLabel) e.getSource`

		// 2. Get the number (position) of the light

		// 3. Now use the makeMove method to code which lights turn on and off.

		// 4.Check if the player has won (e.g. all the lights are off)
		// ---- HINT: use `getLightAtPosition` to get the light at each position
		// ---------- use 'getBackground' to get the light color

		/** PART 3: RANDOMIZE YOUR BOARD **/
		// Now that your game works can you make the game start with some lights on?

	}

	void makeMove(int pos) {
		toggle((JLabel) gamePanel.getComponent(pos));
		if (pos >= 5) {
			toggle((JLabel) gamePanel.getComponent(pos - 5));
		}
		if ((pos + 1) % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos + 1));
		}
		if (pos % 5 != 0) {
			toggle((JLabel) gamePanel.getComponent(pos - 1));
		}
		if (pos + 5 <= 24) {
			toggle((JLabel) gamePanel.getComponent(pos + 5));
		}
	}

	JLabel getLightAtPosition(int lightPosition) {
		return (JLabel) gamePanel.getComponent(lightPosition);
	}

	void toggle(JLabel label) {
		if (label.getBackground() == Color.WHITE) {
			label.setBackground(Color.LIGHT_GRAY);

		} else {
			label.setBackground(Color.WHITE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
	}
}

package _09_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random ran = new Random();
	JButton moleButton;
	int buttonNum;
	Date startTime;
	int molesWhacked = 0;
	int molesMissed = 0;
	
	public void run() {
		String buttons = JOptionPane.showInputDialog("How many holes would you like?");
		buttonNum = Integer.parseInt(buttons);
		startTime = new Date();
		drawButtons(buttonNum);
	}
	
	void drawButtons(int randNum) {
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Whack a Button for Fame and Glory");
		frame.add(panel);
		int mole = ran.nextInt(randNum);
		System.out.println(mole);
		for (int i = 0; i<randNum; i++) {
			if (i == mole) {
				moleButton = new JButton();
				moleButton.setText("mole!");
				panel.add(moleButton);
				moleButton.addActionListener(this);
			}
			else {
				JButton button = new JButton();
				panel.add(button);
				button.addActionListener(this);
			}
		}
		frame.setPreferredSize(new Dimension(1000, 1000));
		frame.pack();
		if (molesMissed == 5) {
			JOptionPane.showMessageDialog(null, "You lost!");
			System.exit(0);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		molesWhacked++;
		if (molesWhacked == 10) {
			endGame(startTime, molesWhacked);
		}
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed != moleButton) {
			molesMissed++;
			if (molesMissed == 1) {
				speak("You missed " + molesMissed + " time!");
			}
			else {
				speak("You missed " + molesMissed + " times!");
			}
		}
		frame.getContentPane().removeAll();
		panel = new JPanel();
		drawButtons(buttonNum);
		
		
	}
	
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	
}

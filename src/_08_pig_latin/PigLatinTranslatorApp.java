package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatinTranslatorApp implements ActionListener {

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextField field1 = new JTextField(10);
	JTextField field2 = new JTextField(10);
	
	public void run() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Pig Latin Translator");
		button1.setText(">>");
		button2.setText("<<");
		button3.setText("speak");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		panel.add(field1);
		panel.add(button1);
		panel.add(button2);
		panel.add(field2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String string1 = field1.getText();
		String string2 = field2.getText();
		if (buttonPressed == button1) {
			String translation1 = PigLatinTranslator.translateEnglishToPigLatin(string1);
			field2.setText(translation1);
		}
		if (buttonPressed == button2) {
			String translation2 = PigLatinTranslator.translatePigLatinToEnglish(string2);
			field1.setText(translation2);
		}
		if (buttonPressed == button3) {
			Sound.speak(string2);
		}
	}
	
}

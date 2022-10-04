package _03_typing_tutor;

import java.util.Random;

public class TypingTutorRunner {

	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.setup();
	}
	
	static char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}

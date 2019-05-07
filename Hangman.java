import javax.swing.*;
import java.awt.*;
class Hangman extends JFrame {
public static void main(String[] args) {	
		Hangman g = new Hangman();
		home C = new home();	
		g.add(C);
		
		g.setTitle("Hungman");

		g.setSize(520,543);
		g.setResizable(false);
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setLocation(350,100);
		g.setVisible(true);
		
	}
}
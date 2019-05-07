import javax.swing.*;
import java.awt.*;





class Hangman extends JFrame {
					public  int pit = 0 ;
					public	Hangman(){
		
							JFrame	g=new JFrame();
							home game = new home();	
							 pit	= game.get();
							g.add(game);
							g.setTitle("Hungman");
							g.setSize(520,543);
							g.setResizable(false);
							g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							g.setLocation(350,100);
							g.setVisible(true);
							
					}

				
}
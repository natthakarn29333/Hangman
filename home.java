import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.applet.*;


public class home extends JPanel implements ActionListener, MouseListener {
	private ImageIcon bg , bg1 , start;
	int page=1;
	static final int DEAD = 7;
	private int errors;
	private String word;
	private StringBuffer word1;
	private String message;
	private String information;
	private Font font , font1 ,font2;
	private ImageIcon m1 , m2 , m3 , m4 , m5 , m6 , m7 , m8 , m9 , m10 , m11 , m12 , m13, head;
	private JButton a , b , c , d , E , f , G , h , i , j , k , l , m , n , o , p , q , r , s , t , u , v , w , x , y , z;
	private JButton play , restart;
	private char Data;
	private int Y  , P ;
	private Timer time;
	private AudioClip A1 , A2 , A4 , A5;
	private int pit = 0 ;


	public home( ){
		URL url1 =getClass().getResource("/pic/1.wav");
 		URL url2 =getClass().getResource("/pic/2.wav");
 		URL url3 =getClass().getResource("/pic/3.wav");
 		URL url4 =getClass().getResource("/pic/4.wav");
 		URL url5 =getClass().getResource("/pic/5.wav");

 		A1 = Applet.newAudioClip(url1);
 		A2 = Applet.newAudioClip(url2);
 		A4 = Applet.newAudioClip(url4);
 		A5 = Applet.newAudioClip(url5);


			bg = new ImageIcon(getClass().getResource(("/pic/1.png")));
			bg1 = new ImageIcon(getClass().getResource(("/pic/15.png")));
			start = new ImageIcon(getClass().getResource(("/pic/9.gif")));
			head = new ImageIcon(getClass().getResource(("/pic/16.png")));
			 addMouseListener(this);
			font = new Font("Monospaced" , 20 , 20);
			font1 = new Font("Monospaced",Font.BOLD, 32 );
			setFont(font);

			setBorder(new EmptyBorder(80,10,10,10));
			setBackground(Color.decode("#EEAEEE"));

			a = new JButton("A");
			a.setEnabled(false);
			a.setPreferredSize(new Dimension(40	, 40));
			a.setBackground(Color.decode("#FFC0CB"));
			a.setForeground(Color.decode("#3C2D00"));
			a.setFont(font);
			a.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			a.addActionListener(this);
			add(a);

			b = new JButton("B");
			b.setEnabled(false);
			b.setPreferredSize(new Dimension(40	, 40));
			b.setBackground(Color.decode("#FFC0CB"));
			b.setForeground(Color.decode("#3C2D00"));
			b.setFont(font);
			b.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			b.addActionListener(this);
			add(b);

			c = new JButton("C");
			c.setEnabled(false);
			c.setPreferredSize(new Dimension(40	, 40));
			c.setBackground(Color.decode("#FFC0CB"));
			c.setForeground(Color.decode("#3C2D00"));
			c.setFont(font);
			c.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			c.addActionListener(this);
			add(c);

			d = new JButton("D");
			d.setEnabled(false);
			d.setPreferredSize(new Dimension(40	, 40));
			d.setBackground(Color.decode("#FFC0CB"));
			d.setForeground(Color.decode("#3C2D00"));
			d.setFont(font);
			d.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			d.addActionListener(this);
			add(d);


			E = new JButton("E");
			E.setEnabled(false);
			E.setPreferredSize(new Dimension(40	, 40));
			E.setBackground(Color.decode("#FFC0CB"));
			E.setForeground(Color.decode("#3C2D00"));
			E.setFont(font);
			E.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			E.addActionListener(this);
			add(E);


			f = new JButton("F");
			f.setEnabled(false);
			f.setPreferredSize(new Dimension(40	, 40));
			f.setBackground(Color.decode("#FFC0CB"));
			f.setForeground(Color.decode("#3C2D00"));
			f.setFont(font);
			f.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			f.addActionListener(this);
			add(f);


			G = new JButton("G");
			G.setEnabled(false);
			G.setPreferredSize(new Dimension(40	, 40));
			G.setBackground(Color.decode("#FFC0CB"));
			G.setForeground(Color.decode("#3C2D00"));
			G.setFont(font);
			G.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			G.addActionListener(this);
			add(G);


			h = new JButton("H");
			h.setEnabled(false);
			h.setPreferredSize(new Dimension(40	, 40));
			h.setBackground(Color.decode("#FFC0CB"));
			h.setForeground(Color.decode("#3C2D00"));
			h.setFont(font);
			h.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			h.addActionListener(this);
			add(h);

			i = new JButton("I");
			i.setEnabled(false);
			i.setPreferredSize(new Dimension(40	, 40));
			i.setBackground(Color.decode("#FFC0CB"));
			i.setForeground(Color.decode("#3C2D00"));
			i.setFont(font);
			i.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			i.addActionListener(this);
			add(i);

			j = new JButton("J");
			j.setEnabled(false);
			j.setPreferredSize(new Dimension(40	, 40));
			j.setBackground(Color.decode("#FFC0CB"));
			j.setForeground(Color.decode("#3C2D00"));
			j.setFont(font);
			j.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			j.addActionListener(this);
			add(j);

			k = new JButton("K");
			k.setEnabled(false);
			k.setPreferredSize(new Dimension(40	, 40));
			k.setBackground(Color.decode("#FFC0CB"));
			k.setForeground(Color.decode("#3C2D00"));
			k.setFont(font);
			k.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			k.addActionListener(this);
			add(k);

			l = new JButton("L");
			l.setEnabled(false);
			l.setPreferredSize(new Dimension(40	, 40));
			l.setBackground(Color.decode("#FFC0CB"));
			l.setForeground(Color.decode("#3C2D00"));
			l.setFont(font);
			l.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			l.addActionListener(this);
			add(l);

			m = new JButton("M");
			m.setEnabled(false);
			m.setPreferredSize(new Dimension(40	, 40));
			m.setBackground(Color.decode("#FFC0CB"));
			m.setForeground(Color.decode("#3C2D00"));
			m.setFont(font);
			m.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			m.addActionListener(this);
			add(m);

			n = new JButton("N");
			n.setEnabled(false);
			n.setPreferredSize(new Dimension(40	, 40));
			n.setBackground(Color.decode("#FFC0CB"));
			n.setForeground(Color.decode("#3C2D00"));
			n.setFont(font);
			n.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			n.addActionListener(this);
			add(n);

			o = new JButton("O");
			o.setEnabled(false);
			o.setPreferredSize(new Dimension(40	, 40));
			o.setBackground(Color.decode("#FFC0CB"));
			o.setForeground(Color.decode("#3C2D00"));
			o.setFont(font);
			o.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			o.addActionListener(this);
			add(o);

			p = new JButton("P");
			p.setEnabled(false);
			p.setPreferredSize(new Dimension(40	, 40));
			p.setBackground(Color.decode("#FFC0CB"));
			p.setForeground(Color.decode("#3C2D00"));
			p.setFont(font);
			p.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			p.addActionListener(this);
			add(p);

			q = new JButton("Q");
			q.setEnabled(false);
			q.setPreferredSize(new Dimension(40	, 40));
			q.setBackground(Color.decode("#FFC0CB"));
			q.setForeground(Color.decode("#3C2D00"));
			q.setFont(font);
			q.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			q.addActionListener(this);
			add(q);

			r = new JButton("R");
			r.setEnabled(false);
			r.setPreferredSize(new Dimension(40	, 40));
			r.setBackground(Color.decode("#FFC0CB"));
			r.setForeground(Color.decode("#3C2D00"));
			r.setFont(font);
			r.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			r.addActionListener(this);
			add(r);

			s = new JButton("S");
			s.setEnabled(false);
			s.setPreferredSize(new Dimension(40	, 40));
			s.setBackground(Color.decode("#FFC0CB"));
			s.setForeground(Color.decode("#3C2D00"));
			s.setFont(font);
			s.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			s.addActionListener(this);
			add(s);

			t = new JButton("T");
			t.setEnabled(false);
			t.setPreferredSize(new Dimension(40	, 40));
			t.setBackground(Color.decode("#FFC0CB"));
			t.setForeground(Color.decode("#3C2D00"));
			t.setFont(font);
			t.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			t.addActionListener(this);
			add(t);

			play = new JButton("PLAY");
			play.setEnabled(false);
			play.setPreferredSize(new Dimension(82 , 40));
			play.setBackground(Color.decode("#FFC0CB"));
			play.setForeground(Color.decode("#3C2D00"));
			play.setFont(font1);
			play.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			play.addActionListener(this);
			play.setEnabled(true);
			add(play);

			u = new JButton("U");
			u.setEnabled(false);
			u.setPreferredSize(new Dimension(40	, 40));
			u.setBackground(Color.decode("#FFC0CB"));
			u.setForeground(Color.decode("#3C2D00"));
			u.setFont(font);
			u.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			u.addActionListener(this);
			add(u);

			v = new JButton("V");
			v.setEnabled(false);
			v.setPreferredSize(new Dimension(40	, 40));
			v.setBackground(Color.decode("#FFC0CB"));
			v.setForeground(Color.decode("#3C2D00"));
			v.setFont(font);
			v.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			v.addActionListener(this);
			add(v);

			w = new JButton("w");
			w.setEnabled(false);
			w.setPreferredSize(new Dimension(40	, 40));
			w.setBackground(Color.decode("#FFC0CB"));
			w.setForeground(Color.decode("#3C2D00"));
			w.setFont(font);
			w.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			w.addActionListener(this);
			add(w);

			x = new JButton("X");
			x.setEnabled(false);
			x.setPreferredSize(new Dimension(40	, 40));
			x.setBackground(Color.decode("#FFC0CB"));
			x.setForeground(Color.decode("#3C2D00"));
			x.setFont(font);
			x.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			x.addActionListener(this);
			add(x);

			y = new JButton("Y");
			y.setEnabled(false);
			y.setPreferredSize(new Dimension(40	, 40));
			y.setBackground(Color.decode("#FFC0CB"));
			y.setForeground(Color.decode("#3C2D00"));
			y.setFont(font);
			y.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			y.addActionListener(this);
			add(y);

			z = new JButton("Z");
			z.setEnabled(false);
			z.setPreferredSize(new Dimension(40	, 40));
			z.setBackground(Color.decode("#FFC0CB"));
			z.setForeground(Color.decode("#3C2D00"));
			z.setFont(font);
			z.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			z.addActionListener(this);
			add(z);

			restart = new JButton("RESTART");
			restart.setEnabled(false);
			restart.setPreferredSize(new Dimension(90, 40));
			restart.setBackground(Color.decode("#FFC0CB"));
			restart.setForeground(Color.decode("#3C2D00"));
			restart.setFont(font);
			restart.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.white));
			restart.addActionListener(this);
			add(restart);
			//P = 1 ;
			Y = 120 ;
			P = 1 ;
			time = new Timer(2000 , this);

			initGame();
			//setPreferredSize(new Dimension(300 , 300));
	}
	public void initGame(){
		errors = 0;
		//Icon b = new ImageIcon(getClass().getResource("C:/Users/10.10Desktop\Hungman\src\pic"));
		m1 = new ImageIcon(getClass().getResource(("/pic/19.png")));
		m2 = new ImageIcon(getClass().getResource(("/pic/20.png")));
		m3 = new ImageIcon(getClass().getResource(("/pic/21.png")));
		m4 = new ImageIcon(getClass().getResource(("/pic/22.png")));
		m5 = new ImageIcon(getClass().getResource(("/pic/17.png")));
		m6 = new ImageIcon(getClass().getResource(("/pic/18.png")));
		m7 = new ImageIcon(getClass().getResource(("/pic/9.png")));
		m8 = new ImageIcon(getClass().getResource(("/pic/11.png")));
		m9 = new ImageIcon(getClass().getResource(("/pic/12.png ")));
		m10 = new ImageIcon(getClass().getResource(("/pic/13.png")));
		m11 = new ImageIcon(getClass().getResource(("/pic/23.png")));
		m12 = new ImageIcon(getClass().getResource(("/pic/24.png")));
		m13 = new ImageIcon(getClass().getResource(("/pic/25.png")));


		String str = "Twilight|Batman|Titanic|Harry Potter|Frozen|	Minions|Skyfall|	Zootopia|Jurassic World|Black Panther|	Avatar|Aquaman|Intolerance|Cleopatra|Mickey|Wings|Cavalcade|Bambi |	Cinderella|Psycho         ";
		//String str ="amonuwado";
		String[] temp;

		String delimiter = "\\|";
		temp = str.split(delimiter);
		Random random = new Random();

		int randomInt = random.nextInt(temp.length);
		word = new String(temp[randomInt]);
		char positions[] = new char[word.length()];
		for(int i = 0 ; i < word.length() ; i++){
			A5.loop();
			positions[i] = '.';
		}
		String s = new String(positions);
		word1 = new StringBuffer(s);

		//Delete the message
		//System.out.print(word);
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//Draw the hungman

	font2 = new Font("Monospaced",Font.BOLD, 34 );
		setFont(font2);
		g.setFont(font2);

       if (errors >  0){// bar up
    	   m7.paintIcon(this, g, 15, 120);
		   m9.paintIcon(this, g, 18, 120);
		   m8.paintIcon(this, g, 18, 120);
		   m10.paintIcon(this, g, 18, 120);
		   m5.paintIcon(this, g, 18, 120);
       }
       if (errors >  1){    // rope
    	   m6.paintIcon(this, g, 18, Y);
       }
       if (errors >  2){    // body
    	   m1.paintIcon(this, g, 18, Y);
       }
       if (errors >  3){
    	   m2.paintIcon(this, g, 18, Y);
       }
       if (errors >  4){    // arms
    	   m3.paintIcon(this, g, 18, Y);
       }
       if (errors > 5){
    	   m4.paintIcon(this, g, 18, Y);
       }
       if(errors > 6){

    	   Y += P;
    	  if(Y > 140){
    		  	Y = 140;
  				P = +P;
    	  }else if(Y<120){
  			Y = 120;
  			P = -P;
  		}
    	   time.start();
    	   m4.getImage();
    	   time.stop();
    	   m11.paintIcon(this, g, 18, 190);
    	   m12.paintIcon(this, g, 24, Y);
    	   m13.paintIcon(this, g, 32, Y);

       }
       //Y = 120;
       g.drawString(new String (word1) , 220 , 350);

	}
	public void paint(Graphics g){
		super.paint(g);
		if(page == 1){
			bg.paintIcon(this, g, 0, 0);
		}
		else if(page == 2){
			bg1.paintIcon(this, g, 0, 0);
			start.paintIcon(this, g, 270, 210);
		}
		else{
			head.paintIcon(this, g, 10, 5);

		}

	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == a){
			Data = 'a';
			processTurn();
			a.setEnabled(false);
		}
		else if(e.getSource() == b){
			Data = 'b';
			processTurn();
			b.setEnabled(false);
		}
		else if(e.getSource() == c){
			Data = 'c';
			processTurn();
			c.setEnabled(false);
		}
		else if(e.getSource() == d){
			Data = 'd';
			processTurn();
			d.setEnabled(false);
		}
		else if(e.getSource() == E){
			Data = 'e';
			processTurn();
			E.setEnabled(false);
		}
		else if(e.getSource() == f){
			Data = 'f';
			processTurn();
			f.setEnabled(false);
		}
		else if(e.getSource() == G){
			Data = 'g';
			processTurn();
			G.setEnabled(false);
		}
		else if(e.getSource() == h){
			Data = 'h';
			processTurn();
			h.setEnabled(false);
		}
		else if(e.getSource() == i){
			Data = 'i';
			processTurn();
			i.setEnabled(false);
		}
		else if(e.getSource() == j){
			Data = 'j';
			processTurn();
			j.setEnabled(false);
		}
		else if(e.getSource() == k){
			Data = 'k';
			processTurn();
			k.setEnabled(false);
		}
		else if(e.getSource() == l){
			Data = 'l';
			processTurn();
			l.setEnabled(false);
		}
		else if(e.getSource() == m){
			Data = 'm';
			processTurn();
			m.setEnabled(false);
		}
		else if(e.getSource() == n){
			Data = 'n';
			processTurn();
			n.setEnabled(false);
		}
		else if(e.getSource() == o){
			Data = 'o';
			processTurn();
			o.setEnabled(false);
		}
		else if(e.getSource() == p){
			Data = 'p';
			processTurn();
			p.setEnabled(false);
		}
		else if(e.getSource() == q){
			Data = 'q';
			processTurn();
			q.setEnabled(false);
		}
		else if(e.getSource() == r){
			Data = 'r';
			processTurn();
			r.setEnabled(false);
		}
		else if(e.getSource() == s){
			Data = 's';
			processTurn();
			s.setEnabled(false);
		}
		else if(e.getSource() == t){
			Data = 't';
			processTurn();
			t.setEnabled(false);
		}
		else if(e.getSource() == u){
			Data = 'u';
			processTurn();
			u.setEnabled(false);
		}
		else if(e.getSource() == v){
			Data = 'v';
			processTurn();
			v.setEnabled(false);
		}
		else if(e.getSource() == w){
			Data = 'w';
			processTurn();
			w.setEnabled(false);
		}
		else if(e.getSource() == x){
			Data = 'x';
			processTurn();
			x.setEnabled(false);
		}
		else if(e.getSource() == y){
			Data = 'y';
			processTurn();
			y.setEnabled(false);
		}
		else if(e.getSource() == z){
			Data = 'z';
			processTurn();
			z.setEnabled(false);
		}
		else if(e.getSource() == play){
			A5.play();
			a.setEnabled(true);
			b.setEnabled(true);
			c.setEnabled(true);
			d.setEnabled(true);
			E.setEnabled(true);
			f.setEnabled(true);
			G.setEnabled(true);
			h.setEnabled(true);
			i.setEnabled(true);
			j.setEnabled(true);
			k.setEnabled(true);
			l.setEnabled(true);
			m.setEnabled(true);
			n.setEnabled(true);
			o.setEnabled(true);
			p.setEnabled(true);
			q.setEnabled(true);
			r.setEnabled(true);
			s.setEnabled(true);
			t.setEnabled(true);
			u.setEnabled(true);
			v.setEnabled(true);
			w.setEnabled(true);
			x.setEnabled(true);
			y.setEnabled(true);
			z.setEnabled(true);
			restart.setEnabled(true);
			play.setEnabled(false);
		}
		else if(e.getSource() == restart){
			initGame();
			a.setEnabled(true);
			b.setEnabled(true);
			c.setEnabled(true);
			d.setEnabled(true);
			E.setEnabled(true);
			f.setEnabled(true);
			G.setEnabled(true);
			h.setEnabled(true);
			i.setEnabled(true);
			j.setEnabled(true);
			k.setEnabled(true);
			l.setEnabled(true);
			m.setEnabled(true);
			n.setEnabled(true);
			o.setEnabled(true);
			p.setEnabled(true);
			q.setEnabled(true);
			r.setEnabled(true);
			s.setEnabled(true);
			t.setEnabled(true);
			u.setEnabled(true);
			v.setEnabled(true);
			w.setEnabled(true);
			x.setEnabled(true);
			y.setEnabled(true);
			z.setEnabled(true);
			Y = 120;
			P = 1;
		}
	}
	private void processTurn(){
		String  T;
		char A ;
		//s = Data;
		A = Data;
		if(word.indexOf(A) == -1){
			message = "";
			errors++;
			if(errors == DEAD){
		set(-1);
				A1.play();
				information = "Click on restart";
				JOptionPane.showMessageDialog(null, "YOU LOST -_- !!!\nClick on restart \n Answer : " + word);
				a.setEnabled(false);
				b.setEnabled(false);
				c.setEnabled(false);
				d.setEnabled(false);
				E.setEnabled(false);
				f.setEnabled(false);
				G.setEnabled(false);
				h.setEnabled(false);
				i.setEnabled(false);
				j.setEnabled(false);
				k.setEnabled(false);
				l.setEnabled(false);
				m.setEnabled(false);
				n.setEnabled(false);
				o.setEnabled(false);
				p.setEnabled(false);
				q.setEnabled(false);
				r.setEnabled(false);
				s.setEnabled(false);
				t.setEnabled(false);
				u.setEnabled(false);
				v.setEnabled(false);
				w.setEnabled(false);
				x.setEnabled(false);
				y.setEnabled(false);
				z.setEnabled(false);
				play.setEnabled(false);

			}
			return;
		}

		for(int i = 0 ; i < word.length() ; i++){
			if(word.charAt(i) == A){
				A4.play();
				word1.setCharAt(i, A);

			}
		}

		T = new String(word1);

		if(T.indexOf('.') == -1){

			set(1);
			A2.play();
			JOptionPane.showMessageDialog(null, "YOU WIN ^_^");
			a.setEnabled(false);
			b.setEnabled(false);
			c.setEnabled(false);
			d.setEnabled(false);
			E.setEnabled(false);
			f.setEnabled(false);
			G.setEnabled(false);
			h.setEnabled(false);
			i.setEnabled(false);
			j.setEnabled(false);
			k.setEnabled(false);
			l.setEnabled(false);
			m.setEnabled(false);
			n.setEnabled(false);
			o.setEnabled(false);
			p.setEnabled(false);
			q.setEnabled(false);
			r.setEnabled(false);
			s.setEnabled(false);
			t.setEnabled(false);
			u.setEnabled(false);
			v.setEnabled(false);
			w.setEnabled(false);
			x.setEnabled(false);
			y.setEnabled(false);
			z.setEnabled(false);
			play.setEnabled(false);
			return;
		}

		//Delete message
		repaint();
	}
	public void mousePressed(MouseEvent event){
		if(page == 1){
			if(event.getX() != 0){
				page = 2 ;
				repaint();
			}
		}
		else if(page == 2){

			if(event.getX() >= 270 && event.getY() >= 210 && event.getX() <= 405 && event.getY() <= 345 ){
				page = 3;
				repaint();
			}

		}
	}

	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseClicked(MouseEvent event) {}
	public void  set(int pit ){ pit= pit ; }
	public int  get( ){ return pit ;}

}

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.applet.*;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadRespond implements Runnable{
    
    private ServerSocket server;
    private int port;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;
	
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

    public MultiThreadRespond(int port){
        this.port = port;
        try{
           server = new ServerSocket(port);
        }catch(Exception e){
            
        }

    }

    @Override
    public void run(){

        String str = "Twilight|Batman|Titanic|Harry Potter|Frozen|	Minions|Skyfall|	Zootopia|Jurassic World|Black Panther|	Avatar|Aquaman|Intolerance|Cleopatra|Mickey|Wings|Cavalcade|Bambi |	Cinderella|Psycho         ";
		String[] temp;
		
		String delimiter = "\\|";
		temp = str.split(delimiter);
		Random random = new Random();
	
		int randomInt = random.nextInt(temp.length);
		word = new String(temp[randomInt]);
		char positions[] = new char[word.length()];
		for(int i = 0 ; i < word.length() ; i++){
			//A5.loop();
			positions[i] = '.';
		}
		String s = new String(positions);
		word1 = new StringBuffer(s);
		
		//Delete the message
		//System.out.print(word);
		//repaint();   �������͹


        while(true){
            try{
                Socket socket = server.accept();
                //read from socket to ObjectInputStream object
                ois = new ObjectInputStream(socket.getInputStream());
                //convert ObjectInputStream object to String
                String message = (String) ois.readObject();
                System.out.println("Message Received: " + message);
                //create ObjectOutputStream object
                oos = new ObjectOutputStream(socket.getOutputStream());
                //write object to Socket
                oos.writeObject("Hi Client "+message);
                //close resources
                ois.close();
                oos.close();
                socket.close();
                //terminate the server if client sends exit request
                if(message.equalsIgnoreCase("exit")) break;
            }catch(Exception e){

            }

        }
    }

}

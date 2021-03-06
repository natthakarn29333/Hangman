import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This class implements java socket client
 * @author pankaj
 *
 */
public class Client {

    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException{
        //get the localhost IP address, if server is running on some other IP, you need to use that
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        int port = 9876;
        for(int i=0; i<2;i++){
            socket = new Socket("127.0.0.1", port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            System.out.println("Sending request to Socket Server");
			
            if(i==2)oos.writeObject("exit");
            else  {oos.writeObject(""+i);	if(i==1)  {Hangman g = new Hangman();	 
																														Thread.sleep(35000); 
																														if(g.pit==1)System.out.println("YOU WIN"  );
																														else System.out.println("YOU LOST");
																														
																													}
							}
			
            ois = new ObjectInputStream(socket.getInputStream());
			
            String message = (String) ois.readObject();
            if(i==0){
                port = Integer.parseInt(message);
		
            }
            System.out.println("Message: " + message );
            //close resources
            ois.close();
            oos.close();
            Thread.sleep(1000);
			
        }
    }



}

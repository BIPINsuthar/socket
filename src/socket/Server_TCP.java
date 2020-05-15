
package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_TCP{
    
    public static void main(String args[]) throws Exception
    {
         
        System.out.println("server started");
        ServerSocket ss=new ServerSocket(1234);
        Socket s=ss.accept();
        System.out.println("accept");
        //DataInputStream d=new DataInputStream(ss.getInputStream());
        
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        String str=br.readLine();
        System.out.println("client data:"+str);
      
        String nick=str.substring(0,3);
        try (DataOutputStream d = new DataOutputStream(s.getOutputStream())) {
            PrintWriter p=new PrintWriter(d);
            d.writeUTF(nick);
          
        }

        
    
    }
    
}

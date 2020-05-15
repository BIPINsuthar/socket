
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server_TCP_2 
{
    public static void main(String args[]) throws IOException
    {
        //receive data
        ServerSocket ss=new ServerSocket(3000);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str=br.readLine();
        System.out.println("server side:"+str);
      
        //send data
        String str1="village->"+str;
        OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(o);
        p.write(str1);
        o.flush();
       
    }
    
}

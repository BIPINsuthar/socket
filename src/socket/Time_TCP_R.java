
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Time_TCP_R 
{
    public static void main(String args[]) throws IOException
    {
        ServerSocket ss=new ServerSocket(3455);
        Socket s=ss.accept();
        InputStreamReader i=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(i);
        String str=br.readLine();
        System.out.println(str);
        br.close();
        s.close();
    }
    
}

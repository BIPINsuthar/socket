
package socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class FileReseve_TCP 
{
    public static void main(String args[]) throws IOException
    {
        ServerSocket ss=new ServerSocket(2222);
        Socket s=ss.accept();
        DataInputStream d=new DataInputStream(s.getInputStream());
        //FileInputStream f=new FileInputStream();
        BufferedReader bf=new BufferedReader(new InputStreamReader(d));
        
        String str=bf.readLine();
             
    }
    
}

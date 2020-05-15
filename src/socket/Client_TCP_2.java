
package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client_TCP_2
{
    public static void main(String args[]) throws UnknownHostException, IOException
    {
        //send data
        Socket s=new Socket("localhost",3000);
        String k="katra samal";
        OutputStreamWriter out=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(out);
        p.write(k);
        out.flush();
       
        //receive data
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str1=br.readLine();
        System.out.println("client side"+str1);
         
    }
    
}

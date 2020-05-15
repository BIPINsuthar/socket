
package socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client_TCP 
{
    public static void main(String args[]) throws Exception
    {
       
            String n = "suthar bipin";
            Socket s = new Socket("127.168.1.2",1234);
            DataOutputStream d = new DataOutputStream(s.getOutputStream());
                PrintWriter p=new PrintWriter(d);
                d.writeUTF(n);
                d.flush();
           BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
           String str1=br.readLine();
            System.out.println("client data:"+str1);
    }
    
        
}
    

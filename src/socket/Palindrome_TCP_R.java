
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Palindrome_TCP_R 
{
    public static void main(String args[]) throws IOException
    {
        int i;
        String newstr="";
        ServerSocket ss=new ServerSocket(2222);
        Socket s=ss.accept();
        InputStreamReader io=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(io);
        String str=br.readLine();
        System.out.println("the String is"+str);
        for(i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            newstr+=ch;
        }
        if(str.equalsIgnoreCase(newstr))
        {
           System.out.println("this string is palindrome");
        }
        else
        {
            System.out.println("this string is not palindrome!");
            
        }
           
        br.close();       
        s.close();
    }
    
}

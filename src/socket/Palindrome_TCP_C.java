
package socket;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Palindrome_TCP_C
{
    public static void main(String args[]) throws IOException
    {
        
        Socket s=new Socket("localhost",2222);
        OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(o);
        System.out.println("please enter the string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        p.write(str);
        p.flush();
        p.close();
      
    }
    
}

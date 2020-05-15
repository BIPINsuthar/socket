
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Tcp_C
{
    public static void main(String args[]) throws IOException
    {
        Socket s=new Socket("localhost",1213);
        OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(o);
        Scanner sc=new Scanner(System.in);
        String chat=sc.nextLine();
        p.write(chat);
        
        
        InputStreamReader i=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(i);
        String result=br.readLine();
        System.out.println(result); 
        p.close();
        br.close();
        s.close();
    }
        
    
}

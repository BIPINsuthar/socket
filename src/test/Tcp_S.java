
package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Tcp_S 
{
    public static void main(String args[]) throws IOException
   {
       ServerSocket ss=new ServerSocket(1213);
       Socket s=ss.accept();
       InputStreamReader i=new InputStreamReader(s.getInputStream());
       BufferedReader br=new BufferedReader(i);
       String result=br.readLine();
       System.out.println(result);
       
       
       Scanner sc=new Scanner(System.in);
       String chat=sc.nextLine();
       OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
       PrintWriter p=new PrintWriter(o);
       p.write(chat);
  
       br.close();
       p.close();
       s.close(); 
   }
    
}

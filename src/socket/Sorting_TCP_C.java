
package socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Sorting_TCP_C 
{
   public static void main(String args[]) throws IOException
   {
       Socket s=new Socket("localhost",1234);
       OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
       PrintWriter p=new PrintWriter(o);
       System.out.println("enter the value of n");
       Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
       int a[]=new int[N];
       p.write(N);
       System.out.println("enter the element of array:");
       for(int i=0;i<N;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=0;i<N;i++)
       {
            p.write(a[i]);
       }
       p.close();
       s.close();
       
       
   
   }
    
}

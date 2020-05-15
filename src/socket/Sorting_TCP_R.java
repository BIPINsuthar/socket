
package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;


public class Sorting_TCP_R
{
    public static void main(String args[]) throws IOException
    {
      int i;
      ServerSocket ss=new ServerSocket(1234);
      Socket s=ss.accept();
      InputStreamReader io=new InputStreamReader(s.getInputStream());
      BufferedReader br=new BufferedReader(io);
      int n=br.read();
      int a[]=new int[n];
      for(i=0;i<n;i++)
      {
          a[i]=br.read();      
      }
      Arrays.sort(a);
      for(i=0;i<n;i++)
      {
         System.out.println(a[i]);
      }
      br.close();
      s.close();
    
    }
    
}

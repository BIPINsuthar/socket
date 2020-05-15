
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class ConString_S_UDP 
{
    public static void main(String args[]) throws SocketException, IOException
    {
       String str1 = null;
       DatagramSocket ds=new DatagramSocket(3334);
       while(true)
       {
           byte b[]=new byte[1024];
           DatagramPacket dp=new DatagramPacket(b,b.length);
           ds.receive(dp);
           String str=new String(dp.getData(),0,dp.getLength());
           if(!str.equals("exit"))
           {
                str1+=str;    
           }
           else
           {
               break;
           }
       }
       System.out.println(str1);
       ds.close();
       
    }
    
}

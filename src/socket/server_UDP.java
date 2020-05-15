
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


public class server_UDP 
{
    public static void main(String args[]) throws SocketException, IOException
    {
        DatagramSocket ds=new DatagramSocket();
        byte b[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,b.length);
        ds.receive(dp);
        
        String str=new String(dp.getData());
        int num=Integer.parseInt(str);
        System.out.println("num value:"+num);
        int result=num*num;
        
        byte[] b1=(result+"").getBytes();
        InetAddress i=InetAddress.getLocalHost();
        DatagramPacket dp1=new DatagramPacket(b1,b1.length,i,ds.getPort());
        ds.send(dp1);
              
        
        
    }
    
}

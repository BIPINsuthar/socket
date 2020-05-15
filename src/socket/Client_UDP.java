
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Client_UDP {
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException
    {
        System.out.println("by");
        DatagramSocket ds=new DatagramSocket();
        int var=8;
        byte[] v = (var+"").getBytes();
        InetAddress i= InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(v,v.length,i,9999);
        ds.send(dp);
        
        byte[] v1=new byte[1024];
        DatagramPacket d1=new DatagramPacket(v1,v1.length);
        ds.receive(d1);
        
        String str=new String(d1.getData());
        System.out.println("result is"+str);
        
    }
}

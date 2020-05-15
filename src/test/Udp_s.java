
package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Udp_s 
{
    public static void main(String args[]) throws SocketException, IOException
    {
        try (DatagramSocket s = new DatagramSocket(1212)) {
            byte b[]=new byte[1024];
            DatagramPacket p=new DatagramPacket(b,b.length);
            s.receive(p);
            String str=new String(p.getData(),0,p.getLength());
            int value=Integer.parseInt(str);
            System.out.println(str);
        }
       
    }
    
}


package test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


public class Udp_c
{
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException
    {
        DatagramSocket d=new DatagramSocket();
        InetAddress i=InetAddress.getLocalHost();
        int value=3;
        byte b[]=(value+"").getBytes();
        
        DatagramPacket p=new DatagramPacket(b,b.length,i,1212);
        d.send(p);
        d.close();
    }
    
}

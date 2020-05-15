
package socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;


public class ConString_C_UDP 
{
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException
    {
        DatagramSocket ds=new DatagramSocket();
        InetAddress ip=InetAddress.getLocalHost();
        while(true)
        {
        System.out.println("enter the string");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        if(str.equals("exit"))
        {    
            break;
        }
        else
        {
             byte b[]=str.getBytes();
             DatagramPacket dp=new DatagramPacket(b,b.length,ip,3334);
             ds.send(dp);
        }
        }
              
    }
    
}

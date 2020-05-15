
package socket;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client_UDP_
{
    public static void main(String args[])throws java.net.SocketException, UnknownHostException, IOException
   {
       //send data
        DatagramSocket ds=new DatagramSocket();
        System.out.println("enter the string which you want to send servler");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        byte b[]=str.getBytes();
        InetAddress ip=InetAddress.getLocalHost();
        DatagramPacket dp=new DatagramPacket(b,b.length,ip,3000);
        ds.send(dp);
     
        //recieve data
        byte b1[]=new byte[1024];
        DatagramPacket dp1=new DatagramPacket(b1,b1.length);
        ds.receive(dp1);
        String str1=new String(dp1.getData(),0,dp1.getLength());
        System.out.println("client"+str1);
        ds.close();
              
    }
    
}

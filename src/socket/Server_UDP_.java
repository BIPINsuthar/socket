
package socket;

import java.io.IOException;
import java.net.*;

public class Server_UDP_ 
{
    public static void main(String args[]) throws SocketException, IOException
    {
        //receive data 
        DatagramSocket ds=new DatagramSocket(3000);
        byte r[]=new byte[1024];
        DatagramPacket dp=new DatagramPacket(r,r.length);
        ds.receive(dp);
        String str=new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
     
        //send data
        String str1="suthar"+str;
        byte b[]=str1.getBytes();
        InetAddress ip=InetAddress.getLocalHost();
        DatagramPacket dp1=new DatagramPacket(b,b.length,ip,dp.getPort());
        ds.send(dp1);
        ds.close();
    }
    
}

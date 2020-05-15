
package socket;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class FileTransfer_TCP
{
    public static void main(String args[]) throws IOException
    {
        Socket s=new Socket("localhost",2222);
        DataOutputStream d=new DataOutputStream(s.getOutputStream());
        FileOutputStream f=new FileOutputStream("C:\\Users\\DELL\\Desktop\\net.txt");
        PrintWriter p=new PrintWriter(d);
      
    }
    
}

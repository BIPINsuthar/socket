package socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class Time_TCP_C 
{
    public static void main(String args[]) throws IOException
    {
        Socket s=new Socket("localhost",3455);
        OutputStreamWriter o=new OutputStreamWriter(s.getOutputStream());
        PrintWriter p=new PrintWriter(o);
        String date=(new Date()).toString();
        p.write(date);
        p.close();
        
    
    }
    
}

package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest
{

    public static void main(String[] args) throws IOException
    {
        try(FileOutputStream fos = new FileOutputStream("print.txt");
            PrintStream ps = new PrintStream(fos))
        {
            ps.println("字符串");
            ps.println(new PrintStreamTest());
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

}

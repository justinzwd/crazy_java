package chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class FinallyTest
{

    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("a.txt");
        }
        catch (IOException ioe)
        {
            System.out.println(ioe.getMessage());
            //finally语句会在return语句执行前就已经执行过了
            //return;
            //System.exit(1);会使得程序跳过finally语句块
            System.exit(1);
        }
        finally
        {
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException ioe)
                {
                    ioe.printStackTrace();
                }
            }

            System.out.println("资源被回收");
        }
    }
}

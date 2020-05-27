package chapter15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest
{

    public static void main(String[] args) throws IOException
    {
        try(FileWriter fw = new FileWriter("poem.txt"))
        {
            fw.write("静夜思\r\n");
            fw.write("你好啊\r\n");
            fw.write("你也是\r\n");
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
}

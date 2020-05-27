package chapter15;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest
{

    public static void main(String[] args) throws IOException
    {
        try
                (FileReader fileReader = new FileReader("E:\\IdeaProjects\\crazy_java\\src\\chapter15\\FileReaderTest.java"))

        {
            char[] cbuf = new char[32];
            int hasReaad = 0;
            while((hasReaad = fileReader.read(cbuf)) > 0)
            {
                System.out.print(new String(cbuf,0,hasReaad));
            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

}

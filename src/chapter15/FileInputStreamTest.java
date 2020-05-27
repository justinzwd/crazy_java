package chapter15;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest
{

    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream = new FileInputStream("E:\\IdeaProjects\\crazy_java\\src\\chapter15\\FileInputStreamTest.java");
        //下面这种写法不行，因为现实中本文件是存放在一定的文件夹当中，比如指明路径
        FileInputStream fileInputStream1 = new FileInputStream("FileInputStreamTest.java");
        byte[] bbuf = new byte[1024];
        int hasRead = 0;
        while((hasRead = fileInputStream.read(bbuf)) > 0)
        {
            System.out.println(new String(bbuf,0,hasRead));
        }
        fileInputStream.close();
    }
}

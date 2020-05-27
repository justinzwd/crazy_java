package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject
{

    public static void main(String[] args)
    {
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.txt"));
                )
        {
            Person ps = new Person("nihao",22);
            oos.writeObject(ps);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

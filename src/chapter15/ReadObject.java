package chapter15;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject
{

    public static void main(String[] args)
    {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.txt"));
                )
        {
            Person p = (Person)ois.readObject();
            System.out.println("这个Person对象的姓名是 "+p.getName()+"年龄是 "+p.getAge());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

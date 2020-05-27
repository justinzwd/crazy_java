package chapter5;

import java.io.PipedWriter;

public class Person
{

    private String name;
    private int age;

    public void setAge(int age)
    {
        if (age > 100 || age < 0)
        {
            System.out.println("年龄设置不合理");
        }
        else
        {
            this.age = age;
        }
    }

    public int getAge()
    {
        return this.age;
    }

    public void setName(String name)
    {
        if (name.length() > 6 || name.length() < 2)
        {
            System.out.println("名字长度设置不合理");
        }
        else
        {
            this.name = name;
        }
    }

    public String getName()
    {
        return this.name;
    }


}

package chapter5;

public class Person22
{
    {
        int a = 4;
        if (a > 2)
        {
            System.out.println("Person的第一个初始化块：局部变量大于2");
        }
        System.out.println("Person的第一个初始化块");
    }

    {
        System.out.println("Person的第二个初始化块");
    }

    public Person22()
    {
        System.out.println("Person的构造器");
    }

    public static void main(String[] args)
    {
        new Person22();
    }
}

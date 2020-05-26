package chapter14;

public class DeprecatedTest
{

    public static void main(String[] args)
    {
        new Banana().info();
    }
}

class Banana
{
    @Deprecated
    public void info()
    {
        System.out.println("banana的info方法");
    }
}
package chapter6;

public class NullAccessStatic
{
    public static void test()
    {
        System.out.println("static类方法");
    }

    public static void main(String[] args)
    {
        NullAccessStatic nas = null;
        nas.test();
    }
}

package chapter5;

public class StaticInitTest
{
    static
    {
        a = 6;
    }

    static int a = 99;

    public static void main(String[] args)
    {
        System.out.println(StaticInitTest.a);
    }
}

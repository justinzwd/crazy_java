package chapter5;

public class InstanceInitTest
{

    {
        a = 9;
    }

    int a = 6;

    public static void main(String[] args)
    {
        System.out.println(new InstanceInitTest().a);
    }
}

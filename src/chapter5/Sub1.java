package chapter5;

class Base1
{
    public Base1()
    {
        test();
    }

    public void test()
    {
        System.out.println("将被子类重写的test方法");
    }
}

public class Sub1 extends Base1
{
    private String name;
    public void test()
    {
        System.out.println("子类重写父类的test方法 and name的长度为" + name.length());
    }

    public static void main(String[] args)
    {
        //Exception in thread "main" java.lang.NullPointerException 空指针异常
        //Sub1 s = new Sub1();
    }
}

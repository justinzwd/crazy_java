package chapter5;

class BaseClass
{
    public int book = 6;
    //父类普通变量
    public int agef = 33;
    //父类普通方法
    public void run()
    {
        System.out.println("this is fu running");
    }
    public void test()
    {
        System.out.println("父类的方法test");
    }
}

public class SubClass extends BaseClass
{
    public int book = 10;
    public void test()
    {
        System.out.println("子类的方法test");
    }
    //子类普通变量
    public int agez = 9;
    //子类普通方法
    public void runz()
    {
        System.out.println("this is zi running");
    }

    public static void main(String[] args)
    {
        BaseClass bc = new SubClass();
        System.out.println(bc.book);
        System.out.println(bc.agef);
//        System.out.println(bc.agez); 不能输出，因为编译的时候是父类的类型，没有这个变量
        bc.test();
        bc.run();
//        bc.runz(); 不能运行
    }
}

/**
 BaseClass bc = new SubClass();
 对于这样的多态引用
 1.变量   只能输出父类的变量，因为编译的时候只有父类的变量是存在的
 2.方法   一般情况下只能运行父类的方法，子类的方法是不能编译成功的。
         但是一旦子类和父类有同名方法的话，编译那关可以顺利通过。等到运行的时候，就会运行子类的覆盖之后的方法
 如果连编译都无法成功的话，更别谈运行了
 */
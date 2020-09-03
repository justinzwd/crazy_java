package chapter16;

class A
{

    public synchronized void foo(B b)
    {
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了A类的foo()方法中");
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 正在尝试进入B类的last()方法");

        b.last();
    }

    public synchronized void last()
    {
        System.out.println("进入A类的last()方法内部");
    }
}

class B
{
    public synchronized void bar(A a)
    {
        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 进入了B类的bar()方法中");
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("当前线程名：" + Thread.currentThread().getName() + " 正在尝试进入A类的last()方法");

        a.last();

    }

    public synchronized void last()
    {
        System.out.println("进入B类的last()方法内部");
    }
}

public class DeadLock implements Runnable
{
    A a = new A();
    B b = new B();

    public void init()
    {
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入主线程之后");
    }

    public void run()
    {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入副线程之后");
    }

    public static void main(String[] args)
    {
        DeadLock dl1 = new DeadLock();
        new Thread(dl1).start();
        dl1.init();
    }

}

package chapter16;

public class DrawTest
{

    public static void main(String[] args)
    {
        Account account = new Account("123456", 1000);

        //模拟两个线程同时取钱
        //new DrawThread("线程一", account, 800).start();
        //new DrawThread("线程一", account, 800).start();

        new DrawThreadSynchronized("线程一", account, 800).start();
        new DrawThreadSynchronized("线程二", account, 800).start();
    }
}

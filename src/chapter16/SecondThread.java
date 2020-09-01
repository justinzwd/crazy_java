package chapter16;

public class SecondThread implements Runnable
{
    private int i;

    public void run()
    {
        for ( ; i<100;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args)
    {
        SecondThread st = new SecondThread();

        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i==20)
            {
                new Thread(st,"线程1").start();
                new Thread(st,"线程2").start();
            }
        }
    }
}

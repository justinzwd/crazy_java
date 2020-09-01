package chapter16;

public class StartDead extends Thread
{
    private int i;

    public void run()
    {
        for ( ; i<100; i++)
        {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args)
    {
        StartDead sd = new StartDead();

        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i==20)
            {
                sd.start();
                System.out.println(sd.isAlive());
            }

            //不能重启死亡进程
            if (i>20 && !sd.isAlive())
            {
                sd.start();
            }
        }

    }
}

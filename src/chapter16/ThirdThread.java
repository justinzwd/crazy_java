package chapter16;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread
{

    public static void main(String[] args)
    {
        //创建callable对象
        ThirdThread thirdThread = new ThirdThread();

        //使用Lambda表达式创建Callable对象
        //使用FutureTask来包装Callable

        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) ()-> {
            int i = 0;

            for ( ; i<100;i++)
            {
                System.out.println(Thread.currentThread().getName()+" " + i);
            }

            return i;
        });

        for (int i=0;i<100;i++)
        {
            System.out.println(Thread.currentThread().getName()+" 的循环变量i值是:"+i);
            if (i==20)
            {
                new Thread(task,"有返回值的线程").start();
            }
        }

        try
        {
            System.out.println("子线程返回值："+task.get());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

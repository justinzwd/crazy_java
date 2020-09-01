package chapter16;


public class PriorityTest extends Thread
{
    public PriorityTest(String name)
    {
        super(name);
    }

    public void run()
    {
        for (int i=0;i<50;i++)
        {
            System.out.println(getName() + " 其优先级是：" + getPriority() + ", 循环变量是：" + i );
        }
    }

    public static void main(String[] args)
    {
        Thread.currentThread().setPriority(6);

        for (int i=0;i<30;i++)
        {
            if (i==10)
            {
                PriorityTest pt1 = new PriorityTest("低级");
                pt1.start();
                System.out.println("创建之初的优先级是：" + pt1.getPriority());
                pt1.setPriority(Thread.MIN_PRIORITY);
            }

            if (i==20)
            {
                PriorityTest pt2 = new PriorityTest("高级");
                pt2.start();
                System.out.println("创建之初的优先级是：" + pt2.getPriority());
                pt2.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}

package chapter16;

public class DrawThread extends Thread
{
    private Account account;

    private double drawAmount;

    //有参数构造器
    public DrawThread(String name, Account account, double drawAmount)
    {
        super(name);
        this.account = account;
        this.drawAmount = drawAmount;
    }

    //run()方法
    //当多个线程同时修改同一个共享数据时，将会引起线程安全问题
    public void run()
    {
        if (account.getAccountBalance() >= drawAmount)
        {
            System.out.println(getName() + "取现成功，请取走钞票！" + drawAmount);

            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            account.setAccountBalance(account.getAccountBalance()-drawAmount);
            System.out.println("余额为：" + account.getAccountBalance());
        }
        else
        {
            System.out.println("余额不足，取钱失败！");
        }
    }
}

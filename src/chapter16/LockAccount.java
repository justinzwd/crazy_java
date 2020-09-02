package chapter16;

import java.util.concurrent.locks.ReentrantLock;

public class LockAccount
{

    private final ReentrantLock lock = new ReentrantLock();

    //封装账户编号和账户余额等两个成员变量
    private String accountNo;
    private double accountBalance;

    //空构造器
    public LockAccount(){}

    //有参数构造器
    public LockAccount(String accountNo, double accountBalance)
    {
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    //accountNo的setter()和getter()方法

    public String getAccountNo()
    {
        return accountNo;
    }

    public void setAccountNo(String accountNo)
    {
        this.accountNo = accountNo;
    }

    //由于余额不能随便修改，所以只提供getter()方法
    public double getAccountBalance()
    {
        return accountBalance;
    }

    //线程安全的draw()方法
    public void run(double drawAmount)
    {
        lock.lock();
        try
        {
            if (getAccountBalance() >= drawAmount)
            {
                System.out.println("取现成功！" + drawAmount);

                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

                //更新余额
                accountBalance = getAccountBalance() - drawAmount;
                System.out.println("余额为：" + getAccountBalance());
            }
            else
            {
                System.out.println("余额不足，无法完成操作！");
            }

        }
        finally
        {
            lock.unlock();
        }
    }

    //hashcode
    public int hashcode()
    {
        return accountNo.hashCode();
    }

    //equals()
    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (obj!=null && obj.getClass() == LockAccount.class)
        {
            LockAccount target = (LockAccount) obj;
            return target.getAccountNo().equals(obj);
        }

        return false;
    }


}

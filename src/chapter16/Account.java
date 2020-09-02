package chapter16;

public class Account
{
    //封装账户编号和账户余额等两个成员变量
    private String accountNo;
    private double accountBalance;

    //空构造器
    public Account(){}

    //有参数构造器
    public Account(String accountNo, double accountBalance)
    {
        this.accountBalance = accountBalance;
        this.accountNo = accountNo;
    }

    //两个成员变量的setter()和getter()方法

    public String getAccountNo()
    {
        return accountNo;
    }

    public void setAccountNo(String accountNo)
    {
        this.accountNo = accountNo;
    }

    public double getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance)
    {
        this.accountBalance = accountBalance;
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

        if (obj!=null && obj.getClass() == Account.class)
        {
            Account target = (Account) obj;
            return target.getAccountNo().equals(obj);
        }

        return false;
    }


}

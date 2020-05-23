package chapter10;

import java.util.Date;

public class NullTest
{

    public static void main(String[] args)
    {
        Date d = null;

        try
        {
            System.out.println(d.after(new Date()));
        }
        catch (NullPointerException ne)
        {
            System.out.println("空指针异常");
        }
        //先捕获小异常，再捕获大异常
        catch (Exception e)
        {
            System.out.println("未知异常");
        }
    }
}

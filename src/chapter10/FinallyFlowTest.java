package chapter10;

public class FinallyFlowTest
{

    public static void main(String[] args)
    {
        boolean a = test();
        System.out.println(a);
    }

    public static boolean test()
    {
        try
        {
            //如果在finally里定义return语句，则try/catch语句里面的return将失效
            return true;
        }
        finally
        {
            return false;
        }
    }
}

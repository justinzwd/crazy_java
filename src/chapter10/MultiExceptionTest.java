package chapter10;

public class MultiExceptionTest
{

    public static void main(String[] args)
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是：" + c);
        }
        catch (IndexOutOfBoundsException | NumberFormatException | ArithmeticException ie)
        {
            System.out.println("程序越界、数字格式异常、算数异常中的一种");
            //捕获多异常，异常变量由final默认修饰，所以不能再重新赋值
            //ie = new ArithmeticException("test");
        }
        catch (Exception e)
        {
            System.out.println("未知异常");
            e = new RuntimeException("test");
        }
    }
}

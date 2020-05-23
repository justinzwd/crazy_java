package chapter10;

public class DivTest
{

    //How to input -- program arguments
    //Run - Edit Configurations - Program Arguments
    public static void main(String[] args)
    {
        try
        {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a / b;
            System.out.println("您输入的两个数相除的结果是：" + c);
        }
        catch (NumberFormatException ne)
        {
            System.out.println("只能接收整数");
        }
        catch (IndexOutOfBoundsException ie)
        {
            System.out.println("数组越界：运行程序时输入的参数不够");
        }
        catch (ArithmeticException ae)
        {
            System.out.println("算术异常");
        }
        catch (Exception e)
        {
            System.out.println("未知异常");
        }
    }
}

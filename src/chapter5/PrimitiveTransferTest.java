package chapter5;

class DataWrap
{
    int a = 5;
    int b = 6;
}
public class PrimitiveTransferTest
{
    public static void swap(DataWrap dw)
    {
        int temp;
        temp = dw.a;
        dw.a = dw.b;
        dw.b = temp;

        dw = null;
    }
    public static void main(String[] args)
    {
        PrimitiveTransferTest p = new PrimitiveTransferTest();
        DataWrap dw = new DataWrap();
        p.swap(dw);
        System.out.println("a = " + dw.a);
        System.out.println("b = " + dw.b);
    }
}

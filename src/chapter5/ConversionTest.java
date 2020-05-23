package chapter5;

public class ConversionTest
{

    public static void main(String[] args)
    {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
//        boolean b = (boolean) in;
        Object obj = "Hello";
        String objstr = (String)obj;
        System.out.println(objstr);
        Object objPri = new Integer(5);
        System.out.println(objPri);
        if (objPri instanceof String)   //加上条件之后，不会报错
        {
            String str = (String)objPri;   //ClassCastException
        }

    }

}

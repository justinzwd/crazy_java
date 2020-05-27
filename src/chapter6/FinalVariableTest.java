package chapter6;

public class FinalVariableTest
{

    final int a = 6;
    final String str;
    final int c;
    final static double d;

    //final char ch;

    {
        str = "Hello";
        //a = 9
    }

    static
    {
        d = 5.6;
    }

    public FinalVariableTest()
    {
        c = 5;
        //str = "java";
    }

    public void changeFinal()
    {
        //d = 1.2;
        //ch = 'a';
        //str = "nihao";
    }

    public static void main(String[] args)
    {
        FinalVariableTest ft = new FinalVariableTest();
        System.out.println(ft.a);
        System.out.println(ft.c);
        System.out.println(ft.d);
    }
}

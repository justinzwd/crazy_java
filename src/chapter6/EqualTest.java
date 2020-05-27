package chapter6;

public class EqualTest
{

    public static void main(String[] args)
    {
        int it = 65;
        float ft = 65.0f;
        System.out.println("65和65.0f是否相等？" + (it == ft));

        char ch = 'A';
        System.out.println("65和'A'是否相等？" + (it == ch));

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2));
        System.out.println("str1和str2是否相等？" + (str1.equals(str2)));

        //System.out.println("hello" == new EqualTest());

    }
}

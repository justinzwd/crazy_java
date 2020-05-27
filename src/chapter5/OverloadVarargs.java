package chapter5;

public class OverloadVarargs
{

    public void test(String msg)
    {
        System.out.println("只有一个参数");
    }

    public void test(String... msg)
    {
        System.out.println("有好多参数");
    }

    public static void main(String[] args)
    {
        OverloadVarargs ov = new OverloadVarargs();
        ov.test("nihao");
        ov.test("nihao", "hhhh");
//        ov.test(new String[]{"nihao"});
    }

}

package chapter6;

public interface Output
{

    int MAX_CACHE_LINE = 50;

    void out();

    void getData(String msg);

    default void print(String... msg)
    {
        for (String m : msg)
        {
            System.out.println(m);
        }
    }

    default void test()
    {
        System.out.println("默认的test方法");
    }

    static String staticTest()
    {
        return "接口里的类方法";
    }
}
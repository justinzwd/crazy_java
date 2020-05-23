package chapter5;

public class InstanceofTest
{

    public static void main(String[] args)
    {
//        Object hello = "hello";
//        System.out.println(hello instanceof Object);
//        System.out.println(hello instanceof Math);
//        System.out.println(hello instanceof String);
//        System.out.println(hello instanceof Integer);
        String hello = "hello";
        System.out.println(hello instanceof Object);
//        System.out.println(hello instanceof Math); 编译不成功
        System.out.println(hello instanceof String);
//        System.out.println(hello instanceof Integer);  编译不成功
    }
}

package chapter5;

public class ConstructorTest
{
    public String name;
    public int age;

    //构造器返回值不能用void
    public ConstructorTest(String name,int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        ConstructorTest c = new ConstructorTest("nihao",20);
        System.out.println(c.name);
        System.out.println(c.age);
        //打印没有符合预期效果，因为自己定义的构造器不能再创造新的对象了
        ConstructorTest c1 = new ConstructorTest("hh",30);
        System.out.println(c.name);
        System.out.println(c.age);
    }
}

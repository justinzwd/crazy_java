package chapter5;

public class Person2Test
{

    public static void main(String[] args)
    {
        Person p = new Person();
//        p.age = 1000;
        p.setAge(1000);
//        System.out.println("age = " + p.age);
        p.setAge(99);
        System.out.println("age = " + p.getAge());
        p.setName("离地嘎嘎");
        System.out.println("name = " + p.getName());
    }
}

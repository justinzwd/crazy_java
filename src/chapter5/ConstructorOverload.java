package chapter5;

public class ConstructorOverload
{

    public int age;
    public String name;

    public ConstructorOverload()
    {

    }

    public ConstructorOverload(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args)
    {
        ConstructorOverload c1 = new ConstructorOverload();
        System.out.println("c1.age=" + c1.age);
        ConstructorOverload c2 = new ConstructorOverload("nihao", 30);
        System.out.println("c1.age=" + c2.age);
    }

}

package chapter15;

public class Person implements java.io.Serializable
{
    private String name;
    private int age;

    public Person(String name,int age)
    {
        System.out.println("有参数的构造器");
        this.age =  age;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

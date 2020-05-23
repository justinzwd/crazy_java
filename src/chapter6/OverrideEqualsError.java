package chapter6;

class Person
{
    public boolean equals(Object obj)
    {
        return true;
    }
}

class Dog{}

public class OverrideEqualsError
{

    public static void main(String[] args)
    {
        Person p = new Person();
        System.out.println(p.equals(new Dog()));
        System.out.println(p.equals(new String("nihao")));
    }
}

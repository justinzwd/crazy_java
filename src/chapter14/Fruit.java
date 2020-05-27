package chapter14;

public class Fruit
{

    public void info()
    {
        System.out.println("水果的info方法");
    }
}

class Apple extends Fruit
{

    @Override
    public void info()
    {
        System.out.println("apple");
    }
}
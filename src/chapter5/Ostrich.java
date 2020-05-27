package chapter5;

public class Ostrich extends Bird
{

    public void say()
    {
        System.out.println("I can only run on the ground");
    }

    public static void main(String[] args)
    {
        Ostrich o = new Ostrich();
        o.say();
    }
}

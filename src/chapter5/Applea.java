package chapter5;

public class Applea extends Fruit
{

    public static void main(String[] args)
    {
        Applea a = new Applea();
        a.weight = 10;
        System.out.println(a.weight);
        a.info();
    }
}

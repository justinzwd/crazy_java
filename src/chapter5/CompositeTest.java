package chapter5;

class Animal1
{

    private void beat()
    {
        System.out.println("心脏跳动。。。");
    }

    public void breath()
    {
        beat();
        System.out.println("呼气吸气");
    }
}

class Bird1
{

    private Animal1 a;

    public Bird1(Animal1 a)
    {

        this.a = a;
    }

    public void breath()
    {
        a.breath();
    }

    public void fly()
    {
        System.out.println("在天空中飞翔");
    }
}

class Wolf1
{

    private Animal1 a;

    public Wolf1(Animal1 a)
    {
        this.a = a;
    }

    public void run()
    {
        System.out.println("在草原上奔跑");
    }

    public void breath()
    {
        a.breath();
    }
}

public class CompositeTest
{

    public static void main(String[] args)
    {
        Animal1 a = new Animal1();
        Bird1 b = new Bird1(a);
        b.breath();
        b.fly();
        Wolf1 w = new Wolf1(a);
        w.breath();
        w.run();
    }
}

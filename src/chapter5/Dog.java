package chapter5;

public class Dog
{
    public void jump()
    {
        System.out.println("jumping is running");
    }
    public void run()
    {
        jump();
        System.out.println("running is running");
    }
    public static void main(String[] args)
    {
        new Dog().run();

    }
}

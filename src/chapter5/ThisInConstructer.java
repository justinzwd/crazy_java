package chapter5;

public class ThisInConstructer
{

    public int foo;

    public ThisInConstructer()
    {
        int foo;
        this.foo = 6;
    }

    public static void main(String[] args)
    {
        System.out.println(new ThisInConstructer().foo);
    }
}

package chapter5;

class Base
{

    public double size;
    public String name;

    public Base(double size, String name)
    {
        this.name = name;
        this.size = size;
    }
}

public class Sub extends Base
{

    public String color;

    public Sub(double size, String name, String color)
    {
        super(size, name);
        this.color = color;
    }

    public static void main(String[] args)
    {
        Sub s = new Sub(5.6, "nihao", "yellow");
        System.out.println(s.size + "---" + s.name + "---" + s.color);
    }
}

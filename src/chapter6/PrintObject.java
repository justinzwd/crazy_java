package chapter6;

public class PrintObject
{

    private String name;

    public PrintObject(String name)
    {
        this.name = name;
    }

    public static void main(String[] args)
    {
        PrintObject p = new PrintObject("nihao");
        System.out.println(p);
        System.out.println(p.toString());
    }
}

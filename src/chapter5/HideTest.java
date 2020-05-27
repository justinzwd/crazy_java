package chapter5;

class Parent
{

    public String tag = "parent";
}

class Derived extends Parent
{

    private String tag = "child";
}

public class HideTest
{

    public static void main(String[] args)
    {
        Derived d = new Derived();
//        System.out.println(d.tag);
        System.out.println(((Parent) d).tag);
    }

}

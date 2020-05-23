package chapter5;

public class People
{
    public String name;
    public int age;
    public void say(String content)
    {
        System.out.println(content);
    }
    public static void main(String[] args)
    {
        People p = new People();
        p.name = "nihao";
        p.age = 12;
        p.say("nihaoa");
        System.out.println(p.age);

        People p2 = p;
    }
}

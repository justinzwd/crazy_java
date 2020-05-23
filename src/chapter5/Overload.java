package chapter5;

public class Overload
{
    public void run()
    {
        System.out.println("无参数");
    }

    public void run(int n)
    {
        for(int i=1;i <= n;i++)
        {
            System.out.println("有参数");
        }
    }
    public static void main(String[] args)
    {
        Overload ol = new Overload();
        ol.run();
        ol.run(5);
    }
}

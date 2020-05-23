package chapter5;

class Root
{

    static
    {
        System.out.println("Root的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root()
    {
        System.out.println("Root的无参数构造器");
    }
}

class Mid extends Root
{
    static
    {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid()
    {
        System.out.println("Mid的无参数构造器");
    }
    public Mid(String msg)
    {
        this();
        System.out.println("Mid的有参数构造器："+msg);
    }
}

class Leaf extends Mid
{
    static
    {
        System.out.println("Leaf的静态初始化块");
    }
    {
        System.out.println("Leaf的普通初始化块");
    }
    public Leaf()
    {
        super("nihao");
        System.out.println("Leaf的无参数构造器");
    }
}

public class Test
{

    public static void main(String[] args)
    {
        new Leaf();
        System.out.println("-------------------");
        new Leaf();
    }
}

/**
 * Root的静态初始化块
 * Mid的静态初始化块
 * Leaf的静态初始化块
 * Root的普通初始化块
 * Root的无参数构造器
 * Mid的普通初始化块
 * Mid的无参数构造器
 * Mid的有参数构造器：nihao
 * Leaf的普通初始化块
 * Leaf的无参数构造器
 * -------------------
 * Root的普通初始化块
 * Root的无参数构造器
 * Mid的普通初始化块
 * Mid的无参数构造器
 * Mid的有参数构造器：nihao
 * Leaf的普通初始化块
 * Leaf的无参数构造器
 * */
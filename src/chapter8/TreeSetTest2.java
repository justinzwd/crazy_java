package chapter8;

import java.util.TreeSet;

class Z implements Comparable
{
    int age;
    public Z(int age)
    {
        this.age = age;
    }
    public boolean equals(Object object)
    {
        return true;
    }
    public int compareTo(Object object)
    {
        return 1;
    }
}
public class TreeSetTest2
{

    public static void main(String[] args)
    {
        TreeSet set = new TreeSet();
        Z z1 = new Z(6);
        set.add(z1);
        System.out.println(set.add(z1));
        System.out.println(set);
        ((Z)set.first()).age = 9;
        System.out.println(((Z)set.last()).age);
    }
}

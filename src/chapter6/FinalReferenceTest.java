package chapter6;

import java.util.Arrays;

class Personn
{

    private int age;

    public Personn()
    {
    }

    public Personn(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

public class FinalReferenceTest
{

    public static void main(String[] args)
    {
        final int[] iArr = {5, 6, 12, 9};
        System.out.println(Arrays.toString(iArr));
        Arrays.sort(iArr);
        System.out.println(Arrays.toString(iArr));
        iArr[2] = -8;
        System.out.println(Arrays.toString(iArr));
        //iArr = null;

        final Personn p = new Personn(45);
        p.setAge(32);
        System.out.println(p.getAge());
        //p = null;
    }

}

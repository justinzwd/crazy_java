package com.man.divideandconquer;

public class HanNuoTa
{

    public static void main(String[] args)
    {

        //moveTower(1,'a','b','c');
        moveTower(3,'a','b','c');
    }

    public static void moveTower(int num, char a, char b, char c)
    {
        if (num == 1)   //如果只有一个盘的话
        {
            System.out.println("第 " + num + " 个从"+a+"到"+c);
        }
        else
        {
            //大于等于两个的，相当于两部分，最下面一个和其余上面所有的一部分

            //1.上面部分从a到b，移动过程中借助c
            moveTower(num-1,a,c,b);

            //2.最下面的一个从a到c，不需要借助其他
            System.out.println("第 " + num + " 个从"+a+"到"+c);

            //3.上面部分从b到c，借助a
            moveTower(num-1,b,a,c);
        }
    }

}

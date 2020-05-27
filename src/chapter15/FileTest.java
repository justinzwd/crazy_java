package chapter15;

import java.io.File;

public class FileTest
{

    public static void main(String[] args)
    {
        //以当前路径创建一个File对象
        File file = new File(".");
        System.out.println(file.getName());
        //获取相对路径的父路径时，可能会出错，所以下面语句输出null
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());


    }
}

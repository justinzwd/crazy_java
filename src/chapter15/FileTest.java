package chapter15;

import java.io.File;
import java.io.IOException;

public class FileTest
{

    public static void main(String[] args) throws IOException
    {
        //以当前路径创建一个File对象
        File file = new File(".");
        System.out.println(file.getName());
        //获取相对路径的父路径时，可能会出错，所以下面语句输出null
        System.out.println(file.getParent());
        //获取绝对路径
        //System.out.println(file.getAbsoluteFile());
        //System.out.println(file.getAbsolutePath());

        System.out.println(file.getAbsoluteFile().getParent());

        File tmpFile = File.createTempFile("aaa",".txt",file);
        tmpFile.deleteOnExit();

        File newFile = new File(System.currentTimeMillis() + "");
        System.out.println("newFile的文件名是："+newFile.getName());
        System.out.println("newFile对象是否存在" + newFile.exists());     //false
        //newFile.createNewFile();
        System.out.println(newFile.mkdir());
        System.out.println("newFile对象是否存在" + newFile.exists());     //true

        String[] fileList = file.list();
        System.out.println("当前路径下所有的文件和路径如下：");
        for (String filename : fileList)
        {
            System.out.println(filename);
        }

        //listRoots()静态方法列出所有的磁盘根路径
        File[] roots = File.listRoots();
        System.out.println("所有的根路径如下：");
        for (File root : roots)
        {
            System.out.println(root);
        }
    }
}

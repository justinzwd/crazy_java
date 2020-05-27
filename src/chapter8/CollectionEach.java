package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class CollectionEach
{

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));
    }

}

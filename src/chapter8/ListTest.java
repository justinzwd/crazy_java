package chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListTest
{

    public static void main(String[] args)
    {
        List books = new ArrayList();
        books.add(new String("轻量级java EE"));
        books.add(new String("疯狂java EE"));
        books.add(new String("疯狂安卓"));
        System.out.println(books);
        books.add(1, new String("疯狂哈哈哈讲义"));
        for (int i = 0; i < books.size(); i++)
        {
            System.out.println(books.get(i));
        }
        books.remove(2);
        System.out.println(books);
        System.out.println(books.indexOf(new String("疯狂哈哈哈讲义")));
        books.set(1, new String("哈哈哈哈哈哈"));
        System.out.println(books);
        System.out.println(books.subList(1, 2));

    }
}

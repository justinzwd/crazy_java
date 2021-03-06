package chapter8;

import java.util.ArrayList;
import java.util.List;

public class ListTest3
{

    public static void main(String[] args)
    {
        List books = new ArrayList();
        books.add(new String("轻量级JavaEE"));
        books.add(new String("疯狂JavaEE"));
        books.add(new String("轻量级哈哈哈"));
        books.add(new String("轻量级好吧"));
        books.sort((o1, o2) -> (((String) o1).length() - ((String) o2).length()));
        System.out.println(books);
        books.replaceAll(ele -> ((String) ele).length());
        System.out.println(books);
    }
}

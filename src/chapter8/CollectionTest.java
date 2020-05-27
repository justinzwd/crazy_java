package chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest
{

    public static void main(String[] args)
    {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        System.out.println("C集合的元素个数为" + c.size());
        c.remove(6);
        System.out.println("C集合的元素个数为" + c.size());
        System.out.println(c.contains("孙悟空"));
        c.add("Java EE");
        System.out.println(c);

        Collection books = new HashSet();
        books.add("Java EE");
        books.add("疯狂Java讲义");
        System.out.println(c.containsAll(books));
        c.removeAll(books);
        System.out.println(c);

        c.clear();
        System.out.println(c);
        books.retainAll(c);
        System.out.println("books集合的元素" + books);
    }
}

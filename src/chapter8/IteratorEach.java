package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorEach
{

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");

        Iterator it = books.iterator();

        it.forEachRemaining(obj -> System.out.println("迭代集合的元素：" + obj));
    }
}

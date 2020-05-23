package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest
{

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");

        Iterator it = books.iterator();
        while(it.hasNext())
        {
            String book = (String) it.next();
            System.out.println(book);
            if(book == "JAVA")
            {
                it.remove();
            }

            book = "nihao";
        }

        System.out.println(books);
    }
}

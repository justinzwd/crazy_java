package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class ForEachTest
{

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");

        for (Object obj : books)
        {
            String book = (String) obj;
            System.out.println(book);
            if (book.equals("JAVA"))
            {
                System.out.println("wow! it's JAVA!");
            }
        }
    }
}

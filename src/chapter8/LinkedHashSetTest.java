package chapter8;

import java.util.LinkedHashSet;

public class LinkedHashSetTest
{

    public static void main(String[] args)
    {
        LinkedHashSet books = new LinkedHashSet();
        books.add("java");
        books.add("linked");
        System.out.println(books);
        books.remove("java");
        books.add("java");
        System.out.println(books);
    }

}

package chapter8;

import java.util.Collection;
import java.util.HashSet;

public class PredicateTest
{

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");
        books.add("hsiuihquefhuewfhuwe");
        books.add("dddfd");
        books.add("ofhwuifhqugfhrueghrughugequrghqug");

        books.removeIf(ele -> ((String) ele).length() < 10);
        System.out.println(books);
    }
}

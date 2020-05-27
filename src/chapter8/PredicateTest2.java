package chapter8;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

public class PredicateTest2
{

    public static int calAll(Collection c, Predicate p)
    {
        int total = 0;
        for (Object obj : c)
        {
            if (p.test(obj))
            {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args)
    {
        Collection books = new HashSet();
        books.add("轻量级");
        books.add("JAVA");
        books.add("疯狂");
        books.add("hsiuihquefhuewfhuwe");
        books.add("dddfd");
        books.add("ofhwuifhqugfhrueghrughugequrghqug");

        System.out.println(calAll(books, ele -> ((String) ele).length() < 10));
        System.out.println(calAll(books, ele -> ((String) ele).contains("J")));
        System.out.println(calAll(books, ele -> ((String) ele).contains("轻")));
    }
}

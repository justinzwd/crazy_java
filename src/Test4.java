import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("nihao");
        list.add("haha");
        list.add("jiushi");

        int size = list.size();
        System.out.println("size = " + size);
        //for (int i = 0; i < size; i++) {
        //    System.out.println("size = " + size);
        //    System.out.println(list.get(i));
        //    list.remove(i);
        //}

        Iterator iterator = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}

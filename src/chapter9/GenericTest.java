package chapter9;

import java.util.ArrayList;
import java.util.List;

public class GenericTest
{

    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<String>();
        strList.add("uhfuewfhwufhufh");
        strList.add("你好");
        //strList.add(6);
        strList.forEach(str -> System.out.println(str.length()));

    }
}

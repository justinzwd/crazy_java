package chapter8;

import java.util.HashMap;
import java.util.Map;

public class MapTest
{

    public static void main(String[] args)
    {
        Map map = new HashMap();
        map.put("疯狂Java讲义", 109);
        map.put("疯狂iOS讲义", 10);
        map.put("疯狂Ajax讲义", 79);
        map.put("轻量级Java EE企业应用实战", 109);

        System.out.println(map.put("疯狂iOS讲义",99));
        System.out.println(map);
        System.out.println(map.containsKey("疯狂iOS讲义"));
        System.out.println(map.containsValue(99));
        for (Object key : map.keySet())
        {
            System.out.println(key + "-->" + map.get(key));
        }

        map.remove("疯狂Ajax讲义");
        System.out.println(map);

    }

}

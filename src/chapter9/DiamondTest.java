package chapter9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondTest
{

    public static void main(String[] args)
    {
        Map<String, List<String>> schoolInfo = new HashMap<>();
        List<String> school = new ArrayList<>();

        school.add("hahhhhh");
        school.add("nihaoa");

        schoolInfo.put("孙悟空", school);

        schoolInfo.forEach((key,value) -> System.out.println(key + "--->" + value));
    }
}

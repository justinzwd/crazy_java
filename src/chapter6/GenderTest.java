package chapter6;

import sun.security.x509.GeneralName;

public class GenderTest
{

    public static void main(String[] args)
    {
        Gender g = Enum.valueOf(Gender.class, "FEMALE");
        g.name = "女生";
        System.out.println(g + "代表：" + g.name);
    }
}

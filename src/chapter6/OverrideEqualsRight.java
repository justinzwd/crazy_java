package chapter6;

class P
{

    private String name;
    private String idStr;

    public P()
    {
    }

    public P(String name, String idStr)
    {
        this.name = name;
        this.idStr = idStr;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getIdStr()
    {
        return idStr;
    }

    public void setIdStr(String idStr)
    {
        this.idStr = idStr;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        else
        {
            if (obj != null & obj.getClass() == P.class)
            {
                P p = (P) obj;
                if (((P) obj).getIdStr() == this.getIdStr())
                {
                    return true;
                }
            }
        }
        return false;
    }
}

public class OverrideEqualsRight
{

    public static void main(String[] args)
    {
        P p1 = new P("nihao", "112233");
        P p2 = new P("nihao", "123");
        P p3 = new P("hhhh", "112233");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}

package com.man.kmp;

public class ViolenceMatch
{

    public static void main(String[] args)
    {
        String str1 = "abcdefg";
        String str2 = "bcd";
        int index = violenceMatch(str1,str2);
        System.out.println("index = " + index);
    }

    public static int violenceMatch(String str1, String str2)
    {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        int len1 = str1.length();
        int len2 = str2.length();

        int i = 0, j = 0;

        while(i<len1 && j<len2)
        {
            if (chars1[i] == chars2[j])
            {
                i++;
                j++;
            }
            else
            {
                i = i - (j - 1);
                j = 0;
            }
        }

        //判断是否匹配成功
        if (j == len2)
        {
            return i - j;
        }
        else
        {
            return -1;
        }

    }

}

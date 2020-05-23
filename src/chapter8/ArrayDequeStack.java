package chapter8;

import java.util.ArrayDeque;

public class ArrayDequeStack
{

    public static void main(String[] args)
    {
        ArrayDeque stack = new ArrayDeque();
        stack.push("疯狂Java讲义");
        stack.push("轻量级");
        stack.push("疯狂哈哈嘿嘿嘿");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

    }

}

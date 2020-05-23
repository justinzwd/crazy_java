package chapter8;

import java.util.stream.IntStream;

public class IntStreamTest
{

    public static void main(String[] args)
    {
        IntStream is = IntStream.builder()
                .add(20)
                .add(13)
                .add(-2)
                .add(18)
                .add(21)
                .add(9)
                .build();

//        System.out.println("is元素的最大值:"+is.max().getAsInt());
//        System.out.println("is元素的最小值:"+is.min().getAsInt());
//        System.out.println("is元素的总和:"+is.sum());
//        System.out.println("is元素的总数:"+is.count());
//        System.out.println("is元素的平均数:"+is.average());
//        System.out.println("is所有元素的平方和是否都大于20:"+is.allMatch(ele->ele * ele > 20));
//        System.out.println("is是否存在元素的平方和大于20:"+is.anyMatch(ele->ele * ele > 20));
//        IntStream newIntStream = is.map(ele -> ele * 2 + 1);
//        is.forEach(System.out::println);
//        newIntStream.forEach(System.out::println);
    }

}

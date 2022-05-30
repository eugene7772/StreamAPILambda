package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","f","d");
        String a = strings.stream()
                .reduce(String::concat)
                .get();
        System.out.println(a);

        Stream<Integer> nums = Stream.of(1,2,3,4,5);
        Integer max = nums.reduce(Integer::sum).get();
        System.out.println(max);

        Boolean b =  ((BiPredicate<String,Integer>) (s,i)->Integer.valueOf(s).equals(i)).test("100",100);
        System.out.println(b);

//flatMap
        //collect
        //lol
    }
}

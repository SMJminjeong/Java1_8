package com.example.java1_8.method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
//        UnaryOperator<String> hi = (s) -> "hi"+s;
        //[1] 메서드 레퍼런스 (static 사용)
        UnaryOperator<String> hi = Greeting::hi;

        //[2] 특정한 인스턴스 메서드 사용해야 한다
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("minjeong"));

        //생성자지만 문자열을 받는 생성자와 받지않는 생성자 두개로 나뉜다.
        //[3] 생성자 사용
        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        //[4] 입력값을 받는 생성자
        Function<String, Greeting> minjeongGreeting
                = Greeting::new;
        Greeting minjeong = minjeongGreeting.apply("minjeong");
        System.out.println(minjeong.getName());

        //[5] 특정
        String[] names = {"minjeong", "whiteship", "toby"};
        /*Arrays.sort(names, new Comparator<String>() {
            //값을 어떤 방식으로 정렬을 할지
            //Comparator = Functional Interface -> 람다를 넣을 수도 있다.
//                                              -> 메서드 레퍼런스 ㅇ
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });*/
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }

}

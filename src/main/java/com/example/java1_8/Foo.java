package com.example.java1_8;


import java.util.function.Function;

public class Foo {
//    public static void main(String[] args) {
//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));
//
//    }
    public static void main(String[] args) {
        Function<Integer, Integer> plus10 = (number) -> number+10;
        Function<Integer, Integer> multiply2 = (number) -> number*2;
        System.out.println(multiply2.apply(1));

        //두 함수 조합
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2)); //14
        //compose가 입력값을 가지고 뒤에 오는 함수에 적용
        //결과값을 plus10의 입력값으로 적용
        //값 -> *2 -> *2의 값 -> +10 -> 결과값

        plus10.andThen(multiply2);

    }
}

package com.example.java1_8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Lamda {
    public static void main(String[] args) {
        Supplier<Integer> get10 = () -> { //body 한줄일 경우 생략 가능
            return 10;
        };

//        BiFunction<Integer, Integer, Integer> get10 = () -> 10;
        BinaryOperator<Integer> sum = (a,b) -> a+b;
        // 타입을 적어줘도 된다. -> 생략해도 된다.
//        BinaryOperator<Integer> sum = (Integer a, Integer b) -> a+b;
    }
}

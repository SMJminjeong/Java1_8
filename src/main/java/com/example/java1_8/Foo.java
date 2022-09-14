package com.example.java1_8;


import java.util.function.*;

public class Foo {
    /*  1. Function 은 입력값을 하나만 받는다.
        2. BiFunction<T,U,R> 은 값을 두개를 받아 return한다.
        3. Consumer<T> 는 return 없이 받기만 한다.
        4. Supplier<T> 는 무엇인가를 가져오는 함수 인터페이스이다.
        5. Predicate<T> 는 인자를 받아 true/false를 리턴해준다.
        6. UnaryOperator 입력/결과 값의 type이 동일할때 사용된다.
    */
    public static void main(String[] args) {

//        Plus10 plus10 = new Plus10();
//        System.out.println(plus10.apply(1));

        //[1] Function : 함수 하나만 사용
        Function<Integer, Integer> plus10 = (number) -> number+10;
        Function<Integer, Integer> multiply2 = (number) -> number*2;
        System.out.println(multiply2.apply(1));

        //[6] UnaryOperator : 입력값이 결과값이랑 type이 같을 때
        UnaryOperator<Integer> plus1 = (number) -> number+10;

        //[2] 두 함수 조합
        //[2-1] compose : 뒤의 값을 가져와서 앞에 적용
        //compose가 입력값을 가지고 뒤에 오는 함수에 적용
        //결과값을 plus10의 입력값으로 적용
        //값 -> *2 -> *2의 값 -> +10 -> 결과값
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2)); //14
        //[2-2] andThen : 뒤에 적용
        //plus10 에 가고 결과값이 이어서 multiply2에 들어가게 된다
        System.out.println(plus10.andThen(multiply2).apply(2));

        //[3] Consumer : return이 없음
        Consumer<Integer> printT = (number) -> System.out.println(number);
        printT.accept(10);

        //[4] Supplier : 어떠한 값을 가져올것이냐
        //인자가 없기 때문에 람다표현식에 값을 넣어줄 필요가 없다
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        //[5] Predicate : true/false를 return해주는 함수 인터페이스
        Predicate<String> startsWithMinjeong = (String) -> String.startsWith("Minjeong");
        //조합도 가능
//        startsWithMinjeong.or()

        Predicate<Integer> isOdd = (number) -> number%2 == 0;

    }
}

package com.example.java1_8;


//8이전에는 인터페이스의 구현체를 만들어서 사용
public class Foo {
    public static void main(String[] args) {
        //final 이라고 가정하고 사용하는 것
//        int baseNumber = 10;

        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;
            @Override
            public int doIt(int number) {
                return number + baseNumber;
            }
        };

    }
}

package com.example.java1_8;

// 함수형 인터페이스
//@FunctionalInterface를 이용하면 추상메서드가 여러개이면 오류
@FunctionalInterface
public interface RunSomething {
    // 추상 메서드가 하나만 있으면 = 함수형 인터페이스
//    void doIt();
//    abstract void doIt(); abstract 생략한 것

    // 추상 메서드가 두개 있으면 함수형 인터페이스가 아니다.
//    void doItAgain();

    /*
    다른 형태의 메서드가 있어도 functional Interface 이다.
    추상화 메서드가 몇개이냐에 따라 달라지는 것 뿐
     */

/*
    */
/*public*//*
 static void printName(){
        System.out.println("MinJeong");
    }

    default void printAge() {
        System.out.println("25");
    }
*/

    int doIt(int number);



}

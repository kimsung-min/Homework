package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {
        /*
        * 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
        *
        *
        * 변수의 종류
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드)w
        * 4. 클래스(static)변수
        *
        * 지역변수는 선언한 메소드 블럭내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이때 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달인자를 받기 위해
        * 선언하는 변수를 매개변수(parameter)라고 부른다.
        * */
        Application3 app3 = new Application3();

        /*
        * !!! 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형과, 갯수, 순서가 일치하게 값을 넣어 호출해야한다. !!!
        * */
        app3.testMethod(40);
//        app3.testMethod("40");   // 매개변수는 int형이지만 인자가 String형이기 때문에 호출할 수 없다.
//        app3.testMethod(20, 30, 40);  // 매개변수는 int형 1개 이지만 인자는 3개이기 때문에 호출할 수 없다.
//        app3.testMethod();    // 매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출 할 수 없다.

        /* 변수에 저장한 값 전달 테스트 */
        /* 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
        int age = 20;
        app3.testMethod(age);

        /* 자동형변환을 이용하여 값 전달을 할 수 있다.*/
        byte byteAge = 10;
        app3.testMethod(byteAge);

        /* 강제형변환을 이용해서 값 전달을 할 수 있다. */
        long longAge = 80;
        app3.testMethod((int) longAge);

        /* 연산 결과를 이용해서 값 전달을 할 수 있다. */
        app3.testMethod(age * 3);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}

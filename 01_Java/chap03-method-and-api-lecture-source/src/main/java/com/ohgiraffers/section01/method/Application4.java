package com.ohgiraffers.section01.method;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.testMethod("홍길동", 20, '남');
//        app4.testMethod(20, "유관순", '여'); // 값의 갯수는 맞지만 순서가 다르게 전달되면 호출하지 못한다.

        /* 변수에 저장된 값을 전달하며 호출 할 수 있다. */
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name, age, gender);
    }


    public void testMethod(String name, int age, final char gender) {
        /*
        * 매개변수도 일종의 지역변수로 분류된다.
        * */
        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gender + "입니다.");
    }
}

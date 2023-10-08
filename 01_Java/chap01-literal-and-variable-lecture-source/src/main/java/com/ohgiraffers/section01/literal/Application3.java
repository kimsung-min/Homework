package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args){

        System.out.println("============ 두 개의 문자열 합치기 ================");
        System.out.println(9 + 9);   // 18
        System.out.println("9" + 9); // 99
        System.out.println(9 + "9"); // 99
        System.out.println("9" + "9"); // 99

        System.out.println("============ 세 개의 문자열 합치기 ================");
        System.out.println(9 + 9 + "9");  // 189  // '+' 연산 방향은 왼쪽에서 오른쪽이다.
        System.out.println(9 + "9" + 9);  // 999
        System.out.println("9" + 9 + 9); // 999

        System.out.println("" + 1 + 2);

        System.out.println("9" + (9 + 9)); // 918

        System.out.println("========== 10과 20의 사칙연산 결과 =============");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);

        System.out.println("========== 10과 20의 사칙연산 결과 보기 좋게 출력 =============");
        System.out.println("10 + 20 = " + (10 + 20));
        System.out.println("10 - 20 = " + (10 - 20));
        System.out.println("10 * 20 = " + (10 * 20));
        System.out.println("10 / 20 = " + (10 / 20));
        System.out.println("10 % 20 = " + (10 % 20));
    }
}

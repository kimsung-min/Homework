package com.ohgiraffers.section03.increment;

public class Application1 {

    /* 증감연산자에 대한 이해 (눈여겨보기) 
    * 
    * 증감연산자
    * 피연산자 앞 or 뒤에 사용이가능하다.
    * '++' : 1증가의 의미
    * '--' : 1감소의 의미
    * */
    public static void main(String[] args) {

        int num = 20;

        num++; // 1증가
        System.out.println("num : " + num);

        ++num;  // 1증가
        System.out.println("num : " + num);

        num--;
        System.out.println("num : " + num);

        --num;
        System.out.println("num : " + num);

        /* 증감연산자를 다른 연산자와 함께 사용 */
        int firstNum = 20;

        int result1 = firstNum++ * 3;  // 다른 연산을 먼저 처리하고 난 뒤 마지막에 증가 처리

        System.out.println("result1 : " +result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;  // 증가를 먼저 처리하고 난 뒤 다른 연산을 처리

        System.out.println("result2 : " +result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);
        System.out.println("num1 : " + num1);

        System.out.println("=============================================================");
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++);  // a: 10(11), b: 20, c: 30

        System.out.println((++a) + (b++));  // 12(12) + 20(21)

        System.out.println((a++) + (--b) + (--c)); // 12(13) + 20(20) + 29(29)

        System.out.println(a + " " + b + " " + c);
    }
}

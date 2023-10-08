package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args){

        // 목표. 변수를 선언하고 할당해서 사용할 수 있다.
        /*
        * 변수를 사용하는 방법
        *   1. 변수를 준비한다(선언)
        *   2. 변수에 값을 대입한다(값 대입 및 초기화)
        *   3. 변수를 사용한다.
        *
        *
        * 자료형이란?
        * 다양한 값의 형태별로 어느정도 크기를 하나의 값으로 취급할 것인지 미리 compiler와 약속한 키워드
        *
        * 기본자료형(Primary type) 과 참조자료형(Reference type)으로 나눠진다.
        * */

        /* 정수를 취급하는 자료형은 4가지가 있다. */
        byte bnum;   // 1byte      // 자료형타입 변수명;
        short snum;  // 2byte
        int inum;    // 4byte
        long lnum;  // 8byte

        /* 실수를 취급하는 자료형은 2가지가 있다.*/
        float fnum;  // 4byte
        double dnum; // 8byte

        /* 문자를 취급하는 자료형은 한가지가 있다.*/
        char ch;    // 2byte
        char ch2;

        /* 논리값을 취급하는 자료형은 한가지가 있다.*/
        boolean isTrue;   // 1byte

        /* 이상의 8가지를 기본자료형이라고함 */

        String str;   // 참조자료형 : 참조자료형은 정해진 크기는 없지만 엄밀히 말하면 주소값을 다루기 때문에 대략 4byte정도로 생각하면된다.


        // 변수에 값을 대입하기(값 대입 및 초기화)
        bnum = 1;
        snum = 2;
        inum = 4;  // 기본값
        lnum = 8L;  // long타입이다. 아무 문제 없는 것같지만 사실 뒤에 l또는 L 을 붙여야 한다.
                    // 소문자 'l'을 써도 되지만 글꼴에 따라서 숫자 1과 혼선을 빚을 수 있어서 대문자를 권장한다.

//        fnum = 4.0; // 실수형태의 값을 fnum에 사용하는 것은 불가능하다. 대입연산자를 기준으로 왼쪽과 오른쪽은 동일한 자료형 타입이어야한다.
        fnum = 4.0f; // 실수 뒤에 'f', 'F'를 붙여야한다. 일반적으로는 소문자를 사용한다.
        dnum = 8.0;

        /* 문자를 취급하는 자료형에 값 대입 */
        ch = 'a';   // 문자 형태의 값을 저장할 수 있다.
        ch2 = 97;  // 'a'는 97이라는 숫자였다 그래서 숫자로도 저장할 수 있다.

        isTrue = true;
        isTrue = false; // true혹은 false 중 한 가지의 값만 사용 가능하다.

        str = "안녕하세요";

        /* 선언과 동시에 초기화 한다. */
        int point = 100;
        int bonus = 10;

        System.out.println("====== 변수에 저장된 값 출력 ===========");
        System.out.println("포인트와 보너스의 합은 ? " + (point + bonus));

        /*
        * 정리
        * 대입연산자(=)을 기준으로 왼쪽과 오른쪽의 자료형 타입은 같아야 한다
        * 대입연산자의 왼쪽은 공간을 의미하고, 오른쪽은 값을 의미한다.
        * */
    }
}
























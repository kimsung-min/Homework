package com.ohgiraffers.section02.package_and_import;


//import com.ohgiraffers.section01.method.Calculator;
import com.ohgiraffers.section01.method.*;
/* static import의 경우 사용하려는 static method까지 전부 써줘야한다. */
//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf2;

import java.util.Date;

import static com.ohgiraffers.section01.method.Calculator.*;
public class Application2 {

    public static void main(String[] args) {

        /*
        * 임포트(import)란?
        *   서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야한다.
        *   하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        *   그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import구문이다.
        *
        *   import는 package 선언문과 class 선언문 사이에 작성하여
        *   어떻나 패키지 내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
        * */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);

        System.out.println("50과 60 중 더 작은 값은 : " + min);

        int max = Calculator.maxNumberOf(50, 60);

        System.out.println("50과 60 중 더 큰 값은 : " + max);

        /* static 메소드를 호출 할 때 클래스명도 생략 (import static) */
        int max2 = maxNumberOf(50, 60);

        int max3 = maxNumberOf2(50, 60);

        /*
         * 클래스명은 같은데 패키지가 다른 클래스를 선언하려면 하나는 import 구문을 작성하고
         * 다른 곳은 풀패키지명을 기입해서 구분을 해주면된다.
         */
        Date date = new Date();

        java.sql.Date date2 = new java.sql.Date(date.getTime());

        /*
        * 어디에서도 명시적으로 import구문을 작성하지않아도 안에 클래스를 사용할 수 있는 패키지가 있는데
        * java.lang 패키지가 이에 해당한다.
        * */

    }
}

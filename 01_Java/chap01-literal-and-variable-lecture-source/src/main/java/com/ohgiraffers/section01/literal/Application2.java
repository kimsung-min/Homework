package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args) {

        /* 숫자와 숫자의 연산 */
        /* 정수와 정수의 연산 */
        /* -> 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산(mod)를 사용할 수 있다. */
        System.out.println("================== 정수와 정수의 연산 ===================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);  // 곱하기 
        System.out.println(123 / 10);  // 나누기 한 후 몫을 반환 
        System.out.println(123 % 10);  // 나누기 한 후 나머지를 반환
        
        System.out.println("================== 실수와 실수의 연산 ===================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);

        /* 정수와 실수의 연산은 사칙연산 및 나머지 연산이 가능하다.
        *  정수와 실수의 연산의 결과는 항상 실수가 나온다. <- 잘기억해주시길..
        * */
        System.out.println("================== 정수와 실수의 연산 ===================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);


        /* 문자의 연산 */
        /* 문자와 문자의 연산 */
        System.out.println("================== 문자와 문자의 연산 ===================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("================== 문자와 정수의 연산 ===================");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 1);
        System.out.println('a' / 1);
        System.out.println('a' % 1);

        System.out.println("================== 문자와 실수의 연산 ===================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 1.0);
        System.out.println('a' / 1.0);
        System.out.println('a' % 1.0);

        /* 문자열의 연산
        * -> 문자열의 연산은 '+' 연산결과는 문자열 합치기(이어 붙이기)가 된다.
        *   다른 연산은 사용하지 못한다.
        * */
        System.out.println("================== 문자열과 문자열의 연산 ===================");
        System.out.println("hello" + " world");
//        System.out.println("hello" - " world");  // 에러 발생
//        System.out.println("hello" * " world");  // 에러 발생
//        System.out.println("hello" / " world");  // 에러 발생
//        System.out.println("hello" % " world");  // 에러 발생

        System.out.println("================== 문자열과 다른 형태의 연산 ===================");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);

        /* 논리값 연산 */
        /* 논리값 끼리의 연산은 모든 연산자 사용이 불가능하다.*/
//        System.out.println(true % true);   // 에러발생

        /* 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true % 1);

        /* 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
//        System.out.println(true % 1.0);  // 에러발생

        /* 논리값과 문자의 연산은 모든 연산자 사용이 불가능하다.
        * 이유는 문자는 내부적으로 숫자취급을 하기 때문에 결국 논리값과 숫자의 연산과 동일한 의미를 가진다.
        * */
//        System.out.println(true % 'a');

        /* 논리값과 문자열의 연산은 '+'연산만 가능
        * --> 문자열 합치기가 되는 원리와 동일
        * */
        System.out.println(true + "a");    // 문자열 합치기 된다.
//        System.out.println(true - "a");
//        System.out.println(true * "a");
//        System.out.println(true / "a");
//        System.out.println(true % "a");
    }
}

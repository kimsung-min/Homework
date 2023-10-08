package com.ohgiraffers.section01.literal;

public class Application1 {

    public static void main(String[] args){

        // 한줄 주석 (주석으로 쓴 내용은 컴파일시에 제외된다.)
        /*
         *  여러 줄 주석입니다.
         *  여러줄을 쓸수 있어요
         * */

        // main메소드를 생성
        // main메소드는 모든 클래스에 단 하나만 생성할 수 있다.
        // 코드 실행의 맨처음 실행되는 메소드이다.
        System.out.print("안녕하세요 ");
        System.out.print(123);
        System.out.println();
        System.out.println("안녕하세요");
        System.out.println(123);
        
        // 여러가지 값의 형태를 출력하기
        /* 1. 숫자 형태의 값*/
        /* 정수 형태의 값 출력 */
        System.out.println(123);
        /* 실수 형태의 값 출력 */
        System.out.println(1.23);

        /* 문자 형태의 값 출력 */
        System.out.println('a');   // 문자 형태의 값은 홑따옴표(single-quotation)으로 감싸주어야 한다.
//        System.out.println('ab');  // 두 개 이상은 문자로 취급하지 않기 때문에 에러가 발생한다.
//        System.out.println('');  // 아무 것도 기록되지 않는 경우도 에러가 발생
        System.out.println('1');  // 숫자 값이지만 홑따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
        
        /* 문자열 형태의 값 출력 */
        System.out.println("안녕하세요"); // 문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸준다.
        System.out.println("123");      // 정수 이지만 쌍따옴표로 감싸져있기 떄문에 문자열로 봐야한다.
        System.out.println("");         // 아무 것도 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");        // 한 개 문자도 쌍따옴표로 감싸면 문자열이다(문자 a와는 다르다)

        /* 논리 형태의 값 출력 */
        System.out.println(true);
        System.out.println(false); // true 혹은 false값을 논리형이라고한다.
    }
}
